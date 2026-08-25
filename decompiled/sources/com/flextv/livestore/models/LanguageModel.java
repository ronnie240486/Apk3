package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class LanguageModel implements java.io.Serializable {

    @com.google.gson.annotations.SerializedName("code")
    private java.lang.String code;

    @com.google.gson.annotations.SerializedName("id")
    private java.lang.String id;

    @com.google.gson.annotations.SerializedName("name")
    private java.lang.String name;

    @com.google.gson.annotations.SerializedName("words")
    private com.flextv.livestore.models.WordModels wordModels;

    public LanguageModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getCode() {
            r1 = this;
            java.lang.String r0 = r1.code
            return r0
    }

    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.id
            return r0
    }

    public java.lang.String getName() {
            r1 = this;
            java.lang.String r0 = r1.name
            return r0
    }

    public com.flextv.livestore.models.WordModels getWordModel() {
            r1 = this;
            com.flextv.livestore.models.WordModels r0 = r1.wordModels
            return r0
    }
}
