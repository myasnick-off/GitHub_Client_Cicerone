package com.example.githubclient.ui.details

import com.example.githubclient.model.GitHubRepo
import com.example.githubclient.model.GitHubUser
import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType
import moxy.viewstate.strategy.alias.AddToEndSingle
import moxy.viewstate.strategy.alias.Skip

interface DetailsView : MvpView {

    @AddToEndSingle
    fun initUserData(user: GitHubUser)

    @AddToEndSingle
    fun initRepoList()

    @AddToEndSingle
    fun updateRepoList(repos: List<GitHubRepo>)

    @Skip
    fun showError(message: String?)
}