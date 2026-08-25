package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class SubTitleUserModel implements java.io.Serializable {

    @com.google.gson.annotations.SerializedName("status")
    public int status;

    @com.google.gson.annotations.SerializedName("token")
    public java.lang.String token;

    @com.google.gson.annotations.SerializedName("user")
    public com.flextv.livestore.models.SubTitleUserModel.UserModel userModel;

    public static class UserModel implements java.io.Serializable {

        @com.google.gson.annotations.SerializedName("allowed_downloads")
        public int allowed_downloads;

        @com.google.gson.annotations.SerializedName("allowed_translations")
        public int allowed_translations;

        @com.google.gson.annotations.SerializedName("ext_installed")
        public boolean ext_installed;

        @com.google.gson.annotations.SerializedName("level")
        public java.lang.String level;

        @com.google.gson.annotations.SerializedName("remaining_downloads")
        public int remaining_downloads;

        @com.google.gson.annotations.SerializedName("vip")
        public boolean vip;

        public UserModel() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getAllowed_downloads() {
                r1 = this;
                int r0 = r1.allowed_downloads
                return r0
        }

        public int getAllowed_translations() {
                r1 = this;
                int r0 = r1.allowed_translations
                return r0
        }

        public java.lang.String getLevel() {
                r1 = this;
                java.lang.String r0 = r1.level
                return r0
        }

        public int getRemaining_downloads() {
                r1 = this;
                int r0 = r1.remaining_downloads
                return r0
        }

        public boolean isExt_installed() {
                r1 = this;
                boolean r0 = r1.ext_installed
                return r0
        }

        public boolean isVip() {
                r1 = this;
                boolean r0 = r1.vip
                return r0
        }
    }

    public SubTitleUserModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public int getStatus() {
            r1 = this;
            int r0 = r1.status
            return r0
    }

    public java.lang.String getToken() {
            r1 = this;
            java.lang.String r0 = r1.token
            return r0
    }

    public com.flextv.livestore.models.SubTitleUserModel.UserModel getUserModel() {
            r1 = this;
            com.flextv.livestore.models.SubTitleUserModel$UserModel r0 = r1.userModel
            return r0
    }
}
