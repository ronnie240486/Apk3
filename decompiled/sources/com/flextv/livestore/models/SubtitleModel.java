package com.flextv.livestore.models;

/* JADX INFO: loaded from: classes.dex */
public class SubtitleModel implements java.io.Serializable {

    @com.google.gson.annotations.SerializedName("data")
    public java.util.List<com.flextv.livestore.models.SubtitleModel.DataModel> dataModels;

    @com.google.gson.annotations.SerializedName("page")
    public int page;

    @com.google.gson.annotations.SerializedName("per_page")
    public int per_page;

    @com.google.gson.annotations.SerializedName("total_count")
    public int total_count;

    @com.google.gson.annotations.SerializedName("total_pages")
    public int total_pages;

    /* JADX INFO: loaded from: classes2.dex */
    public static class AttributesModel implements java.io.Serializable {

        @com.google.gson.annotations.SerializedName("ai_translated")
        public boolean ai_translated;

        @com.google.gson.annotations.SerializedName("comments")
        public java.lang.String comments;

        @com.google.gson.annotations.SerializedName("download_count")
        public int download_count;

        @com.google.gson.annotations.SerializedName("feature_details")
        public com.flextv.livestore.models.SubtitleModel.FeatureDetailModel featureDetailModel;

        @com.google.gson.annotations.SerializedName("files")
        public java.util.List<com.flextv.livestore.models.SubtitleModel.FileModel> fileModels;

        @com.google.gson.annotations.SerializedName("foreign_parts_only")
        public boolean foreign_parts_only;

        @com.google.gson.annotations.SerializedName("fps")
        public float fps;

        @com.google.gson.annotations.SerializedName("from_trusted")
        public boolean from_trusted;

        @com.google.gson.annotations.SerializedName("hd")
        public boolean hd;

        @com.google.gson.annotations.SerializedName("hearing_impaired")
        public boolean hearing_impaired;

        @com.google.gson.annotations.SerializedName("language")
        public java.lang.String language;

        @com.google.gson.annotations.SerializedName("legacy_subtitle_id")
        public java.lang.String legacy_subtitle_id;

        @com.google.gson.annotations.SerializedName("machine_translated")
        public boolean machine_translated;

        @com.google.gson.annotations.SerializedName("new_download_count")
        public int new_download_count;

        @com.google.gson.annotations.SerializedName("ratings")
        public float ratings;

        @com.google.gson.annotations.SerializedName("related_links")
        public java.util.List<com.flextv.livestore.models.SubtitleModel.RelatedLinkModel> relatedLinkModels;

        @com.google.gson.annotations.SerializedName("release")
        public java.lang.String release;

        @com.google.gson.annotations.SerializedName("subtitle_id")
        public java.lang.String subtitle_id;

        @com.google.gson.annotations.SerializedName("upload_date")
        public java.lang.String upload_date;

        @com.google.gson.annotations.SerializedName("uploader")
        public com.flextv.livestore.models.SubtitleModel.UploaderModel uploaderModel;

        @com.google.gson.annotations.SerializedName("url")
        public java.lang.String url;

        public AttributesModel() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.util.List<com.flextv.livestore.models.SubtitleModel.FileModel> getFileModels() {
                r1 = this;
                java.util.List<com.flextv.livestore.models.SubtitleModel$FileModel> r0 = r1.fileModels
                if (r0 != 0) goto L9
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L9:
                return r0
        }

        public java.lang.String getLanguage() {
                r1 = this;
                java.lang.String r0 = r1.language
                return r0
        }

        public java.lang.String getSubtitle_id() {
                r1 = this;
                java.lang.String r0 = r1.subtitle_id
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class DataModel implements java.io.Serializable {

        @com.google.gson.annotations.SerializedName("attributes")
        public com.flextv.livestore.models.SubtitleModel.AttributesModel attributesModel;

        @com.google.gson.annotations.SerializedName("id")
        public java.lang.String id;

        @com.google.gson.annotations.SerializedName("type")
        public java.lang.String type;

        public DataModel() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.flextv.livestore.models.SubtitleModel.AttributesModel getAttributesModel() {
                r1 = this;
                com.flextv.livestore.models.SubtitleModel$AttributesModel r0 = r1.attributesModel
                return r0
        }

        public java.lang.String getId() {
                r1 = this;
                java.lang.String r0 = r1.id
                return r0
        }

        public java.lang.String getType() {
                r1 = this;
                java.lang.String r0 = r1.type
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class FeatureDetailModel implements java.io.Serializable {

        @com.google.gson.annotations.SerializedName("feature_id")
        public java.lang.String feature_id;

        @com.google.gson.annotations.SerializedName("feature_type")
        public java.lang.String feature_type;

        @com.google.gson.annotations.SerializedName("imdb_id")
        public java.lang.String imdb_id;

        @com.google.gson.annotations.SerializedName("movie_name")
        public java.lang.String movie_name;

        @com.google.gson.annotations.SerializedName("title")
        public java.lang.String title;

        @com.google.gson.annotations.SerializedName("tmdb_id")
        public java.lang.String tmdb_id;

        @com.google.gson.annotations.SerializedName("year")
        public java.lang.String year;

        public FeatureDetailModel() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getFeature_id() {
                r1 = this;
                java.lang.String r0 = r1.feature_id
                return r0
        }

        public java.lang.String getFeature_type() {
                r1 = this;
                java.lang.String r0 = r1.feature_type
                return r0
        }

        public java.lang.String getImdb_id() {
                r1 = this;
                java.lang.String r0 = r1.imdb_id
                return r0
        }

        public java.lang.String getMovie_name() {
                r1 = this;
                java.lang.String r0 = r1.movie_name
                return r0
        }

        public java.lang.String getTitle() {
                r1 = this;
                java.lang.String r0 = r1.title
                return r0
        }

        public java.lang.String getTmdb_id() {
                r1 = this;
                java.lang.String r0 = r1.tmdb_id
                return r0
        }

        public java.lang.String getYear() {
                r1 = this;
                java.lang.String r0 = r1.year
                return r0
        }
    }

    public static class FileModel implements java.io.Serializable {

        @com.google.gson.annotations.SerializedName("cd_number")
        public int cd_number;

        @com.google.gson.annotations.SerializedName("file_id")
        public int file_id;

        @com.google.gson.annotations.SerializedName("file_name")
        public java.lang.String file_name;

        public FileModel() {
                r0 = this;
                r0.<init>()
                return
        }

        public int getCd_number() {
                r1 = this;
                int r0 = r1.cd_number
                return r0
        }

        public int getFile_id() {
                r1 = this;
                int r0 = r1.file_id
                return r0
        }

        public java.lang.String getFile_name() {
                r1 = this;
                java.lang.String r0 = r1.file_name
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class RelatedLinkModel implements java.io.Serializable {

        @com.google.gson.annotations.SerializedName("img_url")
        public java.lang.String img_url;

        @com.google.gson.annotations.SerializedName("label")
        public java.lang.String label;

        @com.google.gson.annotations.SerializedName("url")
        public java.lang.String url;

        public RelatedLinkModel() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getImg_url() {
                r1 = this;
                java.lang.String r0 = r1.img_url
                return r0
        }

        public java.lang.String getLabel() {
                r1 = this;
                java.lang.String r0 = r1.label
                return r0
        }

        public java.lang.String getUrl() {
                r1 = this;
                java.lang.String r0 = r1.url
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class UploaderModel implements java.io.Serializable {

        @com.google.gson.annotations.SerializedName("name")
        public java.lang.String name;

        @com.google.gson.annotations.SerializedName("rank")
        public java.lang.String rank;

        @com.google.gson.annotations.SerializedName("uploader_id")
        public java.lang.String uploader_id;

        public UploaderModel() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.String getName() {
                r1 = this;
                java.lang.String r0 = r1.name
                return r0
        }

        public java.lang.String getRank() {
                r1 = this;
                java.lang.String r0 = r1.rank
                return r0
        }

        public java.lang.String getUploader_id() {
                r1 = this;
                java.lang.String r0 = r1.uploader_id
                return r0
        }
    }

    public SubtitleModel() {
            r0 = this;
            r0.<init>()
            return
    }

    public java.util.List<com.flextv.livestore.models.SubtitleModel.DataModel> getDataModels() {
            r1 = this;
            java.util.List<com.flextv.livestore.models.SubtitleModel$DataModel> r0 = r1.dataModels
            if (r0 != 0) goto L9
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L9:
            return r0
    }
}
