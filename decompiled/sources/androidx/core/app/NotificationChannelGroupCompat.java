package androidx.core.app;

/* JADX INFO: loaded from: classes3.dex */
public class NotificationChannelGroupCompat {
    private boolean mBlocked;
    private java.util.List<androidx.core.app.NotificationChannelCompat> mChannels;
    public java.lang.String mDescription;
    public final java.lang.String mId;
    public java.lang.CharSequence mName;

    public static class Builder {
        public final androidx.core.app.NotificationChannelGroupCompat mGroup;

        public Builder(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                r1.<init>()
                androidx.core.app.NotificationChannelGroupCompat r0 = new androidx.core.app.NotificationChannelGroupCompat
                r0.<init>(r2)
                r1.mGroup = r0
                return
        }

        @androidx.annotation.NonNull
        public androidx.core.app.NotificationChannelGroupCompat build() {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.app.NotificationChannelGroupCompat.Builder setDescription(@androidx.annotation.Nullable java.lang.String r2) {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                r0.mDescription = r2
                return r1
        }

        @androidx.annotation.NonNull
        public androidx.core.app.NotificationChannelGroupCompat.Builder setName(@androidx.annotation.Nullable java.lang.CharSequence r2) {
                r1 = this;
                androidx.core.app.NotificationChannelGroupCompat r0 = r1.mGroup
                r0.mName = r2
                return r1
        }
    }

    @androidx.annotation.RequiresApi(26)
    public NotificationChannelGroupCompat(@androidx.annotation.NonNull android.app.NotificationChannelGroup r4, @androidx.annotation.NonNull java.util.List<android.app.NotificationChannel> r5) {
            r3 = this;
            java.lang.String r0 = r4.getId()
            r3.<init>()
            java.util.List r1 = java.util.Collections.emptyList()
            r3.mChannels = r1
            java.lang.Object r0 = androidx.core.util.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            r3.mId = r0
            java.lang.CharSequence r0 = r4.getName()
            r3.mName = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L27
            java.lang.String r2 = r4.getDescription()
            r3.mDescription = r2
        L27:
            if (r0 < r1) goto L3a
            boolean r5 = r4.isBlocked()
            r3.mBlocked = r5
            java.util.List r4 = r4.getChannels()
            java.util.List r4 = r3.getChannelsCompat(r4)
            r3.mChannels = r4
            goto L40
        L3a:
            java.util.List r4 = r3.getChannelsCompat(r5)
            r3.mChannels = r4
        L40:
            return
    }

    public NotificationChannelGroupCompat(@androidx.annotation.NonNull java.lang.String r2) {
            r1 = this;
            r1.<init>()
            java.util.List r0 = java.util.Collections.emptyList()
            r1.mChannels = r0
            java.lang.Object r2 = androidx.core.util.Preconditions.checkNotNull(r2)
            java.lang.String r2 = (java.lang.String) r2
            r1.mId = r2
            return
    }

    @androidx.annotation.RequiresApi(26)
    private java.util.List<androidx.core.app.NotificationChannelCompat> getChannelsCompat(java.util.List<android.app.NotificationChannel> r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r5.next()
            android.app.NotificationChannel r1 = (android.app.NotificationChannel) r1
            java.lang.String r2 = r4.mId
            java.lang.String r3 = r1.getGroup()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L9
            androidx.core.app.NotificationChannelCompat r2 = new androidx.core.app.NotificationChannelCompat
            r2.<init>(r1)
            r0.add(r2)
            goto L9
        L2a:
            return r0
    }

    @androidx.annotation.NonNull
    public java.util.List<androidx.core.app.NotificationChannelCompat> getChannels() {
            r1 = this;
            java.util.List<androidx.core.app.NotificationChannelCompat> r0 = r1.mChannels
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.mDescription
            return r0
    }

    @androidx.annotation.NonNull
    public java.lang.String getId() {
            r1 = this;
            java.lang.String r0 = r1.mId
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getName() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mName
            return r0
    }

    public final android.app.NotificationChannelGroup getNotificationChannelGroup() {
            r4 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L8
            r0 = 0
            return r0
        L8:
            android.app.NotificationChannelGroup r1 = new android.app.NotificationChannelGroup
            java.lang.String r2 = r4.mId
            java.lang.CharSequence r3 = r4.mName
            r1.<init>(r2, r3)
            r2 = 28
            if (r0 < r2) goto L1a
            java.lang.String r0 = r4.mDescription
            r1.setDescription(r0)
        L1a:
            return r1
    }

    public boolean isBlocked() {
            r1 = this;
            boolean r0 = r1.mBlocked
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.app.NotificationChannelGroupCompat.Builder toBuilder() {
            r2 = this;
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = new androidx.core.app.NotificationChannelGroupCompat$Builder
            java.lang.String r1 = r2.mId
            r0.<init>(r1)
            java.lang.CharSequence r1 = r2.mName
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = r0.setName(r1)
            java.lang.String r1 = r2.mDescription
            androidx.core.app.NotificationChannelGroupCompat$Builder r0 = r0.setDescription(r1)
            return r0
    }
}
