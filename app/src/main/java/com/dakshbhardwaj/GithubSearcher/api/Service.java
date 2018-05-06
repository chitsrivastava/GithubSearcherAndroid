package com.dakshbhardwaj.GithubSearcher.api;

import com.dakshbhardwaj.GithubSearcher.SharedData;
import com.dakshbhardwaj.GithubSearcher.model.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;


public interface Service {
    SharedData data = new SharedData();
     String getLanguage=data.Lang;
     String getLocation=data.Loc;
     String url2="+location:";
   String url="search/users?q=language:".concat(getLanguage).concat(url2).concat(getLocation);
     String furl="search/users?q=language:";
    String curl=url;
    @GET
    Call<ItemResponse> getItems(
            @Url String url
    );

}
