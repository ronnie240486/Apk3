package androidx.core.content.pm;

/* JADX INFO: loaded from: classes.dex */
public class ShortcutInfoCompat {
    private static final java.lang.String EXTRA_LOCUS_ID = "extraLocusId";
    private static final java.lang.String EXTRA_LONG_LIVED = "extraLongLived";
    private static final java.lang.String EXTRA_PERSON_ = "extraPerson_";
    private static final java.lang.String EXTRA_PERSON_COUNT = "extraPersonCount";
    private static final java.lang.String EXTRA_SLICE_URI = "extraSliceUri";
    public static final int SURFACE_LAUNCHER = 1;
    public android.content.ComponentName mActivity;
    public java.util.Set<java.lang.String> mCategories;
    public android.content.Context mContext;
    public java.lang.CharSequence mDisabledMessage;
    public int mDisabledReason;
    public int mExcludedSurfaces;
    public android.os.PersistableBundle mExtras;
    public boolean mHasKeyFieldsOnly;
    public androidx.core.graphics.drawable.IconCompat mIcon;
    public java.lang.String mId;
    public android.content.Intent[] mIntents;
    public boolean mIsAlwaysBadged;
    public boolean mIsCached;
    public boolean mIsDeclaredInManifest;
    public boolean mIsDynamic;
    public boolean mIsEnabled;
    public boolean mIsImmutable;
    public boolean mIsLongLived;
    public boolean mIsPinned;
    public java.lang.CharSequence mLabel;
    public long mLastChangedTimestamp;

    @androidx.annotation.Nullable
    public androidx.core.content.LocusIdCompat mLocusId;
    public java.lang.CharSequence mLongLabel;
    public java.lang.String mPackageName;
    public androidx.core.app.Person[] mPersons;
    public int mRank;
    public android.os.Bundle mTransientExtras;
    public android.os.UserHandle mUser;

    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {
        private java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> mCapabilityBindingParams;
        private java.util.Set<java.lang.String> mCapabilityBindings;
        private final androidx.core.content.pm.ShortcutInfoCompat mInfo;
        private boolean mIsConversation;
        private android.net.Uri mSliceUri;

        @androidx.annotation.RequiresApi(25)
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.NonNull android.content.pm.ShortcutInfo r8) {
                r6 = this;
                r6.<init>()
                androidx.core.content.pm.ShortcutInfoCompat r0 = new androidx.core.content.pm.ShortcutInfoCompat
                r0.<init>()
                r6.mInfo = r0
                r0.mContext = r7
                java.lang.String r7 = r8.getId()
                r0.mId = r7
                java.lang.String r7 = r8.getPackage()
                r0.mPackageName = r7
                android.content.Intent[] r7 = r8.getIntents()
                int r1 = r7.length
                java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r1)
                android.content.Intent[] r7 = (android.content.Intent[]) r7
                r0.mIntents = r7
                android.content.ComponentName r7 = r8.getActivity()
                r0.mActivity = r7
                java.lang.CharSequence r7 = r8.getShortLabel()
                r0.mLabel = r7
                java.lang.CharSequence r7 = r8.getLongLabel()
                r0.mLongLabel = r7
                java.lang.CharSequence r7 = r8.getDisabledMessage()
                r0.mDisabledMessage = r7
                int r7 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 28
                if (r7 < r2) goto L4b
                int r7 = r8.getDisabledReason()
                r0.mDisabledReason = r7
                goto L56
            L4b:
                boolean r7 = r8.isEnabled()
                if (r7 == 0) goto L53
                r7 = 0
                goto L54
            L53:
                r7 = 3
            L54:
                r0.mDisabledReason = r7
            L56:
                java.util.Set r7 = r8.getCategories()
                r0.mCategories = r7
                android.os.PersistableBundle r7 = r8.getExtras()
                if (r7 == 0) goto L8e
                java.lang.String r2 = "extraPersonCount"
                boolean r3 = r7.containsKey(r2)
                if (r3 != 0) goto L6b
                goto L8e
            L6b:
                int r2 = r7.getInt(r2)
                androidx.core.app.Person[] r3 = new androidx.core.app.Person[r2]
            L71:
                if (r1 >= r2) goto L8f
                java.lang.String r4 = "extraPerson_"
                java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r4)
                int r5 = r1 + 1
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                android.os.PersistableBundle r4 = r7.getPersistableBundle(r4)
                androidx.core.app.Person r4 = androidx.core.app.Person.fromPersistableBundle(r4)
                r3[r1] = r4
                r1 = r5
                goto L71
            L8e:
                r3 = 0
            L8f:
                r0.mPersons = r3
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                android.os.UserHandle r0 = r8.getUserHandle()
                r7.mUser = r0
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                long r0 = r8.getLastChangedTimestamp()
                r7.mLastChangedTimestamp = r0
                int r7 = android.os.Build.VERSION.SDK_INT
                r0 = 30
                if (r7 < r0) goto Laf
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                boolean r0 = r8.isCached()
                r7.mIsCached = r0
            Laf:
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                boolean r0 = r8.isDynamic()
                r7.mIsDynamic = r0
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                boolean r0 = r8.isPinned()
                r7.mIsPinned = r0
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                boolean r0 = r8.isDeclaredInManifest()
                r7.mIsDeclaredInManifest = r0
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                boolean r0 = r8.isImmutable()
                r7.mIsImmutable = r0
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                boolean r0 = r8.isEnabled()
                r7.mIsEnabled = r0
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                boolean r0 = r8.hasKeyFieldsOnly()
                r7.mHasKeyFieldsOnly = r0
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                androidx.core.content.LocusIdCompat r0 = androidx.core.content.pm.ShortcutInfoCompat.getLocusId(r8)
                r7.mLocusId = r0
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                int r0 = r8.getRank()
                r7.mRank = r0
                androidx.core.content.pm.ShortcutInfoCompat r7 = r6.mInfo
                android.os.PersistableBundle r8 = r8.getExtras()
                r7.mExtras = r8
                return
        }

        public Builder(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.lang.String r3) {
                r1 = this;
                r1.<init>()
                androidx.core.content.pm.ShortcutInfoCompat r0 = new androidx.core.content.pm.ShortcutInfoCompat
                r0.<init>()
                r1.mInfo = r0
                r0.mContext = r2
                r0.mId = r3
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public Builder(@androidx.annotation.NonNull androidx.core.content.pm.ShortcutInfoCompat r4) {
                r3 = this;
                r3.<init>()
                androidx.core.content.pm.ShortcutInfoCompat r0 = new androidx.core.content.pm.ShortcutInfoCompat
                r0.<init>()
                r3.mInfo = r0
                android.content.Context r1 = r4.mContext
                r0.mContext = r1
                java.lang.String r1 = r4.mId
                r0.mId = r1
                java.lang.String r1 = r4.mPackageName
                r0.mPackageName = r1
                android.content.Intent[] r1 = r4.mIntents
                int r2 = r1.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                android.content.Intent[] r1 = (android.content.Intent[]) r1
                r0.mIntents = r1
                android.content.ComponentName r1 = r4.mActivity
                r0.mActivity = r1
                java.lang.CharSequence r1 = r4.mLabel
                r0.mLabel = r1
                java.lang.CharSequence r1 = r4.mLongLabel
                r0.mLongLabel = r1
                java.lang.CharSequence r1 = r4.mDisabledMessage
                r0.mDisabledMessage = r1
                int r1 = r4.mDisabledReason
                r0.mDisabledReason = r1
                androidx.core.graphics.drawable.IconCompat r1 = r4.mIcon
                r0.mIcon = r1
                boolean r1 = r4.mIsAlwaysBadged
                r0.mIsAlwaysBadged = r1
                android.os.UserHandle r1 = r4.mUser
                r0.mUser = r1
                long r1 = r4.mLastChangedTimestamp
                r0.mLastChangedTimestamp = r1
                boolean r1 = r4.mIsCached
                r0.mIsCached = r1
                boolean r1 = r4.mIsDynamic
                r0.mIsDynamic = r1
                boolean r1 = r4.mIsPinned
                r0.mIsPinned = r1
                boolean r1 = r4.mIsDeclaredInManifest
                r0.mIsDeclaredInManifest = r1
                boolean r1 = r4.mIsImmutable
                r0.mIsImmutable = r1
                boolean r1 = r4.mIsEnabled
                r0.mIsEnabled = r1
                androidx.core.content.LocusIdCompat r1 = r4.mLocusId
                r0.mLocusId = r1
                boolean r1 = r4.mIsLongLived
                r0.mIsLongLived = r1
                boolean r1 = r4.mHasKeyFieldsOnly
                r0.mHasKeyFieldsOnly = r1
                int r1 = r4.mRank
                r0.mRank = r1
                androidx.core.app.Person[] r1 = r4.mPersons
                if (r1 == 0) goto L7a
                int r2 = r1.length
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                androidx.core.app.Person[] r1 = (androidx.core.app.Person[]) r1
                r0.mPersons = r1
            L7a:
                java.util.Set<java.lang.String> r1 = r4.mCategories
                if (r1 == 0) goto L87
                java.util.HashSet r1 = new java.util.HashSet
                java.util.Set<java.lang.String> r2 = r4.mCategories
                r1.<init>(r2)
                r0.mCategories = r1
            L87:
                android.os.PersistableBundle r1 = r4.mExtras
                if (r1 == 0) goto L8d
                r0.mExtras = r1
            L8d:
                int r4 = r4.mExcludedSurfaces
                r0.mExcludedSurfaces = r4
                return
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"MissingGetterMatchingBuilder"})
        public androidx.core.content.pm.ShortcutInfoCompat.Builder addCapabilityBinding(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                java.util.Set<java.lang.String> r0 = r1.mCapabilityBindings
                if (r0 != 0) goto Lb
                java.util.HashSet r0 = new java.util.HashSet
                r0.<init>()
                r1.mCapabilityBindings = r0
            Lb:
                java.util.Set<java.lang.String> r0 = r1.mCapabilityBindings
                r0.add(r2)
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"MissingGetterMatchingBuilder"})
        public androidx.core.content.pm.ShortcutInfoCompat.Builder addCapabilityBinding(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull java.lang.String r4, @androidx.annotation.NonNull java.util.List<java.lang.String> r5) {
                r2 = this;
                r2.addCapabilityBinding(r3)
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L31
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r2.mCapabilityBindingParams
                if (r0 != 0) goto L14
                java.util.HashMap r0 = new java.util.HashMap
                r0.<init>()
                r2.mCapabilityBindingParams = r0
            L14:
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r2.mCapabilityBindingParams
                java.lang.Object r0 = r0.get(r3)
                if (r0 != 0) goto L26
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r2.mCapabilityBindingParams
                java.util.HashMap r1 = new java.util.HashMap
                r1.<init>()
                r0.put(r3, r1)
            L26:
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r2.mCapabilityBindingParams
                java.lang.Object r3 = r0.get(r3)
                java.util.Map r3 = (java.util.Map) r3
                r3.put(r4, r5)
            L31:
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat build() {
                r9 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r9.mInfo
                java.lang.CharSequence r0 = r0.mLabel
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 != 0) goto Le6
                androidx.core.content.pm.ShortcutInfoCompat r0 = r9.mInfo
                android.content.Intent[] r1 = r0.mIntents
                if (r1 == 0) goto Lde
                int r1 = r1.length
                if (r1 == 0) goto Lde
                boolean r1 = r9.mIsConversation
                if (r1 == 0) goto L29
                androidx.core.content.LocusIdCompat r1 = r0.mLocusId
                if (r1 != 0) goto L24
                androidx.core.content.LocusIdCompat r1 = new androidx.core.content.LocusIdCompat
                java.lang.String r2 = r0.mId
                r1.<init>(r2)
                r0.mLocusId = r1
            L24:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r9.mInfo
                r1 = 1
                r0.mIsLongLived = r1
            L29:
                java.util.Set<java.lang.String> r0 = r9.mCapabilityBindings
                if (r0 == 0) goto L43
                androidx.core.content.pm.ShortcutInfoCompat r0 = r9.mInfo
                java.util.Set<java.lang.String> r1 = r0.mCategories
                if (r1 != 0) goto L3a
                java.util.HashSet r1 = new java.util.HashSet
                r1.<init>()
                r0.mCategories = r1
            L3a:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r9.mInfo
                java.util.Set<java.lang.String> r0 = r0.mCategories
                java.util.Set<java.lang.String> r1 = r9.mCapabilityBindings
                r0.addAll(r1)
            L43:
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r9.mCapabilityBindingParams
                if (r0 == 0) goto Lbb
                androidx.core.content.pm.ShortcutInfoCompat r0 = r9.mInfo
                android.os.PersistableBundle r1 = r0.mExtras
                if (r1 != 0) goto L54
                android.os.PersistableBundle r1 = new android.os.PersistableBundle
                r1.<init>()
                r0.mExtras = r1
            L54:
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r0 = r9.mCapabilityBindingParams
                java.util.Set r0 = r0.keySet()
                java.util.Iterator r0 = r0.iterator()
            L5e:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto Lbb
                java.lang.Object r1 = r0.next()
                java.lang.String r1 = (java.lang.String) r1
                java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.List<java.lang.String>>> r2 = r9.mCapabilityBindingParams
                java.lang.Object r2 = r2.get(r1)
                java.util.Map r2 = (java.util.Map) r2
                java.util.Set r3 = r2.keySet()
                androidx.core.content.pm.ShortcutInfoCompat r4 = r9.mInfo
                android.os.PersistableBundle r4 = r4.mExtras
                r5 = 0
                java.lang.String[] r6 = new java.lang.String[r5]
                java.lang.Object[] r3 = r3.toArray(r6)
                java.lang.String[] r3 = (java.lang.String[]) r3
                r4.putStringArray(r1, r3)
                java.util.Set r3 = r2.keySet()
                java.util.Iterator r3 = r3.iterator()
            L8e:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L5e
                java.lang.Object r4 = r3.next()
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r6 = r2.get(r4)
                java.util.List r6 = (java.util.List) r6
                androidx.core.content.pm.ShortcutInfoCompat r7 = r9.mInfo
                android.os.PersistableBundle r7 = r7.mExtras
                java.lang.String r8 = "/"
                java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r8, r4)
                if (r6 != 0) goto Laf
                java.lang.String[] r6 = new java.lang.String[r5]
                goto Lb7
            Laf:
                java.lang.String[] r8 = new java.lang.String[r5]
                java.lang.Object[] r6 = r6.toArray(r8)
                java.lang.String[] r6 = (java.lang.String[]) r6
            Lb7:
                r7.putStringArray(r4, r6)
                goto L8e
            Lbb:
                android.net.Uri r0 = r9.mSliceUri
                if (r0 == 0) goto Ldb
                androidx.core.content.pm.ShortcutInfoCompat r0 = r9.mInfo
                android.os.PersistableBundle r1 = r0.mExtras
                if (r1 != 0) goto Lcc
                android.os.PersistableBundle r1 = new android.os.PersistableBundle
                r1.<init>()
                r0.mExtras = r1
            Lcc:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r9.mInfo
                android.os.PersistableBundle r0 = r0.mExtras
                android.net.Uri r1 = r9.mSliceUri
                java.lang.String r1 = androidx.core.net.UriCompat.toSafeString(r1)
                java.lang.String r2 = "extraSliceUri"
                r0.putString(r2, r1)
            Ldb:
                androidx.core.content.pm.ShortcutInfoCompat r0 = r9.mInfo
                return r0
            Lde:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Shortcut must have an intent"
                r0.<init>(r1)
                throw r0
            Le6:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r1 = "Shortcut must have a non-empty label"
                r0.<init>(r1)
                throw r0
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setActivity(@androidx.annotation.NonNull android.content.ComponentName r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mActivity = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setAlwaysBadged() {
                r2 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r2.mInfo
                r1 = 1
                r0.mIsAlwaysBadged = r1
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setCategories(@androidx.annotation.NonNull java.util.Set<java.lang.String> r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mCategories = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setDisabledMessage(@androidx.annotation.NonNull java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mDisabledMessage = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setExcludedFromSurfaces(int r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mExcludedSurfaces = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setExtras(@androidx.annotation.NonNull android.os.PersistableBundle r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mExtras = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIcon(androidx.core.graphics.drawable.IconCompat r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mIcon = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntent(@androidx.annotation.NonNull android.content.Intent r3) {
                r2 = this;
                r0 = 1
                android.content.Intent[] r0 = new android.content.Intent[r0]
                r1 = 0
                r0[r1] = r3
                androidx.core.content.pm.ShortcutInfoCompat$Builder r3 = r2.setIntents(r0)
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIntents(@androidx.annotation.NonNull android.content.Intent[] r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mIntents = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setIsConversation() {
                r1 = this;
                r0 = 1
                r1.mIsConversation = r0
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLocusId(@androidx.annotation.Nullable androidx.core.content.LocusIdCompat r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mLocusId = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLabel(@androidx.annotation.NonNull java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mLongLabel = r2
                return r1
        }

        @androidx.annotation.NonNull
        @java.lang.Deprecated
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived() {
                r2 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r2.mInfo
                r1 = 1
                r0.mIsLongLived = r1
                return r2
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setLongLived(boolean r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mIsLongLived = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPerson(@androidx.annotation.NonNull androidx.core.app.Person r3) {
                r2 = this;
                r0 = 1
                androidx.core.app.Person[] r0 = new androidx.core.app.Person[r0]
                r1 = 0
                r0[r1] = r3
                androidx.core.content.pm.ShortcutInfoCompat$Builder r3 = r2.setPersons(r0)
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setPersons(@androidx.annotation.NonNull androidx.core.app.Person[] r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mPersons = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setRank(int r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mRank = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setShortLabel(@androidx.annotation.NonNull java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                r0.mLabel = r2
                return r1
        }

        @androidx.annotation.NonNull
        @android.annotation.SuppressLint({"MissingGetterMatchingBuilder"})
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setSliceUri(@androidx.annotation.NonNull android.net.Uri r1) {
                r0 = this;
                r0.mSliceUri = r1
                return r0
        }

        @androidx.annotation.NonNull
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        public androidx.core.content.pm.ShortcutInfoCompat.Builder setTransientExtras(@androidx.annotation.NonNull android.os.Bundle r2) {
                r1 = this;
                androidx.core.content.pm.ShortcutInfoCompat r0 = r1.mInfo
                java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
                android.os.Bundle r2 = (android.os.Bundle) r2
                r0.mTransientExtras = r2
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface Surface {
    }

    public ShortcutInfoCompat() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mIsEnabled = r0
            return
    }

    @androidx.annotation.RequiresApi(22)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    private android.os.PersistableBundle buildLegacyExtrasBundle() {
            r5 = this;
            android.os.PersistableBundle r0 = r5.mExtras
            if (r0 != 0) goto Lb
            android.os.PersistableBundle r0 = new android.os.PersistableBundle
            r0.<init>()
            r5.mExtras = r0
        Lb:
            androidx.core.app.Person[] r0 = r5.mPersons
            if (r0 == 0) goto L3e
            int r1 = r0.length
            if (r1 <= 0) goto L3e
            android.os.PersistableBundle r1 = r5.mExtras
            int r0 = r0.length
            java.lang.String r2 = "extraPersonCount"
            r1.putInt(r2, r0)
            r0 = 0
        L1b:
            androidx.core.app.Person[] r1 = r5.mPersons
            int r1 = r1.length
            if (r0 >= r1) goto L3e
            android.os.PersistableBundle r1 = r5.mExtras
            java.lang.String r2 = "extraPerson_"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            int r3 = r0 + 1
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            androidx.core.app.Person[] r4 = r5.mPersons
            r0 = r4[r0]
            android.os.PersistableBundle r0 = r0.toPersistableBundle()
            r1.putPersistableBundle(r2, r0)
            r0 = r3
            goto L1b
        L3e:
            androidx.core.content.LocusIdCompat r0 = r5.mLocusId
            if (r0 == 0) goto L4d
            android.os.PersistableBundle r1 = r5.mExtras
            java.lang.String r0 = r0.getId()
            java.lang.String r2 = "extraLocusId"
            r1.putString(r2, r0)
        L4d:
            android.os.PersistableBundle r0 = r5.mExtras
            boolean r1 = r5.mIsLongLived
            java.lang.String r2 = "extraLongLived"
            r0.putBoolean(r2, r1)
            android.os.PersistableBundle r0 = r5.mExtras
            return r0
    }

    @androidx.annotation.RequiresApi(25)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static java.util.List<androidx.core.content.pm.ShortcutInfoCompat> fromShortcuts(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull java.util.List<android.content.pm.ShortcutInfo> r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r4.next()
            android.content.pm.ShortcutInfo r1 = (android.content.pm.ShortcutInfo) r1
            androidx.core.content.pm.ShortcutInfoCompat$Builder r2 = new androidx.core.content.pm.ShortcutInfoCompat$Builder
            r2.<init>(r3, r1)
            androidx.core.content.pm.ShortcutInfoCompat r1 = r2.build()
            r0.add(r1)
            goto Ld
        L26:
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(25)
    public static androidx.core.content.LocusIdCompat getLocusId(@androidx.annotation.NonNull android.content.pm.ShortcutInfo r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L17
            android.content.LocusId r0 = r2.getLocusId()
            if (r0 != 0) goto Le
            r2 = 0
            return r2
        Le:
            android.content.LocusId r2 = r2.getLocusId()
            androidx.core.content.LocusIdCompat r2 = androidx.core.content.LocusIdCompat.toLocusIdCompat(r2)
            return r2
        L17:
            android.os.PersistableBundle r2 = r2.getExtras()
            androidx.core.content.LocusIdCompat r2 = getLocusIdFromExtra(r2)
            return r2
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RequiresApi(25)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    private static androidx.core.content.LocusIdCompat getLocusIdFromExtra(@androidx.annotation.Nullable android.os.PersistableBundle r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "extraLocusId"
            java.lang.String r2 = r2.getString(r1)
            if (r2 != 0) goto Ld
            goto L12
        Ld:
            androidx.core.content.LocusIdCompat r0 = new androidx.core.content.LocusIdCompat
            r0.<init>(r2)
        L12:
            return r0
    }

    public final android.content.Intent addToIntent(android.content.Intent r4) {
            r3 = this;
            android.content.Intent[] r0 = r3.mIntents
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            java.lang.String r1 = "android.intent.extra.shortcut.INTENT"
            android.content.Intent r0 = r4.putExtra(r1, r0)
            java.lang.CharSequence r1 = r3.mLabel
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "android.intent.extra.shortcut.NAME"
            r0.putExtra(r2, r1)
            androidx.core.graphics.drawable.IconCompat r0 = r3.mIcon
            if (r0 == 0) goto L44
            r0 = 0
            boolean r1 = r3.mIsAlwaysBadged
            if (r1 == 0) goto L3d
            android.content.Context r1 = r3.mContext
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            android.content.ComponentName r2 = r3.mActivity
            if (r2 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r1.getActivityIcon(r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L30
            goto L31
        L30:
        L31:
            if (r0 != 0) goto L3d
            android.content.Context r0 = r3.mContext
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()
            android.graphics.drawable.Drawable r0 = r0.loadIcon(r1)
        L3d:
            androidx.core.graphics.drawable.IconCompat r1 = r3.mIcon
            android.content.Context r2 = r3.mContext
            r1.addToShortcutIntent(r4, r0, r2)
        L44:
            return r4
    }

    @androidx.annotation.Nullable
    public android.content.ComponentName getActivity() {
            r1 = this;
            android.content.ComponentName r0 = r1.mActivity
            return r0
    }

    @androidx.annotation.Nullable
    public java.util.Set<java.lang.String> getCategories() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.mCategories
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getDisabledMessage() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mDisabledMessage
            return r0
    }

    public int getDisabledReason() {
            r1 = this;
            int r0 = r1.mDisabledReason
            return r0
    }

    public int getExcludedFromSurfaces() {
            r1 = this;
            int r0 = r1.mExcludedSurfaces
            return r0
    }

    @androidx.annotation.Nullable
    public android.os.PersistableBundle getExtras() {
            r1 = this;
            android.os.PersistableBundle r0 = r1.mExtras
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public androidx.core.graphics.drawable.IconCompat getIcon() {
            r1 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r1.mIcon
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.Intent getIntent() {
            r2 = this;
            android.content.Intent[] r0 = r2.mIntents
            int r1 = r0.length
            int r1 = r1 + (-1)
            r0 = r0[r1]
            return r0
    }

    @androidx.annotation.NonNull
    public android.content.Intent[] getIntents() {
            r2 = this;
            android.content.Intent[] r0 = r2.mIntents
            int r1 = r0.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            android.content.Intent[] r0 = (android.content.Intent[]) r0
            return r0
    }

    public long getLastChangedTimestamp() {
            r2 = this;
            long r0 = r2.mLastChangedTimestamp
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.core.content.LocusIdCompat getLocusId() {
            r1 = this;
            androidx.core.content.LocusIdCompat r0 = r1.mLocusId
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getLongLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLongLabel
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getPackage() {
            r1 = this;
            java.lang.String r0 = r1.mPackageName
            return r0
    }

    public int getRank() {
            r1 = this;
            int r0 = r1.mRank
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.CharSequence getShortLabel() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mLabel
            return r0
    }

    @androidx.annotation.Nullable
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.os.Bundle getTransientExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mTransientExtras
            return r0
    }

    @androidx.annotation.Nullable
    public android.os.UserHandle getUserHandle() {
            r1 = this;
            android.os.UserHandle r0 = r1.mUser
            return r0
    }

    public boolean hasKeyFieldsOnly() {
            r1 = this;
            boolean r0 = r1.mHasKeyFieldsOnly
            return r0
    }

    public boolean isCached() {
            r1 = this;
            boolean r0 = r1.mIsCached
            return r0
    }

    public boolean isDeclaredInManifest() {
            r1 = this;
            boolean r0 = r1.mIsDeclaredInManifest
            return r0
    }

    public boolean isDynamic() {
            r1 = this;
            boolean r0 = r1.mIsDynamic
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mIsEnabled
            return r0
    }

    public boolean isExcludedFromSurfaces(int r2) {
            r1 = this;
            int r0 = r1.mExcludedSurfaces
            r2 = r2 & r0
            if (r2 == 0) goto L7
            r2 = 1
            goto L8
        L7:
            r2 = 0
        L8:
            return r2
    }

    public boolean isImmutable() {
            r1 = this;
            boolean r0 = r1.mIsImmutable
            return r0
    }

    public boolean isPinned() {
            r1 = this;
            boolean r0 = r1.mIsPinned
            return r0
    }

    @androidx.annotation.RequiresApi(25)
    public android.content.pm.ShortcutInfo toShortcutInfo() {
            r5 = this;
            android.content.pm.ShortcutInfo$Builder r0 = new android.content.pm.ShortcutInfo$Builder
            android.content.Context r1 = r5.mContext
            java.lang.String r2 = r5.mId
            r0.<init>(r1, r2)
            java.lang.CharSequence r1 = r5.mLabel
            android.content.pm.ShortcutInfo$Builder r0 = r0.setShortLabel(r1)
            android.content.Intent[] r1 = r5.mIntents
            android.content.pm.ShortcutInfo$Builder r0 = r0.setIntents(r1)
            androidx.core.graphics.drawable.IconCompat r1 = r5.mIcon
            if (r1 == 0) goto L22
            android.content.Context r2 = r5.mContext
            android.graphics.drawable.Icon r1 = r1.toIcon(r2)
            r0.setIcon(r1)
        L22:
            java.lang.CharSequence r1 = r5.mLongLabel
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L2f
            java.lang.CharSequence r1 = r5.mLongLabel
            r0.setLongLabel(r1)
        L2f:
            java.lang.CharSequence r1 = r5.mDisabledMessage
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L3c
            java.lang.CharSequence r1 = r5.mDisabledMessage
            r0.setDisabledMessage(r1)
        L3c:
            android.content.ComponentName r1 = r5.mActivity
            if (r1 == 0) goto L43
            r0.setActivity(r1)
        L43:
            java.util.Set<java.lang.String> r1 = r5.mCategories
            if (r1 == 0) goto L4a
            r0.setCategories(r1)
        L4a:
            int r1 = r5.mRank
            r0.setRank(r1)
            android.os.PersistableBundle r1 = r5.mExtras
            if (r1 == 0) goto L56
            r0.setExtras(r1)
        L56:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 29
            if (r1 < r2) goto L8a
            androidx.core.app.Person[] r1 = r5.mPersons
            if (r1 == 0) goto L79
            int r2 = r1.length
            if (r2 <= 0) goto L79
            int r1 = r1.length
            android.app.Person[] r2 = new android.app.Person[r1]
            r3 = 0
        L67:
            if (r3 >= r1) goto L76
            androidx.core.app.Person[] r4 = r5.mPersons
            r4 = r4[r3]
            android.app.Person r4 = r4.toAndroidPerson()
            r2[r3] = r4
            int r3 = r3 + 1
            goto L67
        L76:
            r0.setPersons(r2)
        L79:
            androidx.core.content.LocusIdCompat r1 = r5.mLocusId
            if (r1 == 0) goto L84
            android.content.LocusId r1 = r1.toLocusId()
            r0.setLocusId(r1)
        L84:
            boolean r1 = r5.mIsLongLived
            r0.setLongLived(r1)
            goto L91
        L8a:
            android.os.PersistableBundle r1 = r5.buildLegacyExtrasBundle()
            r0.setExtras(r1)
        L91:
            android.content.pm.ShortcutInfo r0 = r0.build()
            return r0
    }
}
