package android.support.v4.media;

/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
public final class MediaMetadataCompat implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.media.MediaMetadataCompat> CREATOR = null;
    public static final androidx.collection.ArrayMap<java.lang.String, java.lang.Integer> METADATA_KEYS_TYPE = null;
    public static final java.lang.String METADATA_KEY_ADVERTISEMENT = "android.media.metadata.ADVERTISEMENT";
    public static final java.lang.String METADATA_KEY_ALBUM = "android.media.metadata.ALBUM";
    public static final java.lang.String METADATA_KEY_ALBUM_ART = "android.media.metadata.ALBUM_ART";
    public static final java.lang.String METADATA_KEY_ALBUM_ARTIST = "android.media.metadata.ALBUM_ARTIST";
    public static final java.lang.String METADATA_KEY_ALBUM_ART_URI = "android.media.metadata.ALBUM_ART_URI";
    public static final java.lang.String METADATA_KEY_ART = "android.media.metadata.ART";
    public static final java.lang.String METADATA_KEY_ARTIST = "android.media.metadata.ARTIST";
    public static final java.lang.String METADATA_KEY_ART_URI = "android.media.metadata.ART_URI";
    public static final java.lang.String METADATA_KEY_AUTHOR = "android.media.metadata.AUTHOR";
    public static final java.lang.String METADATA_KEY_BT_FOLDER_TYPE = "android.media.metadata.BT_FOLDER_TYPE";
    public static final java.lang.String METADATA_KEY_COMPILATION = "android.media.metadata.COMPILATION";
    public static final java.lang.String METADATA_KEY_COMPOSER = "android.media.metadata.COMPOSER";
    public static final java.lang.String METADATA_KEY_DATE = "android.media.metadata.DATE";
    public static final java.lang.String METADATA_KEY_DISC_NUMBER = "android.media.metadata.DISC_NUMBER";
    public static final java.lang.String METADATA_KEY_DISPLAY_DESCRIPTION = "android.media.metadata.DISPLAY_DESCRIPTION";
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON = "android.media.metadata.DISPLAY_ICON";
    public static final java.lang.String METADATA_KEY_DISPLAY_ICON_URI = "android.media.metadata.DISPLAY_ICON_URI";
    public static final java.lang.String METADATA_KEY_DISPLAY_SUBTITLE = "android.media.metadata.DISPLAY_SUBTITLE";
    public static final java.lang.String METADATA_KEY_DISPLAY_TITLE = "android.media.metadata.DISPLAY_TITLE";
    public static final java.lang.String METADATA_KEY_DOWNLOAD_STATUS = "android.media.metadata.DOWNLOAD_STATUS";
    public static final java.lang.String METADATA_KEY_DURATION = "android.media.metadata.DURATION";
    public static final java.lang.String METADATA_KEY_GENRE = "android.media.metadata.GENRE";
    public static final java.lang.String METADATA_KEY_MEDIA_ID = "android.media.metadata.MEDIA_ID";
    public static final java.lang.String METADATA_KEY_MEDIA_URI = "android.media.metadata.MEDIA_URI";
    public static final java.lang.String METADATA_KEY_NUM_TRACKS = "android.media.metadata.NUM_TRACKS";
    public static final java.lang.String METADATA_KEY_RATING = "android.media.metadata.RATING";
    public static final java.lang.String METADATA_KEY_TITLE = "android.media.metadata.TITLE";
    public static final java.lang.String METADATA_KEY_TRACK_NUMBER = "android.media.metadata.TRACK_NUMBER";
    public static final java.lang.String METADATA_KEY_USER_RATING = "android.media.metadata.USER_RATING";
    public static final java.lang.String METADATA_KEY_WRITER = "android.media.metadata.WRITER";
    public static final java.lang.String METADATA_KEY_YEAR = "android.media.metadata.YEAR";
    public static final int METADATA_TYPE_BITMAP = 2;
    public static final int METADATA_TYPE_LONG = 0;
    public static final int METADATA_TYPE_RATING = 3;
    public static final int METADATA_TYPE_TEXT = 1;
    private static final java.lang.String[] PREFERRED_BITMAP_ORDER = null;
    private static final java.lang.String[] PREFERRED_DESCRIPTION_ORDER = null;
    private static final java.lang.String[] PREFERRED_URI_ORDER = null;
    private static final java.lang.String TAG = "MediaMetadata";
    public final android.os.Bundle mBundle;
    private android.support.v4.media.MediaDescriptionCompat mDescription;
    private android.media.MediaMetadata mMetadataFwk;


    /* JADX INFO: loaded from: classes3.dex */
    public static final class Builder {
        private final android.os.Bundle mBundle;

        public Builder() {
                r1 = this;
                r1.<init>()
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                r1.mBundle = r0
                return
        }

        public Builder(android.support.v4.media.MediaMetadataCompat r2) {
                r1 = this;
                r1.<init>()
                android.os.Bundle r0 = new android.os.Bundle
                android.os.Bundle r2 = r2.mBundle
                r0.<init>(r2)
                r1.mBundle = r0
                android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r0)
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public Builder(android.support.v4.media.MediaMetadataCompat r4, int r5) {
                r3 = this;
                r3.<init>(r4)
                android.os.Bundle r4 = r3.mBundle
                java.util.Set r4 = r4.keySet()
                java.util.Iterator r4 = r4.iterator()
            Ld:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L39
                java.lang.Object r0 = r4.next()
                java.lang.String r0 = (java.lang.String) r0
                android.os.Bundle r1 = r3.mBundle
                java.lang.Object r1 = r1.get(r0)
                boolean r2 = r1 instanceof android.graphics.Bitmap
                if (r2 == 0) goto Ld
                android.graphics.Bitmap r1 = (android.graphics.Bitmap) r1
                int r2 = r1.getHeight()
                if (r2 > r5) goto L31
                int r2 = r1.getWidth()
                if (r2 <= r5) goto Ld
            L31:
                android.graphics.Bitmap r1 = r3.scaleBitmap(r1, r5)
                r3.putBitmap(r0, r1)
                goto Ld
            L39:
                return
        }

        private android.graphics.Bitmap scaleBitmap(android.graphics.Bitmap r3, int r4) {
                r2 = this;
                float r4 = (float) r4
                int r0 = r3.getWidth()
                float r0 = (float) r0
                float r0 = r4 / r0
                int r1 = r3.getHeight()
                float r1 = (float) r1
                float r4 = r4 / r1
                float r4 = java.lang.Math.min(r0, r4)
                int r0 = r3.getHeight()
                float r0 = (float) r0
                float r0 = r0 * r4
                int r0 = (int) r0
                int r1 = r3.getWidth()
                float r1 = (float) r1
                float r1 = r1 * r4
                int r4 = (int) r1
                r1 = 1
                android.graphics.Bitmap r3 = android.graphics.Bitmap.createScaledBitmap(r3, r4, r0, r1)
                return r3
        }

        public android.support.v4.media.MediaMetadataCompat build() {
                r2 = this;
                android.support.v4.media.MediaMetadataCompat r0 = new android.support.v4.media.MediaMetadataCompat
                android.os.Bundle r1 = r2.mBundle
                r0.<init>(r1)
                return r0
        }

        public android.support.v4.media.MediaMetadataCompat.Builder putBitmap(java.lang.String r3, android.graphics.Bitmap r4) {
                r2 = this;
                androidx.collection.ArrayMap<java.lang.String, java.lang.Integer> r0 = android.support.v4.media.MediaMetadataCompat.METADATA_KEYS_TYPE
                boolean r1 = r0.containsKey(r3)
                if (r1 == 0) goto L24
                java.lang.Object r0 = r0.get(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r1 = 2
                if (r0 != r1) goto L16
                goto L24
            L16:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The "
                java.lang.String r1 = " key cannot be used to put a Bitmap"
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
                r4.<init>(r3)
                throw r4
            L24:
                android.os.Bundle r0 = r2.mBundle
                r0.putParcelable(r3, r4)
                return r2
        }

        public android.support.v4.media.MediaMetadataCompat.Builder putLong(java.lang.String r3, long r4) {
                r2 = this;
                androidx.collection.ArrayMap<java.lang.String, java.lang.Integer> r0 = android.support.v4.media.MediaMetadataCompat.METADATA_KEYS_TYPE
                boolean r1 = r0.containsKey(r3)
                if (r1 == 0) goto L23
                java.lang.Object r0 = r0.get(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                if (r0 != 0) goto L15
                goto L23
            L15:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "The "
                java.lang.String r0 = " key cannot be used to put a long"
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r5, r3, r0)
                r4.<init>(r3)
                throw r4
            L23:
                android.os.Bundle r0 = r2.mBundle
                r0.putLong(r3, r4)
                return r2
        }

        public android.support.v4.media.MediaMetadataCompat.Builder putRating(java.lang.String r3, android.support.v4.media.RatingCompat r4) {
                r2 = this;
                androidx.collection.ArrayMap<java.lang.String, java.lang.Integer> r0 = android.support.v4.media.MediaMetadataCompat.METADATA_KEYS_TYPE
                boolean r1 = r0.containsKey(r3)
                if (r1 == 0) goto L24
                java.lang.Object r0 = r0.get(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r1 = 3
                if (r0 != r1) goto L16
                goto L24
            L16:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The "
                java.lang.String r1 = " key cannot be used to put a Rating"
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
                r4.<init>(r3)
                throw r4
            L24:
                android.os.Bundle r0 = r2.mBundle
                java.lang.Object r4 = r4.getRating()
                android.os.Parcelable r4 = (android.os.Parcelable) r4
                r0.putParcelable(r3, r4)
                return r2
        }

        public android.support.v4.media.MediaMetadataCompat.Builder putString(java.lang.String r3, java.lang.String r4) {
                r2 = this;
                androidx.collection.ArrayMap<java.lang.String, java.lang.Integer> r0 = android.support.v4.media.MediaMetadataCompat.METADATA_KEYS_TYPE
                boolean r1 = r0.containsKey(r3)
                if (r1 == 0) goto L24
                java.lang.Object r0 = r0.get(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r1 = 1
                if (r0 != r1) goto L16
                goto L24
            L16:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The "
                java.lang.String r1 = " key cannot be used to put a String"
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
                r4.<init>(r3)
                throw r4
            L24:
                android.os.Bundle r0 = r2.mBundle
                r0.putCharSequence(r3, r4)
                return r2
        }

        public android.support.v4.media.MediaMetadataCompat.Builder putText(java.lang.String r3, java.lang.CharSequence r4) {
                r2 = this;
                androidx.collection.ArrayMap<java.lang.String, java.lang.Integer> r0 = android.support.v4.media.MediaMetadataCompat.METADATA_KEYS_TYPE
                boolean r1 = r0.containsKey(r3)
                if (r1 == 0) goto L24
                java.lang.Object r0 = r0.get(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                r1 = 1
                if (r0 != r1) goto L16
                goto L24
            L16:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "The "
                java.lang.String r1 = " key cannot be used to put a CharSequence"
                java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r3, r1)
                r4.<init>(r3)
                throw r4
            L24:
                android.os.Bundle r0 = r2.mBundle
                r0.putCharSequence(r3, r4)
                return r2
        }
    }

    static {
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>()
            android.support.v4.media.MediaMetadataCompat.METADATA_KEYS_TYPE = r0
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "android.media.metadata.TITLE"
            r0.put(r2, r1)
            java.lang.String r2 = "android.media.metadata.ARTIST"
            r0.put(r2, r1)
            r2 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.String r3 = "android.media.metadata.DURATION"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.ALBUM"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.AUTHOR"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.WRITER"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.COMPOSER"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.COMPILATION"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.DATE"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.YEAR"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.GENRE"
            r0.put(r3, r1)
            java.lang.String r3 = "android.media.metadata.TRACK_NUMBER"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.NUM_TRACKS"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.DISC_NUMBER"
            r0.put(r3, r2)
            java.lang.String r3 = "android.media.metadata.ALBUM_ARTIST"
            r0.put(r3, r1)
            r3 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.String r4 = "android.media.metadata.ART"
            r0.put(r4, r3)
            java.lang.String r5 = "android.media.metadata.ART_URI"
            r0.put(r5, r1)
            java.lang.String r6 = "android.media.metadata.ALBUM_ART"
            r0.put(r6, r3)
            java.lang.String r7 = "android.media.metadata.ALBUM_ART_URI"
            r0.put(r7, r1)
            r8 = 3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.String r9 = "android.media.metadata.USER_RATING"
            r0.put(r9, r8)
            java.lang.String r9 = "android.media.metadata.RATING"
            r0.put(r9, r8)
            java.lang.String r8 = "android.media.metadata.DISPLAY_TITLE"
            r0.put(r8, r1)
            java.lang.String r8 = "android.media.metadata.DISPLAY_SUBTITLE"
            r0.put(r8, r1)
            java.lang.String r8 = "android.media.metadata.DISPLAY_DESCRIPTION"
            r0.put(r8, r1)
            java.lang.String r8 = "android.media.metadata.DISPLAY_ICON"
            r0.put(r8, r3)
            java.lang.String r3 = "android.media.metadata.DISPLAY_ICON_URI"
            r0.put(r3, r1)
            java.lang.String r9 = "android.media.metadata.MEDIA_ID"
            r0.put(r9, r1)
            java.lang.String r9 = "android.media.metadata.BT_FOLDER_TYPE"
            r0.put(r9, r2)
            java.lang.String r9 = "android.media.metadata.MEDIA_URI"
            r0.put(r9, r1)
            java.lang.String r1 = "android.media.metadata.ADVERTISEMENT"
            r0.put(r1, r2)
            java.lang.String r1 = "android.media.metadata.DOWNLOAD_STATUS"
            r0.put(r1, r2)
            java.lang.String r9 = "android.media.metadata.TITLE"
            java.lang.String r10 = "android.media.metadata.ARTIST"
            java.lang.String r11 = "android.media.metadata.ALBUM"
            java.lang.String r12 = "android.media.metadata.ALBUM_ARTIST"
            java.lang.String r13 = "android.media.metadata.WRITER"
            java.lang.String r14 = "android.media.metadata.AUTHOR"
            java.lang.String r15 = "android.media.metadata.COMPOSER"
            java.lang.String[] r0 = new java.lang.String[]{r9, r10, r11, r12, r13, r14, r15}
            android.support.v4.media.MediaMetadataCompat.PREFERRED_DESCRIPTION_ORDER = r0
            java.lang.String[] r0 = new java.lang.String[]{r8, r4, r6}
            android.support.v4.media.MediaMetadataCompat.PREFERRED_BITMAP_ORDER = r0
            java.lang.String[] r0 = new java.lang.String[]{r3, r5, r7}
            android.support.v4.media.MediaMetadataCompat.PREFERRED_URI_ORDER = r0
            android.support.v4.media.MediaMetadataCompat$1 r0 = new android.support.v4.media.MediaMetadataCompat$1
            r0.<init>()
            android.support.v4.media.MediaMetadataCompat.CREATOR = r0
            return
    }

    public MediaMetadataCompat(android.os.Bundle r2) {
            r1 = this;
            r1.<init>()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>(r2)
            r1.mBundle = r0
            android.support.v4.media.session.MediaSessionCompat.ensureClassLoader(r0)
            return
    }

    public MediaMetadataCompat(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<android.support.v4.media.session.MediaSessionCompat> r0 = android.support.v4.media.session.MediaSessionCompat.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            android.os.Bundle r2 = r2.readBundle(r0)
            r1.mBundle = r2
            return
    }

    public static android.support.v4.media.MediaMetadataCompat fromMediaMetadata(java.lang.Object r2) {
            if (r2 == 0) goto L1d
            android.os.Parcel r0 = android.os.Parcel.obtain()
            android.media.MediaMetadata r2 = (android.media.MediaMetadata) r2
            r1 = 0
            r2.writeToParcel(r0, r1)
            r0.setDataPosition(r1)
            android.os.Parcelable$Creator<android.support.v4.media.MediaMetadataCompat> r1 = android.support.v4.media.MediaMetadataCompat.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            android.support.v4.media.MediaMetadataCompat r1 = (android.support.v4.media.MediaMetadataCompat) r1
            r0.recycle()
            r1.mMetadataFwk = r2
            return r1
        L1d:
            r2 = 0
            return r2
    }

    public boolean containsKey(java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.mBundle
            boolean r2 = r0.containsKey(r2)
            return r2
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public android.graphics.Bitmap getBitmap(java.lang.String r3) {
            r2 = this;
            android.os.Bundle r0 = r2.mBundle     // Catch: java.lang.Exception -> L9
            android.os.Parcelable r3 = r0.getParcelable(r3)     // Catch: java.lang.Exception -> L9
            android.graphics.Bitmap r3 = (android.graphics.Bitmap) r3     // Catch: java.lang.Exception -> L9
            goto L12
        L9:
            r3 = move-exception
            java.lang.String r0 = "MediaMetadata"
            java.lang.String r1 = "Failed to retrieve a key as Bitmap."
            android.util.Log.w(r0, r1, r3)
            r3 = 0
        L12:
            return r3
    }

    public android.os.Bundle getBundle() {
            r2 = this;
            android.os.Bundle r0 = new android.os.Bundle
            android.os.Bundle r1 = r2.mBundle
            r0.<init>(r1)
            return r0
    }

    public android.support.v4.media.MediaDescriptionCompat getDescription() {
            r10 = this;
            android.support.v4.media.MediaDescriptionCompat r0 = r10.mDescription
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "android.media.metadata.MEDIA_ID"
            java.lang.String r0 = r10.getString(r0)
            r1 = 3
            java.lang.CharSequence[] r2 = new java.lang.CharSequence[r1]
            java.lang.String r3 = "android.media.metadata.DISPLAY_TITLE"
            java.lang.CharSequence r3 = r10.getText(r3)
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 != 0) goto L30
            r2[r7] = r3
            java.lang.String r1 = "android.media.metadata.DISPLAY_SUBTITLE"
            java.lang.CharSequence r1 = r10.getText(r1)
            r2[r6] = r1
            java.lang.String r1 = "android.media.metadata.DISPLAY_DESCRIPTION"
            java.lang.CharSequence r1 = r10.getText(r1)
            r2[r5] = r1
            goto L4e
        L30:
            r3 = 0
            r4 = 0
        L32:
            if (r3 >= r1) goto L4e
            java.lang.String[] r8 = android.support.v4.media.MediaMetadataCompat.PREFERRED_DESCRIPTION_ORDER
            int r9 = r8.length
            if (r4 >= r9) goto L4e
            int r9 = r4 + 1
            r4 = r8[r4]
            java.lang.CharSequence r4 = r10.getText(r4)
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L4c
            int r8 = r3 + 1
            r2[r3] = r4
            r3 = r8
        L4c:
            r4 = r9
            goto L32
        L4e:
            r1 = 0
        L4f:
            java.lang.String[] r3 = android.support.v4.media.MediaMetadataCompat.PREFERRED_BITMAP_ORDER
            int r4 = r3.length
            r8 = 0
            if (r1 >= r4) goto L61
            r3 = r3[r1]
            android.graphics.Bitmap r3 = r10.getBitmap(r3)
            if (r3 == 0) goto L5e
            goto L62
        L5e:
            int r1 = r1 + 1
            goto L4f
        L61:
            r3 = r8
        L62:
            r1 = 0
        L63:
            java.lang.String[] r4 = android.support.v4.media.MediaMetadataCompat.PREFERRED_URI_ORDER
            int r9 = r4.length
            if (r1 >= r9) goto L7c
            r4 = r4[r1]
            java.lang.String r4 = r10.getString(r4)
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L79
            android.net.Uri r1 = android.net.Uri.parse(r4)
            goto L7d
        L79:
            int r1 = r1 + 1
            goto L63
        L7c:
            r1 = r8
        L7d:
            java.lang.String r4 = "android.media.metadata.MEDIA_URI"
            java.lang.String r4 = r10.getString(r4)
            boolean r9 = android.text.TextUtils.isEmpty(r4)
            if (r9 != 0) goto L8d
            android.net.Uri r8 = android.net.Uri.parse(r4)
        L8d:
            android.support.v4.media.MediaDescriptionCompat$Builder r4 = new android.support.v4.media.MediaDescriptionCompat$Builder
            r4.<init>()
            r4.setMediaId(r0)
            r0 = r2[r7]
            r4.setTitle(r0)
            r0 = r2[r6]
            r4.setSubtitle(r0)
            r0 = r2[r5]
            r4.setDescription(r0)
            r4.setIconBitmap(r3)
            r4.setIconUri(r1)
            r4.setMediaUri(r8)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            android.os.Bundle r1 = r10.mBundle
            java.lang.String r2 = "android.media.metadata.BT_FOLDER_TYPE"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto Lc5
            long r1 = r10.getLong(r2)
            java.lang.String r3 = "android.media.extra.BT_FOLDER_TYPE"
            r0.putLong(r3, r1)
        Lc5:
            android.os.Bundle r1 = r10.mBundle
            java.lang.String r2 = "android.media.metadata.DOWNLOAD_STATUS"
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto Ld8
            long r1 = r10.getLong(r2)
            java.lang.String r3 = "android.media.extra.DOWNLOAD_STATUS"
            r0.putLong(r3, r1)
        Ld8:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Le1
            r4.setExtras(r0)
        Le1:
            android.support.v4.media.MediaDescriptionCompat r0 = r4.build()
            r10.mDescription = r0
            return r0
    }

    public long getLong(java.lang.String r4) {
            r3 = this;
            android.os.Bundle r0 = r3.mBundle
            r1 = 0
            long r0 = r0.getLong(r4, r1)
            return r0
    }

    public java.lang.Object getMediaMetadata() {
            r2 = this;
            android.media.MediaMetadata r0 = r2.mMetadataFwk
            if (r0 != 0) goto L1c
            android.os.Parcel r0 = android.os.Parcel.obtain()
            r1 = 0
            r2.writeToParcel(r0, r1)
            r0.setDataPosition(r1)
            android.os.Parcelable$Creator r1 = android.media.MediaMetadata.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            android.media.MediaMetadata r1 = (android.media.MediaMetadata) r1
            r2.mMetadataFwk = r1
            r0.recycle()
        L1c:
            android.media.MediaMetadata r0 = r2.mMetadataFwk
            return r0
    }

    public android.support.v4.media.RatingCompat getRating(java.lang.String r3) {
            r2 = this;
            android.os.Bundle r0 = r2.mBundle     // Catch: java.lang.Exception -> Lb
            android.os.Parcelable r3 = r0.getParcelable(r3)     // Catch: java.lang.Exception -> Lb
            android.support.v4.media.RatingCompat r3 = android.support.v4.media.RatingCompat.fromRating(r3)     // Catch: java.lang.Exception -> Lb
            goto L14
        Lb:
            r3 = move-exception
            java.lang.String r0 = "MediaMetadata"
            java.lang.String r1 = "Failed to retrieve a key as Rating."
            android.util.Log.w(r0, r1, r3)
            r3 = 0
        L14:
            return r3
    }

    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.mBundle
            java.lang.CharSequence r2 = r0.getCharSequence(r2)
            if (r2 == 0) goto Ld
            java.lang.String r2 = r2.toString()
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public java.lang.CharSequence getText(java.lang.String r2) {
            r1 = this;
            android.os.Bundle r0 = r1.mBundle
            java.lang.CharSequence r2 = r0.getCharSequence(r2)
            return r2
    }

    public java.util.Set<java.lang.String> keySet() {
            r1 = this;
            android.os.Bundle r0 = r1.mBundle
            java.util.Set r0 = r0.keySet()
            return r0
    }

    public int size() {
            r1 = this;
            android.os.Bundle r0 = r1.mBundle
            int r0 = r0.size()
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r1, int r2) {
            r0 = this;
            android.os.Bundle r2 = r0.mBundle
            r1.writeBundle(r2)
            return
    }
}
