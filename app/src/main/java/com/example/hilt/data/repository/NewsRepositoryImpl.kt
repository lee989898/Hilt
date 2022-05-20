package com.example.hilt.data.repository

import com.example.hilt.data.model.APIResponse
import com.example.hilt.data.model.Article
import com.example.hilt.data.repository.dataSource.NewsLocalDataSource
import com.example.hilt.data.repository.dataSource.NewsRemoteDataSource
import com.example.hilt.data.util.Resource
import com.example.hilt.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepositoryImpl(
    private val newsRemoteDataSource: NewsRemoteDataSource,
    private val newsLocalDataSource: NewsLocalDataSource
    ): NewsRepository {

    override suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse> {
        return responseToResource(newsRemoteDataSource.getTopHeadlines(country, page))
    }

    override suspend fun getSearchedNews(country: String,searchQuery: String,page: Int): Resource<APIResponse> {
        return responseToResource(newsRemoteDataSource.getSearchedNews(country,searchQuery,page))
    }

    override suspend fun saveNews(article: Article) {
        newsLocalDataSource.saveArticleToDB(article)
    }

    override suspend fun deleteNews(article: Article) {
        newsLocalDataSource.deleteArticlesFromDB(article)
    }

    override fun getSavedNews(): Flow<List<Article>> {
        return newsLocalDataSource.getSavedArticles()
    }

    private fun responseToResource(response: Response<APIResponse>): Resource<APIResponse>{
        if(response.isSuccessful){
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }

}