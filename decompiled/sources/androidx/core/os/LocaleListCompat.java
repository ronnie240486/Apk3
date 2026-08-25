package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class LocaleListCompat {
    private static final androidx.core.os.LocaleListCompat sEmptyLocaleList = null;
    private final androidx.core.os.LocaleListInterface mImpl;

    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private static final java.util.Locale[] PSEUDO_LOCALE = null;

        static {
                r0 = 2
                java.util.Locale[] r0 = new java.util.Locale[r0]
                java.util.Locale r1 = new java.util.Locale
                java.lang.String r2 = "en"
                java.lang.String r3 = "XA"
                r1.<init>(r2, r3)
                r2 = 0
                r0[r2] = r1
                java.util.Locale r1 = new java.util.Locale
                java.lang.String r2 = "ar"
                java.lang.String r3 = "XB"
                r1.<init>(r2, r3)
                r2 = 1
                r0[r2] = r1
                androidx.core.os.LocaleListCompat.Api21Impl.PSEUDO_LOCALE = r0
                return
        }

        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.util.Locale forLanguageTag(java.lang.String r0) {
                java.util.Locale r0 = java.util.Locale.forLanguageTag(r0)
                return r0
        }

        private static boolean isPseudoLocale(java.util.Locale r5) {
                java.util.Locale[] r0 = androidx.core.os.LocaleListCompat.Api21Impl.PSEUDO_LOCALE
                int r1 = r0.length
                r2 = 0
                r3 = 0
            L5:
                if (r3 >= r1) goto L14
                r4 = r0[r3]
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L11
                r5 = 1
                return r5
            L11:
                int r3 = r3 + 1
                goto L5
            L14:
                return r2
        }

        @androidx.annotation.DoNotInline
        public static boolean matchesLanguageAndScript(@androidx.annotation.NonNull java.util.Locale r4, @androidx.annotation.NonNull java.util.Locale r5) {
                boolean r0 = r4.equals(r5)
                r1 = 1
                if (r0 == 0) goto L8
                return r1
            L8:
                java.lang.String r0 = r4.getLanguage()
                java.lang.String r2 = r5.getLanguage()
                boolean r0 = r0.equals(r2)
                r2 = 0
                if (r0 != 0) goto L18
                return r2
            L18:
                boolean r0 = isPseudoLocale(r4)
                if (r0 != 0) goto L4f
                boolean r0 = isPseudoLocale(r5)
                if (r0 == 0) goto L25
                goto L4f
            L25:
                java.lang.String r0 = androidx.core.text.ICUCompat.maximizeAndGetScript(r4)
                boolean r3 = r0.isEmpty()
                if (r3 == 0) goto L46
                java.lang.String r4 = r4.getCountry()
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L45
                java.lang.String r5 = r5.getCountry()
                boolean r4 = r4.equals(r5)
                if (r4 == 0) goto L44
                goto L45
            L44:
                r1 = 0
            L45:
                return r1
            L46:
                java.lang.String r4 = androidx.core.text.ICUCompat.maximizeAndGetScript(r5)
                boolean r4 = r0.equals(r4)
                return r4
            L4f:
                return r2
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.os.LocaleList createLocaleList(java.util.Locale... r1) {
                android.os.LocaleList r0 = new android.os.LocaleList
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.os.LocaleList getAdjustedDefault() {
                android.os.LocaleList r0 = android.os.LocaleList.getAdjustedDefault()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.os.LocaleList getDefault() {
                android.os.LocaleList r0 = android.os.LocaleList.getDefault()
                return r0
        }
    }

    static {
            r0 = 0
            java.util.Locale[] r0 = new java.util.Locale[r0]
            androidx.core.os.LocaleListCompat r0 = create(r0)
            androidx.core.os.LocaleListCompat.sEmptyLocaleList = r0
            return
    }

    private LocaleListCompat(androidx.core.os.LocaleListInterface r1) {
            r0 = this;
            r0.<init>()
            r0.mImpl = r1
            return
    }

    @androidx.annotation.NonNull
    public static androidx.core.os.LocaleListCompat create(@androidx.annotation.NonNull java.util.Locale... r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lf
            android.os.LocaleList r2 = androidx.core.os.LocaleListCompat.Api24Impl.createLocaleList(r2)
            androidx.core.os.LocaleListCompat r2 = wrap(r2)
            return r2
        Lf:
            androidx.core.os.LocaleListCompat r0 = new androidx.core.os.LocaleListCompat
            androidx.core.os.LocaleListCompatWrapper r1 = new androidx.core.os.LocaleListCompatWrapper
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    public static java.util.Locale forLanguageTagCompat(java.lang.String r6) {
            java.lang.String r0 = "-"
            boolean r1 = r6.contains(r0)
            r2 = -1
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L37
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L1f
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r2 = r0[r5]
            r0 = r0[r3]
            r6.<init>(r1, r2, r0)
            return r6
        L1f:
            int r1 = r0.length
            if (r1 <= r5) goto L2c
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r0 = r0[r5]
            r6.<init>(r1, r0)
            return r6
        L2c:
            int r1 = r0.length
            if (r1 != r5) goto L6a
            java.util.Locale r6 = new java.util.Locale
            r0 = r0[r4]
            r6.<init>(r0)
            return r6
        L37:
            java.lang.String r0 = "_"
            boolean r1 = r6.contains(r0)
            if (r1 == 0) goto L78
            java.lang.String[] r0 = r6.split(r0, r2)
            int r1 = r0.length
            if (r1 <= r3) goto L52
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r2 = r0[r5]
            r0 = r0[r3]
            r6.<init>(r1, r2, r0)
            return r6
        L52:
            int r1 = r0.length
            if (r1 <= r5) goto L5f
            java.util.Locale r6 = new java.util.Locale
            r1 = r0[r4]
            r0 = r0[r5]
            r6.<init>(r1, r0)
            return r6
        L5f:
            int r1 = r0.length
            if (r1 != r5) goto L6a
            java.util.Locale r6 = new java.util.Locale
            r0 = r0[r4]
            r6.<init>(r0)
            return r6
        L6a:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can not parse language tag: ["
            java.lang.String r2 = "]"
            java.lang.String r6 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r6, r2)
            r0.<init>(r6)
            throw r0
        L78:
            java.util.Locale r0 = new java.util.Locale
            r0.<init>(r6)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.os.LocaleListCompat forLanguageTags(@androidx.annotation.Nullable java.lang.String r4) {
            if (r4 == 0) goto L26
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L9
            goto L26
        L9:
            r0 = -1
            java.lang.String r1 = ","
            java.lang.String[] r4 = r4.split(r1, r0)
            int r0 = r4.length
            java.util.Locale[] r1 = new java.util.Locale[r0]
            r2 = 0
        L14:
            if (r2 >= r0) goto L21
            r3 = r4[r2]
            java.util.Locale r3 = androidx.core.os.LocaleListCompat.Api21Impl.forLanguageTag(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L14
        L21:
            androidx.core.os.LocaleListCompat r4 = create(r1)
            return r4
        L26:
            androidx.core.os.LocaleListCompat r4 = getEmptyLocaleList()
            return r4
    }

    @androidx.annotation.NonNull
    @androidx.annotation.Size(min = 1)
    public static androidx.core.os.LocaleListCompat getAdjustedDefault() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lf
            android.os.LocaleList r0 = androidx.core.os.LocaleListCompat.Api24Impl.getAdjustedDefault()
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
        Lf:
            r0 = 1
            java.util.Locale[] r0 = new java.util.Locale[r0]
            r1 = 0
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0[r1] = r2
            androidx.core.os.LocaleListCompat r0 = create(r0)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.Size(min = 1)
    public static androidx.core.os.LocaleListCompat getDefault() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto Lf
            android.os.LocaleList r0 = androidx.core.os.LocaleListCompat.Api24Impl.getDefault()
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
        Lf:
            r0 = 1
            java.util.Locale[] r0 = new java.util.Locale[r0]
            r1 = 0
            java.util.Locale r2 = java.util.Locale.getDefault()
            r0[r1] = r2
            androidx.core.os.LocaleListCompat r0 = create(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.os.LocaleListCompat getEmptyLocaleList() {
            androidx.core.os.LocaleListCompat r0 = androidx.core.os.LocaleListCompat.sEmptyLocaleList
            return r0
    }

    @androidx.annotation.OptIn(markerClass = {androidx.core.os.BuildCompat.PrereleaseSdkCheck.class})
    @androidx.annotation.RequiresApi(21)
    public static boolean matchesLanguageAndScript(@androidx.annotation.NonNull java.util.Locale r1, @androidx.annotation.NonNull java.util.Locale r2) {
            boolean r0 = androidx.core.os.BuildCompat.isAtLeastT()
            if (r0 == 0) goto Lb
            boolean r1 = android.os.LocaleList.matchesLanguageAndScript(r1, r2)
            return r1
        Lb:
            boolean r1 = androidx.core.os.LocaleListCompat.Api21Impl.matchesLanguageAndScript(r1, r2)
            return r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(24)
    public static androidx.core.os.LocaleListCompat wrap(@androidx.annotation.NonNull android.os.LocaleList r2) {
            androidx.core.os.LocaleListCompat r0 = new androidx.core.os.LocaleListCompat
            androidx.core.os.LocaleListPlatformWrapper r1 = new androidx.core.os.LocaleListPlatformWrapper
            r1.<init>(r2)
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.RequiresApi(24)
    @java.lang.Deprecated
    public static androidx.core.os.LocaleListCompat wrap(java.lang.Object r0) {
            android.os.LocaleList r0 = (android.os.LocaleList) r0
            androidx.core.os.LocaleListCompat r0 = wrap(r0)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof androidx.core.os.LocaleListCompat
            if (r0 == 0) goto L12
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            androidx.core.os.LocaleListCompat r2 = (androidx.core.os.LocaleListCompat) r2
            androidx.core.os.LocaleListInterface r2 = r2.mImpl
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            return r2
    }

    @androidx.annotation.Nullable
    public java.util.Locale get(int r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.util.Locale r2 = r0.get(r2)
            return r2
    }

    @androidx.annotation.Nullable
    public java.util.Locale getFirstMatch(@androidx.annotation.NonNull java.lang.String[] r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.util.Locale r2 = r0.getFirstMatch(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r0 = r0.hashCode()
            return r0
    }

    @androidx.annotation.IntRange(from = -1)
    public int indexOf(@androidx.annotation.Nullable java.util.Locale r2) {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r2 = r0.indexOf(r2)
            return r2
    }

    public boolean isEmpty() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            boolean r0 = r0.isEmpty()
            return r0
    }

    @androidx.annotation.IntRange(from = 0)
    public int size() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            int r0 = r0.size()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toLanguageTags() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.String r0 = r0.toLanguageTags()
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.Object unwrap() {
            r1 = this;
            androidx.core.os.LocaleListInterface r0 = r1.mImpl
            java.lang.Object r0 = r0.getLocaleList()
            return r0
    }
}
