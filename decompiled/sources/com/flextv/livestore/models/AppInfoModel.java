package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class AppInfoModel implements java.io.Serializable {

    @com.google.gson.annotations.SerializedName("apk_link")
    private java.lang.String apk_link;

    @com.google.gson.annotations.SerializedName("app_version")
    private java.lang.String app_version;

    @com.google.gson.annotations.SerializedName("device_key")
    private java.lang.String device_key;

    @com.google.gson.annotations.SerializedName("expire_date")
    private java.lang.String expiredDate;

    @com.google.gson.annotations.SerializedName("home_url1")
    private java.lang.String home_url1;

    @com.google.gson.annotations.SerializedName("home_url2")
    private java.lang.String home_url2;
    private boolean is_google_pay;

    @com.google.gson.annotations.SerializedName("is_trial")
    private int is_trial;

    @com.google.gson.annotations.SerializedName("languages")
    private java.util.List<com.flextv.livestore.models.LanguageModel> languageModels;

    @com.google.gson.annotations.SerializedName("lock")
    private int lock;

    @com.google.gson.annotations.SerializedName("mac_address")
    private java.lang.String mac_address;

    @com.google.gson.annotations.SerializedName("note_content")
    private java.lang.String note_content;

    @com.google.gson.annotations.SerializedName("note_title")
    private java.lang.String note_title;

    @com.google.gson.annotations.SerializedName("parent_control")
    private java.lang.String parent_control;

    @com.google.gson.annotations.SerializedName("parent_synced")
    private int parent_synced;

    @com.google.gson.annotations.SerializedName("pin")
    private java.lang.String pin_code;

    @com.google.gson.annotations.SerializedName("plan_id")
    private java.lang.String plan_id;

    @com.google.gson.annotations.SerializedName("price")
    private java.lang.String price;

    @com.google.gson.annotations.SerializedName("qr_url")
    private java.lang.String qr_url;

    @com.google.gson.annotations.SerializedName("qr_url_short")
    private java.lang.String qr_url_short;

    @com.google.gson.annotations.SerializedName("urls")
    private java.util.List<com.flextv.livestore.models.AppInfoModel.UrlModel> result;

    @com.google.gson.annotations.SerializedName("mac_registered")
    private boolean success;

    @com.google.gson.annotations.SerializedName("theme")
    private java.lang.String theme;

    public static class UrlModel implements java.io.Serializable {

        @com.google.gson.annotations.SerializedName("id")
        private java.lang.String id;

        @com.google.gson.annotations.SerializedName("is_protected")
        private java.lang.String is_protected;

        @com.google.gson.annotations.SerializedName("name")
        private java.lang.String name;

        @com.google.gson.annotations.SerializedName("type")
        private java.lang.String type;

        @com.google.gson.annotations.SerializedName("url")
        private java.lang.String url;

        public UrlModel() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getId() {
                r1 = this;
                java.lang.String r0 = r1.id
                return r0
        }

        public java.lang.String getIs_protected() {
                r1 = this;
                java.lang.String r0 = r1.is_protected
                if (r0 != 0) goto L6
                java.lang.String r0 = "0"
            L6:
                return r0
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public java.lang.String getType() {
                r1 = this;
                java.lang.String r0 = r1.type
                return r0
        }

        public java.lang.String getUrl() {
                r1 = this;
                java.lang.String r0 = r1.url
                if (r0 != 0) goto L6
                java.lang.String r0 = ""
            L6:
                return r0
        }

        public void setId(java.lang.String r1) {
                r0 = this;
                r0.id = r1
                return
        }

        public void setName(java.lang.String r1) {
                r0 = this;
                r0.name = r1
                return
        }

        public void setType(java.lang.String r1) {
                r0 = this;
                r0.type = r1
                return
        }

        public void setUrl(java.lang.String r1) {
                r0 = this;
                r0.url = r1
                return
        }
    }

    public AppInfoModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.lang.String getApk_link() {
            r1 = this;
            java.lang.String r0 = r1.apk_link
            return r0
    }

    public java.lang.String getApp_version() {
            r1 = this;
            java.lang.String r0 = r1.app_version
            if (r0 != 0) goto L6
            java.lang.String r0 = "1.0"
        L6:
            return r0
    }

    public java.lang.String getDevice_key() {
            r1 = this;
            java.lang.String r0 = r1.device_key
            return r0
    }

    public java.lang.String getExpiredDate() {
            r1 = this;
            java.lang.String r0 = r1.expiredDate
            if (r0 != 0) goto L6
            java.lang.String r0 = ""
        L6:
            return r0
    }

    public java.lang.String getHome_url1() {
            r1 = this;
            java.lang.String r0 = r1.home_url1
            return r0
    }

    public java.lang.String getHome_url2() {
            r1 = this;
            java.lang.String r0 = r1.home_url2
            return r0
    }

    public int getIs_trial() {
            r1 = this;
            int r0 = r1.is_trial
            return r0
    }

    public java.util.List<com.flextv.livestore.models.LanguageModel> getLanguageModels() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.LanguageModel> r0 = r1.languageModels
            if (r0 != 0) goto L9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            return r0
    }

    public int getLock() {
            r1 = this;
            int r0 = r1.lock
            return r0
    }

    public java.lang.String getMac_address() {
            r1 = this;
            java.lang.String r0 = r1.mac_address
            return r0
    }

    public java.lang.String getNote_content() {
            r1 = this;
            java.lang.String r0 = r1.note_content
            return r0
    }

    public java.lang.String getNote_title() {
            r1 = this;
            java.lang.String r0 = r1.note_title
            return r0
    }

    public java.lang.String getParent_control() {
            r1 = this;
            java.lang.String r0 = r1.parent_control
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            java.lang.String r0 = r1.parent_control
            return r0
        Le:
            java.lang.String r0 = "0000"
            return r0
    }

    public int getParent_synced() {
            r1 = this;
            int r0 = r1.parent_synced
            return r0
    }

    public java.lang.String getPin_code() {
            r1 = this;
            java.lang.String r0 = r1.pin_code
            if (r0 != 0) goto L6
            java.lang.String r0 = "0000"
        L6:
            return r0
    }

    public java.lang.String getPlan_id() {
            r1 = this;
            java.lang.String r0 = r1.plan_id
            return r0
    }

    public java.lang.String getPrice() {
            r1 = this;
            java.lang.String r0 = r1.price
            if (r0 == 0) goto Le
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lb
            goto Le
        Lb:
            java.lang.String r0 = r1.price
            goto L10
        Le:
            java.lang.String r0 = "7.9"
        L10:
            return r0
    }

    public java.lang.String getQr_url() {
            r1 = this;
            java.lang.String r0 = r1.qr_url
            return r0
    }

    public java.lang.String getQr_url_short() {
            r1 = this;
            java.lang.String r0 = r1.qr_url_short
            return r0
    }

    public java.util.List<com.flextv.livestore.models.AppInfoModel.UrlModel> getResult() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.AppInfoModel$UrlModel> r0 = r1.result
            if (r0 != 0) goto L9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            return r0
    }

    public boolean getSuccess() {
            r1 = this;
            boolean r0 = r1.success
            return r0
    }

    public java.lang.String getTheme() {
            r1 = this;
            java.lang.String r0 = r1.theme
            return r0
    }

    public boolean isIs_google_pay() {
            r1 = this;
            boolean r0 = r1.is_google_pay
            return r0
    }

    public void setExpiredDate(java.lang.String r1) {
            r0 = this;
            r0.expiredDate = r1
            return
    }

    public void setIs_google_pay(boolean r1) {
            r0 = this;
            r0.is_google_pay = r1
            return
    }

    public void setIs_trial(int r1) {
            r0 = this;
            r0.is_trial = r1
            return
    }

    public void setLanguageModels(java.util.List<com.flextv.livestore.models.LanguageModel> r1) {
            r0 = this;
            r0.languageModels = r1
            return
    }

    public void setLock(int r1) {
            r0 = this;
            r0.lock = r1
            return
    }

    public void setPin_code(java.lang.String r1) {
            r0 = this;
            r0.pin_code = r1
            return
    }

    public void setResult(java.util.List<com.flextv.livestore.models.AppInfoModel.UrlModel> r1) {
            r0 = this;
            r0.result = r1
            return
    }
}
