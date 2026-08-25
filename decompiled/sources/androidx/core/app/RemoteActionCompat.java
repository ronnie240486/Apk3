package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public final class RemoteActionCompat implements androidx.versionedparcelable.VersionedParcelable {

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public android.app.PendingIntent mActionIntent;

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.CharSequence mContentDescription;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean mEnabled;

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public androidx.core.graphics.drawable.IconCompat mIcon;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public boolean mShouldShowIcon;

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public java.lang.CharSequence mTitle;

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.app.RemoteAction createRemoteAction(android.graphics.drawable.Icon r1, java.lang.CharSequence r2, java.lang.CharSequence r3, android.app.PendingIntent r4) {
                android.app.RemoteAction r0 = new android.app.RemoteAction
                r0.<init>(r1, r2, r3, r4)
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.app.PendingIntent getActionIntent(android.app.RemoteAction r0) {
                android.app.PendingIntent r0 = r0.getActionIntent()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getContentDescription(android.app.RemoteAction r0) {
                java.lang.CharSequence r0 = r0.getContentDescription()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.graphics.drawable.Icon getIcon(android.app.RemoteAction r0) {
                android.graphics.drawable.Icon r0 = r0.getIcon()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static java.lang.CharSequence getTitle(android.app.RemoteAction r0) {
                java.lang.CharSequence r0 = r0.getTitle()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isEnabled(android.app.RemoteAction r0) {
                boolean r0 = r0.isEnabled()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setEnabled(android.app.RemoteAction r0, boolean r1) {
                r0.setEnabled(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setShouldShowIcon(android.app.RemoteAction r0, boolean r1) {
                r0.setShouldShowIcon(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean shouldShowIcon(android.app.RemoteAction r0) {
                boolean r0 = r0.shouldShowIcon()
                return r0
        }
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public RemoteActionCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    public RemoteActionCompat(@androidx.annotation.NonNull androidx.core.app.RemoteActionCompat r2) {
            r1 = this;
            r1.<init>()
            androidx.core.util.Preconditions.checkNotNull(r2)
            androidx.core.graphics.drawable.IconCompat r0 = r2.mIcon
            r1.mIcon = r0
            java.lang.CharSequence r0 = r2.mTitle
            r1.mTitle = r0
            java.lang.CharSequence r0 = r2.mContentDescription
            r1.mContentDescription = r0
            android.app.PendingIntent r0 = r2.mActionIntent
            r1.mActionIntent = r0
            boolean r0 = r2.mEnabled
            r1.mEnabled = r0
            boolean r2 = r2.mShouldShowIcon
            r1.mShouldShowIcon = r2
            return
    }

    public RemoteActionCompat(@androidx.annotation.NonNull androidx.core.graphics.drawable.IconCompat r1, @androidx.annotation.NonNull java.lang.CharSequence r2, @androidx.annotation.NonNull java.lang.CharSequence r3, @androidx.annotation.NonNull android.app.PendingIntent r4) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
            androidx.core.graphics.drawable.IconCompat r1 = (androidx.core.graphics.drawable.IconCompat) r1
            r0.mIcon = r1
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.mTitle = r1
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r3)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.mContentDescription = r1
            java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r4)
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
            r0.mActionIntent = r1
            r1 = 1
            r0.mEnabled = r1
            r0.mShouldShowIcon = r1
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(26)
    public static androidx.core.app.RemoteActionCompat createFromRemoteAction(@androidx.annotation.NonNull android.app.RemoteAction r5) {
            androidx.core.util.Preconditions.checkNotNull(r5)
            androidx.core.app.RemoteActionCompat r0 = new androidx.core.app.RemoteActionCompat
            android.graphics.drawable.Icon r1 = androidx.core.app.RemoteActionCompat.Api26Impl.getIcon(r5)
            androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r1)
            java.lang.CharSequence r2 = androidx.core.app.RemoteActionCompat.Api26Impl.getTitle(r5)
            java.lang.CharSequence r3 = androidx.core.app.RemoteActionCompat.Api26Impl.getContentDescription(r5)
            android.app.PendingIntent r4 = androidx.core.app.RemoteActionCompat.Api26Impl.getActionIntent(r5)
            r0.<init>(r1, r2, r3, r4)
            boolean r1 = androidx.core.app.RemoteActionCompat.Api26Impl.isEnabled(r5)
            r0.setEnabled(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L30
            boolean r5 = androidx.core.app.RemoteActionCompat.Api28Impl.shouldShowIcon(r5)
            r0.setShouldShowIcon(r5)
        L30:
            return r0
    }

    @androidx.annotation.NonNull
    public android.app.PendingIntent getActionIntent() {
            r1 = this;
            android.app.PendingIntent r0 = r1.mActionIntent
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.CharSequence getContentDescription() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mContentDescription
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.graphics.drawable.IconCompat getIcon() {
            r1 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r1.mIcon
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.CharSequence getTitle() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            return r0
    }

    public void setEnabled(boolean r1) {
            r0 = this;
            r0.mEnabled = r1
            return
    }

    public void setShouldShowIcon(boolean r1) {
            r0 = this;
            r0.mShouldShowIcon = r1
            return
    }

    @android.annotation.SuppressLint({"KotlinPropertyAccess"})
    public boolean shouldShowIcon() {
            r1 = this;
            boolean r0 = r1.mShouldShowIcon
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(26)
    public android.app.RemoteAction toRemoteAction() {
            r4 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r4.mIcon
            android.graphics.drawable.Icon r0 = r0.toIcon()
            java.lang.CharSequence r1 = r4.mTitle
            java.lang.CharSequence r2 = r4.mContentDescription
            android.app.PendingIntent r3 = r4.mActionIntent
            android.app.RemoteAction r0 = androidx.core.app.RemoteActionCompat.Api26Impl.createRemoteAction(r0, r1, r2, r3)
            boolean r1 = r4.isEnabled()
            androidx.core.app.RemoteActionCompat.Api26Impl.setEnabled(r0, r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r1 < r2) goto L24
            boolean r1 = r4.shouldShowIcon()
            androidx.core.app.RemoteActionCompat.Api28Impl.setShouldShowIcon(r0, r1)
        L24:
            return r0
    }
}
