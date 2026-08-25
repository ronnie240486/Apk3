package android.support.v4.media;

/* JADX INFO: loaded from: classes3.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements android.os.Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaDescriptionCompat> CREATOR = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static final java.lang.String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final java.lang.String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final java.lang.String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final java.lang.String TAG = "MediaDescriptionCompat";
    private final java.lang.CharSequence mDescription;
    private android.media.MediaDescription mDescriptionFwk;
    private final android.os.Bundle mExtras;
    private final android.graphics.Bitmap mIcon;
    private final android.net.Uri mIconUri;
    private final java.lang.String mMediaId;
    private final android.net.Uri mMediaUri;
    private final java.lang.CharSequence mSubtitle;
    private final java.lang.CharSequence mTitle;


    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.media.MediaDescription build(android.media.MediaDescription.Builder r0) {
                android.media.MediaDescription r0 = r0.build()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.media.MediaDescription.Builder createBuilder() {
                android.media.MediaDescription$Builder r0 = new android.media.MediaDescription$Builder
                r0.<init>()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getDescription(android.media.MediaDescription r0) {
                java.lang.CharSequence r0 = r0.getDescription()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static android.os.Bundle getExtras(android.media.MediaDescription r0) {
                android.os.Bundle r0 = r0.getExtras()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static android.graphics.Bitmap getIconBitmap(android.media.MediaDescription r0) {
                android.graphics.Bitmap r0 = r0.getIconBitmap()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static android.net.Uri getIconUri(android.media.MediaDescription r0) {
                android.net.Uri r0 = r0.getIconUri()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static java.lang.String getMediaId(android.media.MediaDescription r0) {
                java.lang.String r0 = r0.getMediaId()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getSubtitle(android.media.MediaDescription r0) {
                java.lang.CharSequence r0 = r0.getSubtitle()
                return r0
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getTitle(android.media.MediaDescription r0) {
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setDescription(android.media.MediaDescription.Builder r0, @androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0.setDescription(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setExtras(android.media.MediaDescription.Builder r0, @androidx.annotation.Nullable android.os.Bundle r1) {
                r0.setExtras(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setIconBitmap(android.media.MediaDescription.Builder r0, @androidx.annotation.Nullable android.graphics.Bitmap r1) {
                r0.setIconBitmap(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setIconUri(android.media.MediaDescription.Builder r0, @androidx.annotation.Nullable android.net.Uri r1) {
                r0.setIconUri(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setMediaId(android.media.MediaDescription.Builder r0, @androidx.annotation.Nullable java.lang.String r1) {
                r0.setMediaId(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setSubtitle(android.media.MediaDescription.Builder r0, @androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0.setSubtitle(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setTitle(android.media.MediaDescription.Builder r0, @androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0.setTitle(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(23)
    public static class Api23Impl {
        private Api23Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        @androidx.annotation.DoNotInline
        public static android.net.Uri getMediaUri(android.media.MediaDescription r0) {
                android.net.Uri r0 = r0.getMediaUri()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setMediaUri(android.media.MediaDescription.Builder r0, @androidx.annotation.Nullable android.net.Uri r1) {
                r0.setMediaUri(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Builder {
        private java.lang.CharSequence mDescription;
        private android.os.Bundle mExtras;
        private android.graphics.Bitmap mIcon;
        private android.net.Uri mIconUri;
        private java.lang.String mMediaId;
        private android.net.Uri mMediaUri;
        private java.lang.CharSequence mSubtitle;
        private java.lang.CharSequence mTitle;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public android.support.v4.media.MediaDescriptionCompat build() {
                r10 = this;
                android.support.v4.media.MediaDescriptionCompat r9 = new android.support.v4.media.MediaDescriptionCompat
                java.lang.String r1 = r10.mMediaId
                java.lang.CharSequence r2 = r10.mTitle
                java.lang.CharSequence r3 = r10.mSubtitle
                java.lang.CharSequence r4 = r10.mDescription
                android.graphics.Bitmap r5 = r10.mIcon
                android.net.Uri r6 = r10.mIconUri
                android.os.Bundle r7 = r10.mExtras
                android.net.Uri r8 = r10.mMediaUri
                r0 = r9
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                return r9
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setDescription(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.mDescription = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setExtras(@androidx.annotation.Nullable android.os.Bundle r1) {
                r0 = this;
                r0.mExtras = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setIconBitmap(@androidx.annotation.Nullable android.graphics.Bitmap r1) {
                r0 = this;
                r0.mIcon = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setIconUri(@androidx.annotation.Nullable android.net.Uri r1) {
                r0 = this;
                r0.mIconUri = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setMediaId(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.mMediaId = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setMediaUri(@androidx.annotation.Nullable android.net.Uri r1) {
                r0 = this;
                r0.mMediaUri = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setSubtitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.mSubtitle = r1
                return r0
        }

        public android.support.v4.media.MediaDescriptionCompat.Builder setTitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.mTitle = r1
                return r0
        }
    }

    static {
            android.support.v4.media.MediaDescriptionCompat$1 r0 = new android.support.v4.media.MediaDescriptionCompat$1
            r0.<init>()
            android.support.v4.media.MediaDescriptionCompat.CREATOR = r0
            return
    }

    public MediaDescriptionCompat(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            java.lang.String r0 = r3.readString()
            r2.mMediaId = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.mTitle = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.mSubtitle = r0
            android.os.Parcelable$Creator r0 = android.text.TextUtils.CHAR_SEQUENCE_CREATOR
            java.lang.Object r0 = r0.createFromParcel(r3)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            r2.mDescription = r0
            java.lang.Class<android.support.v4.media.MediaDescriptionCompat> r0 = android.support.v4.media.MediaDescriptionCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Parcelable r1 = r3.readParcelable(r0)
            android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
            r2.mIcon = r1
            android.os.Parcelable r1 = r3.readParcelable(r0)
            android.net.Uri r1 = (android.net.Uri) r1
            r2.mIconUri = r1
            android.os.Bundle r1 = r3.readBundle(r0)
            r2.mExtras = r1
            android.os.Parcelable r3 = r3.readParcelable(r0)
            android.net.Uri r3 = (android.net.Uri) r3
            r2.mMediaUri = r3
            return
    }

    public MediaDescriptionCompat(java.lang.String r1, java.lang.CharSequence r2, java.lang.CharSequence r3, java.lang.CharSequence r4, android.graphics.Bitmap r5, android.net.Uri r6, android.os.Bundle r7, android.net.Uri r8) {
            r0 = this;
            r0.<init>()
            r0.mMediaId = r1
            r0.mTitle = r2
            r0.mSubtitle = r3
            r0.mDescription = r4
            r0.mIcon = r5
            r0.mIconUri = r6
            r0.mExtras = r7
            r0.mMediaUri = r8
            return
    }

    public static android.support.v4.media.MediaDescriptionCompat fromMediaDescription(java.lang.Object r9) {
            r0 = 0
            if (r9 == 0) goto L7f
            int r1 = android.os.Build.VERSION.SDK_INT
            android.support.v4.media.MediaDescriptionCompat$Builder r2 = new android.support.v4.media.MediaDescriptionCompat$Builder
            r2.<init>()
            android.media.MediaDescription r9 = (android.media.MediaDescription) r9
            java.lang.String r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getMediaId(r9)
            r2.setMediaId(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getTitle(r9)
            r2.setTitle(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getSubtitle(r9)
            r2.setSubtitle(r3)
            java.lang.CharSequence r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getDescription(r9)
            r2.setDescription(r3)
            android.graphics.Bitmap r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconBitmap(r9)
            r2.setIconBitmap(r3)
            android.net.Uri r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getIconUri(r9)
            r2.setIconUri(r3)
            android.os.Bundle r3 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.getExtras(r9)
            if (r3 == 0) goto L40
            android.os.Bundle r3 = android.support.v4.media.session.MediaSessionCompat.unparcelWithClassLoader(r3)
        L40:
            java.lang.String r4 = "android.support.v4.media.description.MEDIA_URI"
            if (r3 == 0) goto L4b
            android.os.Parcelable r5 = r3.getParcelable(r4)
            android.net.Uri r5 = (android.net.Uri) r5
            goto L4c
        L4b:
            r5 = r0
        L4c:
            if (r5 == 0) goto L64
            java.lang.String r6 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r7 = r3.containsKey(r6)
            if (r7 == 0) goto L5e
            int r7 = r3.size()
            r8 = 2
            if (r7 != r8) goto L5e
            goto L65
        L5e:
            r3.remove(r4)
            r3.remove(r6)
        L64:
            r0 = r3
        L65:
            r2.setExtras(r0)
            if (r5 == 0) goto L6e
            r2.setMediaUri(r5)
            goto L79
        L6e:
            r0 = 23
            if (r1 < r0) goto L79
            android.net.Uri r0 = android.support.v4.media.MediaDescriptionCompat.Api23Impl.getMediaUri(r9)
            r2.setMediaUri(r0)
        L79:
            android.support.v4.media.MediaDescriptionCompat r0 = r2.build()
            r0.mDescriptionFwk = r9
        L7f:
            return r0
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mDescription
            return r0
    }

    @androidx.annotation.Nullable
    public android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mExtras
            return r0
    }

    @androidx.annotation.Nullable
    public android.graphics.Bitmap getIconBitmap() {
            r1 = this;
            android.graphics.Bitmap r0 = r1.mIcon
            return r0
    }

    @androidx.annotation.Nullable
    public android.net.Uri getIconUri() {
            r1 = this;
            android.net.Uri r0 = r1.mIconUri
            return r0
    }

    public java.lang.Object getMediaDescription() {
            r6 = this;
            android.media.MediaDescription r0 = r6.mDescriptionFwk
            if (r0 != 0) goto L64
            int r0 = android.os.Build.VERSION.SDK_INT
            android.media.MediaDescription$Builder r1 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.createBuilder()
            java.lang.String r2 = r6.mMediaId
            android.support.v4.media.MediaDescriptionCompat.Api21Impl.setMediaId(r1, r2)
            java.lang.CharSequence r2 = r6.mTitle
            android.support.v4.media.MediaDescriptionCompat.Api21Impl.setTitle(r1, r2)
            java.lang.CharSequence r2 = r6.mSubtitle
            android.support.v4.media.MediaDescriptionCompat.Api21Impl.setSubtitle(r1, r2)
            java.lang.CharSequence r2 = r6.mDescription
            android.support.v4.media.MediaDescriptionCompat.Api21Impl.setDescription(r1, r2)
            android.graphics.Bitmap r2 = r6.mIcon
            android.support.v4.media.MediaDescriptionCompat.Api21Impl.setIconBitmap(r1, r2)
            android.net.Uri r2 = r6.mIconUri
            android.support.v4.media.MediaDescriptionCompat.Api21Impl.setIconUri(r1, r2)
            r2 = 23
            if (r0 >= r2) goto L52
            android.net.Uri r3 = r6.mMediaUri
            if (r3 == 0) goto L52
            android.os.Bundle r3 = r6.mExtras
            if (r3 != 0) goto L40
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
            r4 = 1
            java.lang.String r5 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            r3.putBoolean(r5, r4)
            goto L47
        L40:
            android.os.Bundle r3 = new android.os.Bundle
            android.os.Bundle r4 = r6.mExtras
            r3.<init>(r4)
        L47:
            android.net.Uri r4 = r6.mMediaUri
            java.lang.String r5 = "android.support.v4.media.description.MEDIA_URI"
            r3.putParcelable(r5, r4)
            android.support.v4.media.MediaDescriptionCompat.Api21Impl.setExtras(r1, r3)
            goto L57
        L52:
            android.os.Bundle r3 = r6.mExtras
            android.support.v4.media.MediaDescriptionCompat.Api21Impl.setExtras(r1, r3)
        L57:
            if (r0 < r2) goto L5e
            android.net.Uri r0 = r6.mMediaUri
            android.support.v4.media.MediaDescriptionCompat.Api23Impl.setMediaUri(r1, r0)
        L5e:
            android.media.MediaDescription r0 = android.support.v4.media.MediaDescriptionCompat.Api21Impl.build(r1)
            r6.mDescriptionFwk = r0
        L64:
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getMediaId() {
            r1 = this;
            java.lang.String r0 = r1.mMediaId
            return r0
    }

    @androidx.annotation.Nullable
    public android.net.Uri getMediaUri() {
            r1 = this;
            android.net.Uri r0 = r1.mMediaUri
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getSubtitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mSubtitle
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r3.mTitle
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.CharSequence r2 = r3.mSubtitle
            r0.append(r2)
            r0.append(r1)
            java.lang.CharSequence r1 = r3.mDescription
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r2, int r3) {
            r1 = this;
            java.lang.Object r0 = r1.getMediaDescription()
            android.media.MediaDescription r0 = (android.media.MediaDescription) r0
            r0.writeToParcel(r2, r3)
            return
    }
}
