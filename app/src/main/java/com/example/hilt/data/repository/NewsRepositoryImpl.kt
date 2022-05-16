package com.example.hilt.data.repository

import com.example.hilt.data.model.APIResponse
import com.example.hilt.data.model.Article
import com.example.hilt.data.repository.datasource.NewsRemoteDataSource
import com.example.hilt.data.util.Resource
import com.example.hilt.domain.repository.NewsRepository
import kotlinx.coroutines.flow.Flow
import retrofit2.Response

class NewsRepositoryImpl(private val newsRemoteDataSource: NewsRemoteDataSource): NewsRepository {
    override suspend fun getNewsHeadlines(country: String, page: Int): Resource<APIResponse> {
        return responseToResource(newsRemoteDataSource.getTopHeadlines(country, page))
    }

    private fun responseToResource(response: Response<APIResponse>): Resource<APIResponse>{
        if(response.isSuccessful){
            response.body()?.let { result ->
                return Resource.Success(result)
            }
        }
        return Resource.Error(response.message())
    }

    override suspend fun getSearchedNews(searchQuery: String): Resource<APIResponse> {
        TODO("Not yet implemented")
    }

    override suspend fun saveNews(article: Article) {
        TODO("Not yet implemented")
    }

    override suspend fun deleteNews(article: Article) {
        TODO("Not yet implemented")
    }

    override fun getSavedNews(): Flow<List<Article>> {
        TODO("Not yet implemented")
    }
}