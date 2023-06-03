package com.example.springTest.dto;

import lombok.Data;

@Data
public class SearchElement {

    // 記事検索キーワード
    private String searchWordArticle;

    // // コメント検索キーワード
    // private String searchWordComment;

    // // コメント投稿者検索キーワード
    // private String searchWordCommentUser;

    // 記事ソートフラグ
    private boolean sortFlg = true;

    // 他サイトフラグ
    private boolean otherSiteFlg = true;

  }
  