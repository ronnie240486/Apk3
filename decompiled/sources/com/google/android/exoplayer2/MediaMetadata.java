package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaMetadata implements com.google.android.exoplayer2.Bundleable {
    public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.MediaMetadata> CREATOR = null;
    public static final com.google.android.exoplayer2.MediaMetadata EMPTY = null;
    private static final java.lang.String FIELD_ALBUM_ARTIST = null;
    private static final java.lang.String FIELD_ALBUM_TITLE = null;
    private static final java.lang.String FIELD_ARTIST = null;
    private static final java.lang.String FIELD_ARTWORK_DATA = null;
    private static final java.lang.String FIELD_ARTWORK_DATA_TYPE = null;
    private static final java.lang.String FIELD_ARTWORK_URI = null;
    private static final java.lang.String FIELD_COMPILATION = null;
    private static final java.lang.String FIELD_COMPOSER = null;
    private static final java.lang.String FIELD_CONDUCTOR = null;
    private static final java.lang.String FIELD_DESCRIPTION = null;
    private static final java.lang.String FIELD_DISC_NUMBER = null;
    private static final java.lang.String FIELD_DISPLAY_TITLE = null;
    private static final java.lang.String FIELD_EXTRAS = null;
    private static final java.lang.String FIELD_FOLDER_TYPE = null;
    private static final java.lang.String FIELD_GENRE = null;
    private static final java.lang.String FIELD_IS_BROWSABLE = null;
    private static final java.lang.String FIELD_IS_PLAYABLE = null;
    private static final java.lang.String FIELD_MEDIA_TYPE = null;
    private static final java.lang.String FIELD_OVERALL_RATING = null;
    private static final java.lang.String FIELD_RECORDING_DAY = null;
    private static final java.lang.String FIELD_RECORDING_MONTH = null;
    private static final java.lang.String FIELD_RECORDING_YEAR = null;
    private static final java.lang.String FIELD_RELEASE_DAY = null;
    private static final java.lang.String FIELD_RELEASE_MONTH = null;
    private static final java.lang.String FIELD_RELEASE_YEAR = null;
    private static final java.lang.String FIELD_STATION = null;
    private static final java.lang.String FIELD_SUBTITLE = null;
    private static final java.lang.String FIELD_TITLE = null;
    private static final java.lang.String FIELD_TOTAL_DISC_COUNT = null;
    private static final java.lang.String FIELD_TOTAL_TRACK_COUNT = null;
    private static final java.lang.String FIELD_TRACK_NUMBER = null;
    private static final java.lang.String FIELD_USER_RATING = null;
    private static final java.lang.String FIELD_WRITER = null;
    public static final int FOLDER_TYPE_ALBUMS = 2;
    public static final int FOLDER_TYPE_ARTISTS = 3;
    public static final int FOLDER_TYPE_GENRES = 4;
    public static final int FOLDER_TYPE_MIXED = 0;
    public static final int FOLDER_TYPE_NONE = -1;
    public static final int FOLDER_TYPE_PLAYLISTS = 5;
    public static final int FOLDER_TYPE_TITLES = 1;
    public static final int FOLDER_TYPE_YEARS = 6;
    public static final int MEDIA_TYPE_ALBUM = 10;
    public static final int MEDIA_TYPE_ARTIST = 11;
    public static final int MEDIA_TYPE_AUDIO_BOOK = 15;
    public static final int MEDIA_TYPE_AUDIO_BOOK_CHAPTER = 2;
    public static final int MEDIA_TYPE_FOLDER_ALBUMS = 21;
    public static final int MEDIA_TYPE_FOLDER_ARTISTS = 22;
    public static final int MEDIA_TYPE_FOLDER_AUDIO_BOOKS = 26;
    public static final int MEDIA_TYPE_FOLDER_GENRES = 23;
    public static final int MEDIA_TYPE_FOLDER_MIXED = 20;
    public static final int MEDIA_TYPE_FOLDER_MOVIES = 35;
    public static final int MEDIA_TYPE_FOLDER_NEWS = 32;
    public static final int MEDIA_TYPE_FOLDER_PLAYLISTS = 24;
    public static final int MEDIA_TYPE_FOLDER_PODCASTS = 27;
    public static final int MEDIA_TYPE_FOLDER_RADIO_STATIONS = 31;
    public static final int MEDIA_TYPE_FOLDER_TRAILERS = 34;
    public static final int MEDIA_TYPE_FOLDER_TV_CHANNELS = 28;
    public static final int MEDIA_TYPE_FOLDER_TV_SERIES = 29;
    public static final int MEDIA_TYPE_FOLDER_TV_SHOWS = 30;
    public static final int MEDIA_TYPE_FOLDER_VIDEOS = 33;
    public static final int MEDIA_TYPE_FOLDER_YEARS = 25;
    public static final int MEDIA_TYPE_GENRE = 12;
    public static final int MEDIA_TYPE_MIXED = 0;
    public static final int MEDIA_TYPE_MOVIE = 8;
    public static final int MEDIA_TYPE_MUSIC = 1;
    public static final int MEDIA_TYPE_NEWS = 5;
    public static final int MEDIA_TYPE_PLAYLIST = 13;
    public static final int MEDIA_TYPE_PODCAST = 16;
    public static final int MEDIA_TYPE_PODCAST_EPISODE = 3;
    public static final int MEDIA_TYPE_RADIO_STATION = 4;
    public static final int MEDIA_TYPE_TRAILER = 7;
    public static final int MEDIA_TYPE_TV_CHANNEL = 17;
    public static final int MEDIA_TYPE_TV_SEASON = 19;
    public static final int MEDIA_TYPE_TV_SERIES = 18;
    public static final int MEDIA_TYPE_TV_SHOW = 9;
    public static final int MEDIA_TYPE_VIDEO = 6;
    public static final int MEDIA_TYPE_YEAR = 14;
    public static final int PICTURE_TYPE_ARTIST_PERFORMER = 8;
    public static final int PICTURE_TYPE_A_BRIGHT_COLORED_FISH = 17;
    public static final int PICTURE_TYPE_BACK_COVER = 4;
    public static final int PICTURE_TYPE_BAND_ARTIST_LOGO = 19;
    public static final int PICTURE_TYPE_BAND_ORCHESTRA = 10;
    public static final int PICTURE_TYPE_COMPOSER = 11;
    public static final int PICTURE_TYPE_CONDUCTOR = 9;
    public static final int PICTURE_TYPE_DURING_PERFORMANCE = 15;
    public static final int PICTURE_TYPE_DURING_RECORDING = 14;
    public static final int PICTURE_TYPE_FILE_ICON = 1;
    public static final int PICTURE_TYPE_FILE_ICON_OTHER = 2;
    public static final int PICTURE_TYPE_FRONT_COVER = 3;
    public static final int PICTURE_TYPE_ILLUSTRATION = 18;
    public static final int PICTURE_TYPE_LEAD_ARTIST_PERFORMER = 7;
    public static final int PICTURE_TYPE_LEAFLET_PAGE = 5;
    public static final int PICTURE_TYPE_LYRICIST = 12;
    public static final int PICTURE_TYPE_MEDIA = 6;
    public static final int PICTURE_TYPE_MOVIE_VIDEO_SCREEN_CAPTURE = 16;
    public static final int PICTURE_TYPE_OTHER = 0;
    public static final int PICTURE_TYPE_PUBLISHER_STUDIO_LOGO = 20;
    public static final int PICTURE_TYPE_RECORDING_LOCATION = 13;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence albumArtist;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence albumTitle;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence artist;

    @androidx.annotation.Nullable
    public final byte[] artworkData;

    @androidx.annotation.Nullable
    public final java.lang.Integer artworkDataType;

    @androidx.annotation.Nullable
    public final android.net.Uri artworkUri;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence compilation;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence composer;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence conductor;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence description;

    @androidx.annotation.Nullable
    public final java.lang.Integer discNumber;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence displayTitle;

    @androidx.annotation.Nullable
    public final android.os.Bundle extras;

    @androidx.annotation.Nullable
    public final java.lang.Integer folderType;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence genre;

    @androidx.annotation.Nullable
    public final java.lang.Boolean isBrowsable;

    @androidx.annotation.Nullable
    public final java.lang.Boolean isPlayable;

    @androidx.annotation.Nullable
    public final java.lang.Integer mediaType;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.Rating overallRating;

    @androidx.annotation.Nullable
    public final java.lang.Integer recordingDay;

    @androidx.annotation.Nullable
    public final java.lang.Integer recordingMonth;

    @androidx.annotation.Nullable
    public final java.lang.Integer recordingYear;

    @androidx.annotation.Nullable
    public final java.lang.Integer releaseDay;

    @androidx.annotation.Nullable
    public final java.lang.Integer releaseMonth;

    @androidx.annotation.Nullable
    public final java.lang.Integer releaseYear;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence station;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence subtitle;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence title;

    @androidx.annotation.Nullable
    public final java.lang.Integer totalDiscCount;

    @androidx.annotation.Nullable
    public final java.lang.Integer totalTrackCount;

    @androidx.annotation.Nullable
    public final java.lang.Integer trackNumber;

    @androidx.annotation.Nullable
    public final com.google.android.exoplayer2.Rating userRating;

    @androidx.annotation.Nullable
    public final java.lang.CharSequence writer;

    @androidx.annotation.Nullable
    @java.lang.Deprecated
    public final java.lang.Integer year;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.MediaMetadata$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class Builder {

        @androidx.annotation.Nullable
        private java.lang.CharSequence albumArtist;

        @androidx.annotation.Nullable
        private java.lang.CharSequence albumTitle;

        @androidx.annotation.Nullable
        private java.lang.CharSequence artist;

        @androidx.annotation.Nullable
        private byte[] artworkData;

        @androidx.annotation.Nullable
        private java.lang.Integer artworkDataType;

        @androidx.annotation.Nullable
        private android.net.Uri artworkUri;

        @androidx.annotation.Nullable
        private java.lang.CharSequence compilation;

        @androidx.annotation.Nullable
        private java.lang.CharSequence composer;

        @androidx.annotation.Nullable
        private java.lang.CharSequence conductor;

        @androidx.annotation.Nullable
        private java.lang.CharSequence description;

        @androidx.annotation.Nullable
        private java.lang.Integer discNumber;

        @androidx.annotation.Nullable
        private java.lang.CharSequence displayTitle;

        @androidx.annotation.Nullable
        private android.os.Bundle extras;

        @androidx.annotation.Nullable
        private java.lang.Integer folderType;

        @androidx.annotation.Nullable
        private java.lang.CharSequence genre;

        @androidx.annotation.Nullable
        private java.lang.Boolean isBrowsable;

        @androidx.annotation.Nullable
        private java.lang.Boolean isPlayable;

        @androidx.annotation.Nullable
        private java.lang.Integer mediaType;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.Rating overallRating;

        @androidx.annotation.Nullable
        private java.lang.Integer recordingDay;

        @androidx.annotation.Nullable
        private java.lang.Integer recordingMonth;

        @androidx.annotation.Nullable
        private java.lang.Integer recordingYear;

        @androidx.annotation.Nullable
        private java.lang.Integer releaseDay;

        @androidx.annotation.Nullable
        private java.lang.Integer releaseMonth;

        @androidx.annotation.Nullable
        private java.lang.Integer releaseYear;

        @androidx.annotation.Nullable
        private java.lang.CharSequence station;

        @androidx.annotation.Nullable
        private java.lang.CharSequence subtitle;

        @androidx.annotation.Nullable
        private java.lang.CharSequence title;

        @androidx.annotation.Nullable
        private java.lang.Integer totalDiscCount;

        @androidx.annotation.Nullable
        private java.lang.Integer totalTrackCount;

        @androidx.annotation.Nullable
        private java.lang.Integer trackNumber;

        @androidx.annotation.Nullable
        private com.google.android.exoplayer2.Rating userRating;

        @androidx.annotation.Nullable
        private java.lang.CharSequence writer;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        private Builder(com.google.android.exoplayer2.MediaMetadata r2) {
                r1 = this;
                r1.<init>()
                java.lang.CharSequence r0 = r2.title
                r1.title = r0
                java.lang.CharSequence r0 = r2.artist
                r1.artist = r0
                java.lang.CharSequence r0 = r2.albumTitle
                r1.albumTitle = r0
                java.lang.CharSequence r0 = r2.albumArtist
                r1.albumArtist = r0
                java.lang.CharSequence r0 = r2.displayTitle
                r1.displayTitle = r0
                java.lang.CharSequence r0 = r2.subtitle
                r1.subtitle = r0
                java.lang.CharSequence r0 = r2.description
                r1.description = r0
                com.google.android.exoplayer2.Rating r0 = r2.userRating
                r1.userRating = r0
                com.google.android.exoplayer2.Rating r0 = r2.overallRating
                r1.overallRating = r0
                byte[] r0 = r2.artworkData
                r1.artworkData = r0
                java.lang.Integer r0 = r2.artworkDataType
                r1.artworkDataType = r0
                android.net.Uri r0 = r2.artworkUri
                r1.artworkUri = r0
                java.lang.Integer r0 = r2.trackNumber
                r1.trackNumber = r0
                java.lang.Integer r0 = r2.totalTrackCount
                r1.totalTrackCount = r0
                java.lang.Integer r0 = r2.folderType
                r1.folderType = r0
                java.lang.Boolean r0 = r2.isBrowsable
                r1.isBrowsable = r0
                java.lang.Boolean r0 = r2.isPlayable
                r1.isPlayable = r0
                java.lang.Integer r0 = r2.recordingYear
                r1.recordingYear = r0
                java.lang.Integer r0 = r2.recordingMonth
                r1.recordingMonth = r0
                java.lang.Integer r0 = r2.recordingDay
                r1.recordingDay = r0
                java.lang.Integer r0 = r2.releaseYear
                r1.releaseYear = r0
                java.lang.Integer r0 = r2.releaseMonth
                r1.releaseMonth = r0
                java.lang.Integer r0 = r2.releaseDay
                r1.releaseDay = r0
                java.lang.CharSequence r0 = r2.writer
                r1.writer = r0
                java.lang.CharSequence r0 = r2.composer
                r1.composer = r0
                java.lang.CharSequence r0 = r2.conductor
                r1.conductor = r0
                java.lang.Integer r0 = r2.discNumber
                r1.discNumber = r0
                java.lang.Integer r0 = r2.totalDiscCount
                r1.totalDiscCount = r0
                java.lang.CharSequence r0 = r2.genre
                r1.genre = r0
                java.lang.CharSequence r0 = r2.compilation
                r1.compilation = r0
                java.lang.CharSequence r0 = r2.station
                r1.station = r0
                java.lang.Integer r0 = r2.mediaType
                r1.mediaType = r0
                android.os.Bundle r2 = r2.extras
                r1.extras = r2
                return
        }

        public /* synthetic */ Builder(com.google.android.exoplayer2.MediaMetadata r1, com.google.android.exoplayer2.MediaMetadata.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ java.lang.Boolean access$100(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Boolean r0 = r0.isBrowsable
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$1000(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.description
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.Rating access$1100(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                com.google.android.exoplayer2.Rating r0 = r0.userRating
                return r0
        }

        public static /* synthetic */ com.google.android.exoplayer2.Rating access$1200(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                com.google.android.exoplayer2.Rating r0 = r0.overallRating
                return r0
        }

        public static /* synthetic */ byte[] access$1300(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                byte[] r0 = r0.artworkData
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1400(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.artworkDataType
                return r0
        }

        public static /* synthetic */ android.net.Uri access$1500(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                android.net.Uri r0 = r0.artworkUri
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1600(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.trackNumber
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1700(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.totalTrackCount
                return r0
        }

        public static /* synthetic */ java.lang.Boolean access$1800(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Boolean r0 = r0.isPlayable
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$1900(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.recordingYear
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$200(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.folderType
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2000(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.recordingMonth
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2100(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.recordingDay
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2200(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.releaseYear
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2300(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.releaseMonth
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2400(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.releaseDay
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$2500(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.writer
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$2600(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.composer
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$2700(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.conductor
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2800(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.discNumber
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$2900(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.totalDiscCount
                return r0
        }

        public static /* synthetic */ java.lang.Integer access$300(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.Integer r0 = r0.mediaType
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$3000(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.genre
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$3100(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.compilation
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$3200(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.station
                return r0
        }

        public static /* synthetic */ android.os.Bundle access$3300(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                android.os.Bundle r0 = r0.extras
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$400(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.title
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$500(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.artist
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$600(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.albumTitle
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$700(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.albumArtist
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$800(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.displayTitle
                return r0
        }

        public static /* synthetic */ java.lang.CharSequence access$900(com.google.android.exoplayer2.MediaMetadata.Builder r0) {
                java.lang.CharSequence r0 = r0.subtitle
                return r0
        }

        public com.google.android.exoplayer2.MediaMetadata build() {
                r2 = this;
                com.google.android.exoplayer2.MediaMetadata r0 = new com.google.android.exoplayer2.MediaMetadata
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder maybeSetArtworkData(byte[] r4, int r5) {
                r3 = this;
                byte[] r0 = r3.artworkData
                if (r0 == 0) goto L1f
                java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
                r1 = 3
                java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
                if (r0 != 0) goto L1f
                java.lang.Integer r0 = r3.artworkDataType
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r1)
                if (r0 != 0) goto L2d
            L1f:
                java.lang.Object r4 = r4.clone()
                byte[] r4 = (byte[]) r4
                r3.artworkData = r4
                java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
                r3.artworkDataType = r4
            L2d:
                return r3
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder populate(@androidx.annotation.Nullable com.google.android.exoplayer2.MediaMetadata r3) {
                r2 = this;
                if (r3 != 0) goto L3
                return r2
            L3:
                java.lang.CharSequence r0 = r3.title
                if (r0 == 0) goto La
                r2.setTitle(r0)
            La:
                java.lang.CharSequence r0 = r3.artist
                if (r0 == 0) goto L11
                r2.setArtist(r0)
            L11:
                java.lang.CharSequence r0 = r3.albumTitle
                if (r0 == 0) goto L18
                r2.setAlbumTitle(r0)
            L18:
                java.lang.CharSequence r0 = r3.albumArtist
                if (r0 == 0) goto L1f
                r2.setAlbumArtist(r0)
            L1f:
                java.lang.CharSequence r0 = r3.displayTitle
                if (r0 == 0) goto L26
                r2.setDisplayTitle(r0)
            L26:
                java.lang.CharSequence r0 = r3.subtitle
                if (r0 == 0) goto L2d
                r2.setSubtitle(r0)
            L2d:
                java.lang.CharSequence r0 = r3.description
                if (r0 == 0) goto L34
                r2.setDescription(r0)
            L34:
                com.google.android.exoplayer2.Rating r0 = r3.userRating
                if (r0 == 0) goto L3b
                r2.setUserRating(r0)
            L3b:
                com.google.android.exoplayer2.Rating r0 = r3.overallRating
                if (r0 == 0) goto L42
                r2.setOverallRating(r0)
            L42:
                byte[] r0 = r3.artworkData
                if (r0 == 0) goto L4b
                java.lang.Integer r1 = r3.artworkDataType
                r2.setArtworkData(r0, r1)
            L4b:
                android.net.Uri r0 = r3.artworkUri
                if (r0 == 0) goto L52
                r2.setArtworkUri(r0)
            L52:
                java.lang.Integer r0 = r3.trackNumber
                if (r0 == 0) goto L59
                r2.setTrackNumber(r0)
            L59:
                java.lang.Integer r0 = r3.totalTrackCount
                if (r0 == 0) goto L60
                r2.setTotalTrackCount(r0)
            L60:
                java.lang.Integer r0 = r3.folderType
                if (r0 == 0) goto L67
                r2.setFolderType(r0)
            L67:
                java.lang.Boolean r0 = r3.isBrowsable
                if (r0 == 0) goto L6e
                r2.setIsBrowsable(r0)
            L6e:
                java.lang.Boolean r0 = r3.isPlayable
                if (r0 == 0) goto L75
                r2.setIsPlayable(r0)
            L75:
                java.lang.Integer r0 = r3.year
                if (r0 == 0) goto L7c
                r2.setRecordingYear(r0)
            L7c:
                java.lang.Integer r0 = r3.recordingYear
                if (r0 == 0) goto L83
                r2.setRecordingYear(r0)
            L83:
                java.lang.Integer r0 = r3.recordingMonth
                if (r0 == 0) goto L8a
                r2.setRecordingMonth(r0)
            L8a:
                java.lang.Integer r0 = r3.recordingDay
                if (r0 == 0) goto L91
                r2.setRecordingDay(r0)
            L91:
                java.lang.Integer r0 = r3.releaseYear
                if (r0 == 0) goto L98
                r2.setReleaseYear(r0)
            L98:
                java.lang.Integer r0 = r3.releaseMonth
                if (r0 == 0) goto L9f
                r2.setReleaseMonth(r0)
            L9f:
                java.lang.Integer r0 = r3.releaseDay
                if (r0 == 0) goto La6
                r2.setReleaseDay(r0)
            La6:
                java.lang.CharSequence r0 = r3.writer
                if (r0 == 0) goto Lad
                r2.setWriter(r0)
            Lad:
                java.lang.CharSequence r0 = r3.composer
                if (r0 == 0) goto Lb4
                r2.setComposer(r0)
            Lb4:
                java.lang.CharSequence r0 = r3.conductor
                if (r0 == 0) goto Lbb
                r2.setConductor(r0)
            Lbb:
                java.lang.Integer r0 = r3.discNumber
                if (r0 == 0) goto Lc2
                r2.setDiscNumber(r0)
            Lc2:
                java.lang.Integer r0 = r3.totalDiscCount
                if (r0 == 0) goto Lc9
                r2.setTotalDiscCount(r0)
            Lc9:
                java.lang.CharSequence r0 = r3.genre
                if (r0 == 0) goto Ld0
                r2.setGenre(r0)
            Ld0:
                java.lang.CharSequence r0 = r3.compilation
                if (r0 == 0) goto Ld7
                r2.setCompilation(r0)
            Ld7:
                java.lang.CharSequence r0 = r3.station
                if (r0 == 0) goto Lde
                r2.setStation(r0)
            Lde:
                java.lang.Integer r0 = r3.mediaType
                if (r0 == 0) goto Le5
                r2.setMediaType(r0)
            Le5:
                android.os.Bundle r3 = r3.extras
                if (r3 == 0) goto Lec
                r2.setExtras(r3)
            Lec:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder populateFromMetadata(com.google.android.exoplayer2.metadata.Metadata r3) {
                r2 = this;
                r0 = 0
            L1:
                int r1 = r3.length()
                if (r0 >= r1) goto L11
                com.google.android.exoplayer2.metadata.Metadata$Entry r1 = r3.get(r0)
                r1.populateMediaMetadata(r2)
                int r0 = r0 + 1
                goto L1
            L11:
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder populateFromMetadata(java.util.List<com.google.android.exoplayer2.metadata.Metadata> r6) {
                r5 = this;
                r0 = 0
                r1 = 0
            L2:
                int r2 = r6.size()
                if (r1 >= r2) goto L22
                java.lang.Object r2 = r6.get(r1)
                com.google.android.exoplayer2.metadata.Metadata r2 = (com.google.android.exoplayer2.metadata.Metadata) r2
                r3 = 0
            Lf:
                int r4 = r2.length()
                if (r3 >= r4) goto L1f
                com.google.android.exoplayer2.metadata.Metadata$Entry r4 = r2.get(r3)
                r4.populateMediaMetadata(r5)
                int r3 = r3 + 1
                goto Lf
            L1f:
                int r1 = r1 + 1
                goto L2
            L22:
                return r5
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setAlbumArtist(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.albumArtist = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setAlbumTitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.albumTitle = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setArtist(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.artist = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaMetadata.Builder setArtworkData(@androidx.annotation.Nullable byte[] r2) {
                r1 = this;
                r0 = 0
                com.google.android.exoplayer2.MediaMetadata$Builder r2 = r1.setArtworkData(r2, r0)
                return r2
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setArtworkData(@androidx.annotation.Nullable byte[] r1, @androidx.annotation.Nullable java.lang.Integer r2) {
                r0 = this;
                if (r1 != 0) goto L4
                r1 = 0
                goto La
            L4:
                java.lang.Object r1 = r1.clone()
                byte[] r1 = (byte[]) r1
            La:
                r0.artworkData = r1
                r0.artworkDataType = r2
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setArtworkUri(@androidx.annotation.Nullable android.net.Uri r1) {
                r0 = this;
                r0.artworkUri = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setCompilation(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.compilation = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setComposer(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.composer = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setConductor(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.conductor = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setDescription(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.description = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setDiscNumber(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.discNumber = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setDisplayTitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.displayTitle = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setExtras(@androidx.annotation.Nullable android.os.Bundle r1) {
                r0 = this;
                r0.extras = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setFolderType(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.folderType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setGenre(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.genre = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setIsBrowsable(@androidx.annotation.Nullable java.lang.Boolean r1) {
                r0 = this;
                r0.isBrowsable = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setIsPlayable(@androidx.annotation.Nullable java.lang.Boolean r1) {
                r0 = this;
                r0.isPlayable = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setMediaType(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.mediaType = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setOverallRating(@androidx.annotation.Nullable com.google.android.exoplayer2.Rating r1) {
                r0 = this;
                r0.overallRating = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setRecordingDay(@androidx.annotation.IntRange(from = 1, to = 31) @androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.recordingDay = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setRecordingMonth(@androidx.annotation.IntRange(from = 1, to = 12) @androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.recordingMonth = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setRecordingYear(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.recordingYear = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setReleaseDay(@androidx.annotation.IntRange(from = 1, to = 31) @androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.releaseDay = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setReleaseMonth(@androidx.annotation.IntRange(from = 1, to = 12) @androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.releaseMonth = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setReleaseYear(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.releaseYear = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setStation(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.station = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setSubtitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.subtitle = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setTitle(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.title = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setTotalDiscCount(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.totalDiscCount = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setTotalTrackCount(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.totalTrackCount = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setTrackNumber(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                r0.trackNumber = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setUserRating(@androidx.annotation.Nullable com.google.android.exoplayer2.Rating r1) {
                r0 = this;
                r0.userRating = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.MediaMetadata.Builder setWriter(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.writer = r1
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        @java.lang.Deprecated
        public com.google.android.exoplayer2.MediaMetadata.Builder setYear(@androidx.annotation.Nullable java.lang.Integer r1) {
                r0 = this;
                com.google.android.exoplayer2.MediaMetadata$Builder r1 = r0.setRecordingYear(r1)
                return r1
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface FolderType {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MediaType {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PictureType {
    }

    public static /* synthetic */ com.google.android.exoplayer2.MediaMetadata $r8$lambda$n4bc9ZFXKwAHBWPswIbYNYyZRds(android.os.Bundle r0) {
            com.google.android.exoplayer2.MediaMetadata r0 = fromBundle(r0)
            return r0
    }

    static {
            com.google.android.exoplayer2.MediaMetadata$Builder r0 = new com.google.android.exoplayer2.MediaMetadata$Builder
            r0.<init>()
            com.google.android.exoplayer2.MediaMetadata r0 = r0.build()
            com.google.android.exoplayer2.MediaMetadata.EMPTY = r0
            r0 = 0
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_TITLE = r0
            r0 = 1
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_ARTIST = r0
            r0 = 2
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_ALBUM_TITLE = r0
            r0 = 3
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_ALBUM_ARTIST = r0
            r0 = 4
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_DISPLAY_TITLE = r0
            r0 = 5
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_SUBTITLE = r0
            r0 = 6
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_DESCRIPTION = r0
            r0 = 8
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_USER_RATING = r0
            r0 = 9
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_OVERALL_RATING = r0
            r0 = 10
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_ARTWORK_DATA = r0
            r0 = 11
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_ARTWORK_URI = r0
            r0 = 12
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_TRACK_NUMBER = r0
            r0 = 13
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_TOTAL_TRACK_COUNT = r0
            r0 = 14
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_FOLDER_TYPE = r0
            r0 = 15
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_IS_PLAYABLE = r0
            r0 = 16
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_RECORDING_YEAR = r0
            r0 = 17
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_RECORDING_MONTH = r0
            r0 = 18
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_RECORDING_DAY = r0
            r0 = 19
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_RELEASE_YEAR = r0
            r0 = 20
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_RELEASE_MONTH = r0
            r0 = 21
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_RELEASE_DAY = r0
            r0 = 22
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_WRITER = r0
            r0 = 23
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_COMPOSER = r0
            r0 = 24
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_CONDUCTOR = r0
            r0 = 25
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_DISC_NUMBER = r0
            r0 = 26
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_TOTAL_DISC_COUNT = r0
            r0 = 27
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_GENRE = r0
            r0 = 28
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_COMPILATION = r0
            r0 = 29
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_ARTWORK_DATA_TYPE = r0
            r0 = 30
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_STATION = r0
            r0 = 31
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_MEDIA_TYPE = r0
            r0 = 32
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_IS_BROWSABLE = r0
            r0 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
            com.google.android.exoplayer2.MediaMetadata.FIELD_EXTRAS = r0
            com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$11
            com.google.android.exoplayer2.MediaMetadata.CREATOR = r0
            return
    }

    private MediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r7) {
            r6 = this;
            r6.<init>()
            java.lang.Boolean r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$100(r7)
            java.lang.Integer r1 = com.google.android.exoplayer2.MediaMetadata.Builder.access$200(r7)
            java.lang.Integer r2 = com.google.android.exoplayer2.MediaMetadata.Builder.access$300(r7)
            r3 = 0
            r4 = -1
            if (r0 == 0) goto L35
            boolean r5 = r0.booleanValue()
            if (r5 != 0) goto L1e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            goto L56
        L1e:
            if (r1 == 0) goto L26
            int r5 = r1.intValue()
            if (r5 != r4) goto L56
        L26:
            if (r2 == 0) goto L30
            int r1 = r2.intValue()
            int r3 = getFolderTypeFromMediaType(r1)
        L30:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            goto L56
        L35:
            if (r1 == 0) goto L56
            int r0 = r1.intValue()
            if (r0 == r4) goto L3e
            r3 = 1
        L3e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            boolean r3 = r0.booleanValue()
            if (r3 == 0) goto L56
            if (r2 != 0) goto L56
            int r2 = r1.intValue()
            int r2 = getMediaTypeFromFolderType(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L56:
            java.lang.CharSequence r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$400(r7)
            r6.title = r3
            java.lang.CharSequence r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$500(r7)
            r6.artist = r3
            java.lang.CharSequence r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$600(r7)
            r6.albumTitle = r3
            java.lang.CharSequence r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$700(r7)
            r6.albumArtist = r3
            java.lang.CharSequence r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$800(r7)
            r6.displayTitle = r3
            java.lang.CharSequence r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$900(r7)
            r6.subtitle = r3
            java.lang.CharSequence r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1000(r7)
            r6.description = r3
            com.google.android.exoplayer2.Rating r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1100(r7)
            r6.userRating = r3
            com.google.android.exoplayer2.Rating r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1200(r7)
            r6.overallRating = r3
            byte[] r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1300(r7)
            r6.artworkData = r3
            java.lang.Integer r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1400(r7)
            r6.artworkDataType = r3
            android.net.Uri r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1500(r7)
            r6.artworkUri = r3
            java.lang.Integer r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1600(r7)
            r6.trackNumber = r3
            java.lang.Integer r3 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1700(r7)
            r6.totalTrackCount = r3
            r6.folderType = r1
            r6.isBrowsable = r0
            java.lang.Boolean r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1800(r7)
            r6.isPlayable = r0
            java.lang.Integer r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1900(r7)
            r6.year = r0
            java.lang.Integer r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$1900(r7)
            r6.recordingYear = r0
            java.lang.Integer r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2000(r7)
            r6.recordingMonth = r0
            java.lang.Integer r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2100(r7)
            r6.recordingDay = r0
            java.lang.Integer r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2200(r7)
            r6.releaseYear = r0
            java.lang.Integer r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2300(r7)
            r6.releaseMonth = r0
            java.lang.Integer r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2400(r7)
            r6.releaseDay = r0
            java.lang.CharSequence r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2500(r7)
            r6.writer = r0
            java.lang.CharSequence r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2600(r7)
            r6.composer = r0
            java.lang.CharSequence r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2700(r7)
            r6.conductor = r0
            java.lang.Integer r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2800(r7)
            r6.discNumber = r0
            java.lang.Integer r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$2900(r7)
            r6.totalDiscCount = r0
            java.lang.CharSequence r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$3000(r7)
            r6.genre = r0
            java.lang.CharSequence r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$3100(r7)
            r6.compilation = r0
            java.lang.CharSequence r0 = com.google.android.exoplayer2.MediaMetadata.Builder.access$3200(r7)
            r6.station = r0
            r6.mediaType = r2
            android.os.Bundle r7 = com.google.android.exoplayer2.MediaMetadata.Builder.access$3300(r7)
            r6.extras = r7
            return
    }

    public /* synthetic */ MediaMetadata(com.google.android.exoplayer2.MediaMetadata.Builder r1, com.google.android.exoplayer2.MediaMetadata.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private static com.google.android.exoplayer2.MediaMetadata fromBundle(android.os.Bundle r5) {
            com.google.android.exoplayer2.MediaMetadata$Builder r0 = new com.google.android.exoplayer2.MediaMetadata$Builder
            r0.<init>()
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_TITLE
            java.lang.CharSequence r1 = r5.getCharSequence(r1)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r0.setTitle(r1)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ARTIST
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setArtist(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ALBUM_TITLE
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setAlbumTitle(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ALBUM_ARTIST
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setAlbumArtist(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_DISPLAY_TITLE
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setDisplayTitle(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_SUBTITLE
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setSubtitle(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_DESCRIPTION
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setDescription(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ARTWORK_DATA
            byte[] r2 = r5.getByteArray(r2)
            java.lang.String r3 = com.google.android.exoplayer2.MediaMetadata.FIELD_ARTWORK_DATA_TYPE
            boolean r4 = r5.containsKey(r3)
            if (r4 == 0) goto L62
            int r3 = r5.getInt(r3)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            goto L63
        L62:
            r3 = 0
        L63:
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setArtworkData(r2, r3)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ARTWORK_URI
            android.os.Parcelable r2 = r5.getParcelable(r2)
            android.net.Uri r2 = (android.net.Uri) r2
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setArtworkUri(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_WRITER
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setWriter(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_COMPOSER
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setComposer(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_CONDUCTOR
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setConductor(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_GENRE
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setGenre(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_COMPILATION
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setCompilation(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_STATION
            java.lang.CharSequence r2 = r5.getCharSequence(r2)
            com.google.android.exoplayer2.MediaMetadata$Builder r1 = r1.setStation(r2)
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_EXTRAS
            android.os.Bundle r2 = r5.getBundle(r2)
            r1.setExtras(r2)
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_USER_RATING
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto Ld1
            android.os.Bundle r1 = r5.getBundle(r1)
            if (r1 == 0) goto Ld1
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.Rating> r2 = com.google.android.exoplayer2.Rating.CREATOR
            com.google.android.exoplayer2.Bundleable r1 = r2.fromBundle(r1)
            com.google.android.exoplayer2.Rating r1 = (com.google.android.exoplayer2.Rating) r1
            r0.setUserRating(r1)
        Ld1:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_OVERALL_RATING
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto Lea
            android.os.Bundle r1 = r5.getBundle(r1)
            if (r1 == 0) goto Lea
            com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.Rating> r2 = com.google.android.exoplayer2.Rating.CREATOR
            com.google.android.exoplayer2.Bundleable r1 = r2.fromBundle(r1)
            com.google.android.exoplayer2.Rating r1 = (com.google.android.exoplayer2.Rating) r1
            r0.setOverallRating(r1)
        Lea:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_TRACK_NUMBER
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto Lfd
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setTrackNumber(r1)
        Lfd:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_TOTAL_TRACK_COUNT
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L110
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setTotalTrackCount(r1)
        L110:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_FOLDER_TYPE
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L123
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setFolderType(r1)
        L123:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_IS_BROWSABLE
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L136
            boolean r1 = r5.getBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setIsBrowsable(r1)
        L136:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_IS_PLAYABLE
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L149
            boolean r1 = r5.getBoolean(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.setIsPlayable(r1)
        L149:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_RECORDING_YEAR
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L15c
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setRecordingYear(r1)
        L15c:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_RECORDING_MONTH
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L16f
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setRecordingMonth(r1)
        L16f:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_RECORDING_DAY
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L182
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setRecordingDay(r1)
        L182:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_RELEASE_YEAR
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L195
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setReleaseYear(r1)
        L195:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_RELEASE_MONTH
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L1a8
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setReleaseMonth(r1)
        L1a8:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_RELEASE_DAY
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L1bb
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setReleaseDay(r1)
        L1bb:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_DISC_NUMBER
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L1ce
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setDiscNumber(r1)
        L1ce:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_TOTAL_DISC_COUNT
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L1e1
            int r1 = r5.getInt(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.setTotalDiscCount(r1)
        L1e1:
            java.lang.String r1 = com.google.android.exoplayer2.MediaMetadata.FIELD_MEDIA_TYPE
            boolean r2 = r5.containsKey(r1)
            if (r2 == 0) goto L1f4
            int r5 = r5.getInt(r1)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.setMediaType(r5)
        L1f4:
            com.google.android.exoplayer2.MediaMetadata r5 = r0.build()
            return r5
    }

    private static int getFolderTypeFromMediaType(int r0) {
            switch(r0) {
                case 1: goto Lf;
                case 2: goto Lf;
                case 3: goto Lf;
                case 4: goto Lf;
                case 5: goto Lf;
                case 6: goto Lf;
                case 7: goto Lf;
                case 8: goto Lf;
                case 9: goto Lf;
                case 10: goto Lf;
                case 11: goto Lf;
                case 12: goto Lf;
                case 13: goto Lf;
                case 14: goto Lf;
                case 15: goto Lf;
                case 16: goto Lf;
                case 17: goto Lf;
                case 18: goto Lf;
                case 19: goto Lf;
                case 20: goto L3;
                case 21: goto Ld;
                case 22: goto Lb;
                case 23: goto L9;
                case 24: goto L7;
                case 25: goto L5;
                case 26: goto L3;
                case 27: goto L3;
                case 28: goto L3;
                case 29: goto L3;
                case 30: goto L3;
                case 31: goto Lf;
                case 32: goto Lf;
                case 33: goto Lf;
                case 34: goto Lf;
                case 35: goto Lf;
                default: goto L3;
            }
        L3:
            r0 = 0
            return r0
        L5:
            r0 = 6
            return r0
        L7:
            r0 = 5
            return r0
        L9:
            r0 = 4
            return r0
        Lb:
            r0 = 3
            return r0
        Ld:
            r0 = 2
            return r0
        Lf:
            r0 = 1
            return r0
    }

    private static int getMediaTypeFromFolderType(int r0) {
            switch(r0) {
                case 1: goto L15;
                case 2: goto L12;
                case 3: goto Lf;
                case 4: goto Lc;
                case 5: goto L9;
                case 6: goto L6;
                default: goto L3;
            }
        L3:
            r0 = 20
            return r0
        L6:
            r0 = 25
            return r0
        L9:
            r0 = 24
            return r0
        Lc:
            r0 = 23
            return r0
        Lf:
            r0 = 22
            return r0
        L12:
            r0 = 21
            return r0
        L15:
            r0 = 0
            return r0
    }

    public com.google.android.exoplayer2.MediaMetadata.Builder buildUpon() {
            r2 = this;
            com.google.android.exoplayer2.MediaMetadata$Builder r0 = new com.google.android.exoplayer2.MediaMetadata$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    public boolean equals(@androidx.annotation.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            r1 = 0
            if (r5 == 0) goto L156
            java.lang.Class<com.google.android.exoplayer2.MediaMetadata> r2 = com.google.android.exoplayer2.MediaMetadata.class
            java.lang.Class r3 = r5.getClass()
            if (r2 == r3) goto L11
            goto L156
        L11:
            com.google.android.exoplayer2.MediaMetadata r5 = (com.google.android.exoplayer2.MediaMetadata) r5
            java.lang.CharSequence r2 = r4.title
            java.lang.CharSequence r3 = r5.title
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.artist
            java.lang.CharSequence r3 = r5.artist
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.albumTitle
            java.lang.CharSequence r3 = r5.albumTitle
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.albumArtist
            java.lang.CharSequence r3 = r5.albumArtist
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.displayTitle
            java.lang.CharSequence r3 = r5.displayTitle
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.subtitle
            java.lang.CharSequence r3 = r5.subtitle
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.description
            java.lang.CharSequence r3 = r5.description
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            com.google.android.exoplayer2.Rating r2 = r4.userRating
            com.google.android.exoplayer2.Rating r3 = r5.userRating
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            com.google.android.exoplayer2.Rating r2 = r4.overallRating
            com.google.android.exoplayer2.Rating r3 = r5.overallRating
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            byte[] r2 = r4.artworkData
            byte[] r3 = r5.artworkData
            boolean r2 = java.util.Arrays.equals(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.artworkDataType
            java.lang.Integer r3 = r5.artworkDataType
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            android.net.Uri r2 = r4.artworkUri
            android.net.Uri r3 = r5.artworkUri
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.trackNumber
            java.lang.Integer r3 = r5.trackNumber
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.totalTrackCount
            java.lang.Integer r3 = r5.totalTrackCount
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.folderType
            java.lang.Integer r3 = r5.folderType
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Boolean r2 = r4.isBrowsable
            java.lang.Boolean r3 = r5.isBrowsable
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Boolean r2 = r4.isPlayable
            java.lang.Boolean r3 = r5.isPlayable
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.recordingYear
            java.lang.Integer r3 = r5.recordingYear
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.recordingMonth
            java.lang.Integer r3 = r5.recordingMonth
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.recordingDay
            java.lang.Integer r3 = r5.recordingDay
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.releaseYear
            java.lang.Integer r3 = r5.releaseYear
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.releaseMonth
            java.lang.Integer r3 = r5.releaseMonth
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.releaseDay
            java.lang.Integer r3 = r5.releaseDay
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.writer
            java.lang.CharSequence r3 = r5.writer
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.composer
            java.lang.CharSequence r3 = r5.composer
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.conductor
            java.lang.CharSequence r3 = r5.conductor
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.discNumber
            java.lang.Integer r3 = r5.discNumber
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.totalDiscCount
            java.lang.Integer r3 = r5.totalDiscCount
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.genre
            java.lang.CharSequence r3 = r5.genre
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.compilation
            java.lang.CharSequence r3 = r5.compilation
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.CharSequence r2 = r4.station
            java.lang.CharSequence r3 = r5.station
            boolean r2 = com.google.android.exoplayer2.util.Util.areEqual(r2, r3)
            if (r2 == 0) goto L154
            java.lang.Integer r2 = r4.mediaType
            java.lang.Integer r5 = r5.mediaType
            boolean r5 = com.google.android.exoplayer2.util.Util.areEqual(r2, r5)
            if (r5 == 0) goto L154
            goto L155
        L154:
            r0 = 0
        L155:
            return r0
        L156:
            return r1
    }

    public int hashCode() {
            r3 = this;
            r0 = 32
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.CharSequence r1 = r3.title
            r2 = 0
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.artist
            r2 = 1
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.albumTitle
            r2 = 2
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.albumArtist
            r2 = 3
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.displayTitle
            r2 = 4
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.subtitle
            r2 = 5
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.description
            r2 = 6
            r0[r2] = r1
            com.google.android.exoplayer2.Rating r1 = r3.userRating
            r2 = 7
            r0[r2] = r1
            com.google.android.exoplayer2.Rating r1 = r3.overallRating
            r2 = 8
            r0[r2] = r1
            byte[] r1 = r3.artworkData
            int r1 = java.util.Arrays.hashCode(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 9
            r0[r2] = r1
            java.lang.Integer r1 = r3.artworkDataType
            r2 = 10
            r0[r2] = r1
            android.net.Uri r1 = r3.artworkUri
            r2 = 11
            r0[r2] = r1
            java.lang.Integer r1 = r3.trackNumber
            r2 = 12
            r0[r2] = r1
            java.lang.Integer r1 = r3.totalTrackCount
            r2 = 13
            r0[r2] = r1
            java.lang.Integer r1 = r3.folderType
            r2 = 14
            r0[r2] = r1
            java.lang.Boolean r1 = r3.isBrowsable
            r2 = 15
            r0[r2] = r1
            java.lang.Boolean r1 = r3.isPlayable
            r2 = 16
            r0[r2] = r1
            java.lang.Integer r1 = r3.recordingYear
            r2 = 17
            r0[r2] = r1
            java.lang.Integer r1 = r3.recordingMonth
            r2 = 18
            r0[r2] = r1
            java.lang.Integer r1 = r3.recordingDay
            r2 = 19
            r0[r2] = r1
            java.lang.Integer r1 = r3.releaseYear
            r2 = 20
            r0[r2] = r1
            java.lang.Integer r1 = r3.releaseMonth
            r2 = 21
            r0[r2] = r1
            java.lang.Integer r1 = r3.releaseDay
            r2 = 22
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.writer
            r2 = 23
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.composer
            r2 = 24
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.conductor
            r2 = 25
            r0[r2] = r1
            java.lang.Integer r1 = r3.discNumber
            r2 = 26
            r0[r2] = r1
            java.lang.Integer r1 = r3.totalDiscCount
            r2 = 27
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.genre
            r2 = 28
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.compilation
            r2 = 29
            r0[r2] = r1
            java.lang.CharSequence r1 = r3.station
            r2 = 30
            r0[r2] = r1
            java.lang.Integer r1 = r3.mediaType
            r2 = 31
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.CharSequence r1 = r3.title
            if (r1 == 0) goto Le
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_TITLE
            r0.putCharSequence(r2, r1)
        Le:
            java.lang.CharSequence r1 = r3.artist
            if (r1 == 0) goto L17
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ARTIST
            r0.putCharSequence(r2, r1)
        L17:
            java.lang.CharSequence r1 = r3.albumTitle
            if (r1 == 0) goto L20
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ALBUM_TITLE
            r0.putCharSequence(r2, r1)
        L20:
            java.lang.CharSequence r1 = r3.albumArtist
            if (r1 == 0) goto L29
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ALBUM_ARTIST
            r0.putCharSequence(r2, r1)
        L29:
            java.lang.CharSequence r1 = r3.displayTitle
            if (r1 == 0) goto L32
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_DISPLAY_TITLE
            r0.putCharSequence(r2, r1)
        L32:
            java.lang.CharSequence r1 = r3.subtitle
            if (r1 == 0) goto L3b
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_SUBTITLE
            r0.putCharSequence(r2, r1)
        L3b:
            java.lang.CharSequence r1 = r3.description
            if (r1 == 0) goto L44
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_DESCRIPTION
            r0.putCharSequence(r2, r1)
        L44:
            byte[] r1 = r3.artworkData
            if (r1 == 0) goto L4d
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ARTWORK_DATA
            r0.putByteArray(r2, r1)
        L4d:
            android.net.Uri r1 = r3.artworkUri
            if (r1 == 0) goto L56
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ARTWORK_URI
            r0.putParcelable(r2, r1)
        L56:
            java.lang.CharSequence r1 = r3.writer
            if (r1 == 0) goto L5f
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_WRITER
            r0.putCharSequence(r2, r1)
        L5f:
            java.lang.CharSequence r1 = r3.composer
            if (r1 == 0) goto L68
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_COMPOSER
            r0.putCharSequence(r2, r1)
        L68:
            java.lang.CharSequence r1 = r3.conductor
            if (r1 == 0) goto L71
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_CONDUCTOR
            r0.putCharSequence(r2, r1)
        L71:
            java.lang.CharSequence r1 = r3.genre
            if (r1 == 0) goto L7a
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_GENRE
            r0.putCharSequence(r2, r1)
        L7a:
            java.lang.CharSequence r1 = r3.compilation
            if (r1 == 0) goto L83
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_COMPILATION
            r0.putCharSequence(r2, r1)
        L83:
            java.lang.CharSequence r1 = r3.station
            if (r1 == 0) goto L8c
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_STATION
            r0.putCharSequence(r2, r1)
        L8c:
            com.google.android.exoplayer2.Rating r1 = r3.userRating
            if (r1 == 0) goto L99
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_USER_RATING
            android.os.Bundle r1 = r1.toBundle()
            r0.putBundle(r2, r1)
        L99:
            com.google.android.exoplayer2.Rating r1 = r3.overallRating
            if (r1 == 0) goto La6
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_OVERALL_RATING
            android.os.Bundle r1 = r1.toBundle()
            r0.putBundle(r2, r1)
        La6:
            java.lang.Integer r1 = r3.trackNumber
            if (r1 == 0) goto Lb3
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_TRACK_NUMBER
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        Lb3:
            java.lang.Integer r1 = r3.totalTrackCount
            if (r1 == 0) goto Lc0
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_TOTAL_TRACK_COUNT
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        Lc0:
            java.lang.Integer r1 = r3.folderType
            if (r1 == 0) goto Lcd
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_FOLDER_TYPE
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        Lcd:
            java.lang.Boolean r1 = r3.isBrowsable
            if (r1 == 0) goto Lda
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_IS_BROWSABLE
            boolean r1 = r1.booleanValue()
            r0.putBoolean(r2, r1)
        Lda:
            java.lang.Boolean r1 = r3.isPlayable
            if (r1 == 0) goto Le7
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_IS_PLAYABLE
            boolean r1 = r1.booleanValue()
            r0.putBoolean(r2, r1)
        Le7:
            java.lang.Integer r1 = r3.recordingYear
            if (r1 == 0) goto Lf4
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_RECORDING_YEAR
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        Lf4:
            java.lang.Integer r1 = r3.recordingMonth
            if (r1 == 0) goto L101
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_RECORDING_MONTH
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L101:
            java.lang.Integer r1 = r3.recordingDay
            if (r1 == 0) goto L10e
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_RECORDING_DAY
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L10e:
            java.lang.Integer r1 = r3.releaseYear
            if (r1 == 0) goto L11b
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_RELEASE_YEAR
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L11b:
            java.lang.Integer r1 = r3.releaseMonth
            if (r1 == 0) goto L128
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_RELEASE_MONTH
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L128:
            java.lang.Integer r1 = r3.releaseDay
            if (r1 == 0) goto L135
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_RELEASE_DAY
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L135:
            java.lang.Integer r1 = r3.discNumber
            if (r1 == 0) goto L142
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_DISC_NUMBER
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L142:
            java.lang.Integer r1 = r3.totalDiscCount
            if (r1 == 0) goto L14f
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_TOTAL_DISC_COUNT
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L14f:
            java.lang.Integer r1 = r3.artworkDataType
            if (r1 == 0) goto L15c
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_ARTWORK_DATA_TYPE
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L15c:
            java.lang.Integer r1 = r3.mediaType
            if (r1 == 0) goto L169
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_MEDIA_TYPE
            int r1 = r1.intValue()
            r0.putInt(r2, r1)
        L169:
            android.os.Bundle r1 = r3.extras
            if (r1 == 0) goto L172
            java.lang.String r2 = com.google.android.exoplayer2.MediaMetadata.FIELD_EXTRAS
            r0.putBundle(r2, r1)
        L172:
            return r0
    }
}
