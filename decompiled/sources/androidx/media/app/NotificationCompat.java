package androidx.media.app;

/* JADX INFO: loaded from: classes2.dex */
public class NotificationCompat {

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(15)
    public static class Api15Impl {
        private Api15Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static void setContentDescription(android.widget.RemoteViews r0, int r1, java.lang.CharSequence r2) {
                r0.setContentDescription(r1, r2)
                return
        }
    }

    @androidx.annotation.RequiresApi(21)
    public static class Api21Impl {
        private Api21Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.app.Notification.MediaStyle createMediaStyle() {
                android.app.Notification$MediaStyle r0 = new android.app.Notification$MediaStyle
                r0.<init>()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static android.app.Notification.MediaStyle fillInMediaStyle(android.app.Notification.MediaStyle r0, int[] r1, android.support.v4.media.session.MediaSessionCompat.Token r2) {
                if (r1 == 0) goto L5
                setShowActionsInCompactView(r0, r1)
            L5:
                if (r2 == 0) goto L10
                java.lang.Object r1 = r2.getToken()
                android.media.session.MediaSession$Token r1 = (android.media.session.MediaSession.Token) r1
                setMediaSession(r0, r1)
            L10:
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setMediaSession(android.app.Notification.MediaStyle r0, android.media.session.MediaSession.Token r1) {
                r0.setMediaSession(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setMediaStyle(android.app.Notification.Builder r0, android.app.Notification.MediaStyle r1) {
                r0.setStyle(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setShowActionsInCompactView(android.app.Notification.MediaStyle r0, int... r1) {
                r0.setShowActionsInCompactView(r1)
                return
        }
    }

    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static android.app.Notification.DecoratedMediaCustomViewStyle createDecoratedMediaCustomViewStyle() {
                android.app.Notification$DecoratedMediaCustomViewStyle r0 = new android.app.Notification$DecoratedMediaCustomViewStyle
                r0.<init>()
                return r0
        }
    }

    public static class DecoratedMediaCustomViewStyle extends androidx.media.app.NotificationCompat.MediaStyle {
        public DecoratedMediaCustomViewStyle() {
                r0 = this;
                r0.<init>()
                return
        }

        private void setBackgroundColor(android.widget.RemoteViews r4) {
                r3 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                int r0 = r0.getColor()
                if (r0 == 0) goto Lf
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                int r0 = r0.getColor()
                goto L1d
            Lf:
                androidx.core.app.NotificationCompat$Builder r0 = r3.mBuilder
                android.content.Context r0 = r0.mContext
                android.content.res.Resources r0 = r0.getResources()
                int r1 = androidx.media.R.color.notification_material_background_media_default_color
                int r0 = r0.getColor(r1)
            L1d:
                int r1 = androidx.media.R.id.status_bar_latest_event_content
                java.lang.String r2 = "setBackgroundColor"
                r4.setInt(r1, r2, r0)
                return
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r4) {
                r3 = this;
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 24
                if (r0 < r1) goto L1a
                android.app.Notification$Builder r4 = r4.getBuilder()
                android.app.Notification$DecoratedMediaCustomViewStyle r0 = androidx.media.app.NotificationCompat.Api24Impl.createDecoratedMediaCustomViewStyle()
                int[] r1 = r3.mActionsToShowInCompact
                android.support.v4.media.session.MediaSessionCompat$Token r2 = r3.mToken
                android.app.Notification$MediaStyle r0 = androidx.media.app.NotificationCompat.Api21Impl.fillInMediaStyle(r0, r1, r2)
                androidx.media.app.NotificationCompat.Api21Impl.setMediaStyle(r4, r0)
                goto L1d
            L1a:
                super.apply(r4)
            L1d:
                return
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle
        public final int getBigContentViewLayoutResource(int r2) {
                r1 = this;
                r0 = 3
                if (r2 > r0) goto L6
                int r2 = androidx.media.R.layout.notification_template_big_media_narrow_custom
                goto L8
            L6:
                int r2 = androidx.media.R.layout.notification_template_big_media_custom
            L8:
                return r2
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle
        public final int getContentViewLayoutResource() {
                r1 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r1.mBuilder
                android.widget.RemoteViews r0 = r0.getContentView()
                if (r0 == 0) goto Lb
                int r0 = androidx.media.R.layout.notification_template_media_custom
                goto Ld
            Lb:
                int r0 = androidx.media.R.layout.notification_template_media
            Ld:
                return r0
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r3) {
                r2 = this;
                int r3 = android.os.Build.VERSION.SDK_INT
                r0 = 0
                r1 = 24
                if (r3 < r1) goto L8
                return r0
            L8:
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getBigContentView()
                if (r3 == 0) goto L17
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getBigContentView()
                goto L1d
            L17:
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getContentView()
            L1d:
                if (r3 != 0) goto L20
                return r0
            L20:
                android.widget.RemoteViews r0 = r2.generateBigContentView()
                r2.buildIntoRemoteViews(r0, r3)
                r2.setBackgroundColor(r0)
                return r0
        }

        @Override // androidx.media.app.NotificationCompat.MediaStyle, androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r5) {
                r4 = this;
                int r5 = android.os.Build.VERSION.SDK_INT
                r0 = 0
                r1 = 24
                if (r5 < r1) goto L8
                return r0
            L8:
                androidx.core.app.NotificationCompat$Builder r5 = r4.mBuilder
                android.widget.RemoteViews r5 = r5.getContentView()
                r1 = 1
                r2 = 0
                if (r5 == 0) goto L14
                r5 = 1
                goto L15
            L14:
                r5 = 0
            L15:
                if (r5 != 0) goto L21
                androidx.core.app.NotificationCompat$Builder r3 = r4.mBuilder
                android.widget.RemoteViews r3 = r3.getBigContentView()
                if (r3 == 0) goto L20
                goto L21
            L20:
                r1 = 0
            L21:
                if (r1 == 0) goto L35
                android.widget.RemoteViews r0 = r4.generateContentView()
                if (r5 == 0) goto L32
                androidx.core.app.NotificationCompat$Builder r5 = r4.mBuilder
                android.widget.RemoteViews r5 = r5.getContentView()
                r4.buildIntoRemoteViews(r0, r5)
            L32:
                r4.setBackgroundColor(r0)
            L35:
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public android.widget.RemoteViews makeHeadsUpContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r3) {
                r2 = this;
                int r3 = android.os.Build.VERSION.SDK_INT
                r0 = 0
                r1 = 24
                if (r3 < r1) goto L8
                return r0
            L8:
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getHeadsUpContentView()
                if (r3 == 0) goto L17
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getHeadsUpContentView()
                goto L1d
            L17:
                androidx.core.app.NotificationCompat$Builder r3 = r2.mBuilder
                android.widget.RemoteViews r3 = r3.getContentView()
            L1d:
                if (r3 != 0) goto L20
                return r0
            L20:
                android.widget.RemoteViews r0 = r2.generateBigContentView()
                r2.buildIntoRemoteViews(r0, r3)
                r2.setBackgroundColor(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class MediaStyle extends androidx.core.app.NotificationCompat.Style {
        private static final int MAX_MEDIA_BUTTONS = 5;
        private static final int MAX_MEDIA_BUTTONS_IN_COMPACT = 3;
        public int[] mActionsToShowInCompact;
        public android.support.v4.media.session.MediaSessionCompat.Token mToken;

        public MediaStyle() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mActionsToShowInCompact = r0
                return
        }

        public MediaStyle(androidx.core.app.NotificationCompat.Builder r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mActionsToShowInCompact = r0
                r1.setBuilder(r2)
                return
        }

        private android.widget.RemoteViews generateMediaActionButton(androidx.core.app.NotificationCompat.Action r5) {
                r4 = this;
                android.app.PendingIntent r0 = r5.getActionIntent()
                if (r0 != 0) goto L8
                r0 = 1
                goto L9
            L8:
                r0 = 0
            L9:
                android.widget.RemoteViews r1 = new android.widget.RemoteViews
                androidx.core.app.NotificationCompat$Builder r2 = r4.mBuilder
                android.content.Context r2 = r2.mContext
                java.lang.String r2 = r2.getPackageName()
                int r3 = androidx.media.R.layout.notification_media_action
                r1.<init>(r2, r3)
                int r2 = androidx.media.R.id.action0
                int r3 = r5.getIcon()
                r1.setImageViewResource(r2, r3)
                if (r0 != 0) goto L2a
                android.app.PendingIntent r0 = r5.getActionIntent()
                r1.setOnClickPendingIntent(r2, r0)
            L2a:
                java.lang.CharSequence r5 = r5.getTitle()
                androidx.media.app.NotificationCompat.Api15Impl.setContentDescription(r1, r2, r5)
                return r1
        }

        public static android.support.v4.media.session.MediaSessionCompat.Token getMediaSession(android.app.Notification r1) {
                android.os.Bundle r1 = androidx.core.app.NotificationCompat.getExtras(r1)
                if (r1 == 0) goto L13
                java.lang.String r0 = "android.mediaSession"
                android.os.Parcelable r1 = r1.getParcelable(r0)
                if (r1 == 0) goto L13
                android.support.v4.media.session.MediaSessionCompat$Token r1 = android.support.v4.media.session.MediaSessionCompat.Token.fromToken(r1)
                return r1
            L13:
                r1 = 0
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public void apply(androidx.core.app.NotificationBuilderWithBuilderAccessor r4) {
                r3 = this;
                android.app.Notification$Builder r4 = r4.getBuilder()
                android.app.Notification$MediaStyle r0 = androidx.media.app.NotificationCompat.Api21Impl.createMediaStyle()
                int[] r1 = r3.mActionsToShowInCompact
                android.support.v4.media.session.MediaSessionCompat$Token r2 = r3.mToken
                android.app.Notification$MediaStyle r0 = androidx.media.app.NotificationCompat.Api21Impl.fillInMediaStyle(r0, r1, r2)
                androidx.media.app.NotificationCompat.Api21Impl.setMediaStyle(r4, r0)
                return
        }

        public final android.widget.RemoteViews generateBigContentView() {
                r5 = this;
                androidx.core.app.NotificationCompat$Builder r0 = r5.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r0 = r0.mActions
                int r0 = r0.size()
                r1 = 5
                int r0 = java.lang.Math.min(r0, r1)
                int r1 = r5.getBigContentViewLayoutResource(r0)
                r2 = 0
                android.widget.RemoteViews r1 = r5.applyStandardTemplate(r2, r1, r2)
                int r3 = androidx.media.R.id.media_actions
                r1.removeAllViews(r3)
                if (r0 <= 0) goto L35
            L1d:
                if (r2 >= r0) goto L35
                androidx.core.app.NotificationCompat$Builder r3 = r5.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r3 = r3.mActions
                java.lang.Object r3 = r3.get(r2)
                androidx.core.app.NotificationCompat$Action r3 = (androidx.core.app.NotificationCompat.Action) r3
                android.widget.RemoteViews r3 = r5.generateMediaActionButton(r3)
                int r4 = androidx.media.R.id.media_actions
                r1.addView(r4, r3)
                int r2 = r2 + 1
                goto L1d
            L35:
                int r0 = androidx.media.R.id.cancel_action
                r2 = 8
                r1.setViewVisibility(r0, r2)
                return r1
        }

        public final android.widget.RemoteViews generateContentView() {
                r8 = this;
                int r0 = r8.getContentViewLayoutResource()
                r1 = 0
                r2 = 1
                android.widget.RemoteViews r0 = r8.applyStandardTemplate(r1, r0, r2)
                androidx.core.app.NotificationCompat$Builder r3 = r8.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r3 = r3.mActions
                int r3 = r3.size()
                int[] r4 = r8.mActionsToShowInCompact
                if (r4 != 0) goto L18
                r4 = 0
                goto L1e
            L18:
                int r4 = r4.length
                r5 = 3
                int r4 = java.lang.Math.min(r4, r5)
            L1e:
                int r5 = androidx.media.R.id.media_actions
                r0.removeAllViews(r5)
                if (r4 <= 0) goto L61
                r5 = 0
            L26:
                if (r5 >= r4) goto L61
                if (r5 >= r3) goto L44
                androidx.core.app.NotificationCompat$Builder r6 = r8.mBuilder
                java.util.ArrayList<androidx.core.app.NotificationCompat$Action> r6 = r6.mActions
                int[] r7 = r8.mActionsToShowInCompact
                r7 = r7[r5]
                java.lang.Object r6 = r6.get(r7)
                androidx.core.app.NotificationCompat$Action r6 = (androidx.core.app.NotificationCompat.Action) r6
                android.widget.RemoteViews r6 = r8.generateMediaActionButton(r6)
                int r7 = androidx.media.R.id.media_actions
                r0.addView(r7, r6)
                int r5 = r5 + 1
                goto L26
            L44:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r4 = 2
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4[r1] = r5
                int r3 = r3 - r2
                java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
                r4[r2] = r1
                java.lang.String r1 = "setShowActionsInCompactView: action %d out of bounds (max %d)"
                java.lang.String r1 = java.lang.String.format(r1, r4)
                r0.<init>(r1)
                throw r0
            L61:
                int r2 = androidx.media.R.id.end_padder
                r0.setViewVisibility(r2, r1)
                int r1 = androidx.media.R.id.cancel_action
                r2 = 8
                r0.setViewVisibility(r1, r2)
                return r0
        }

        public int getBigContentViewLayoutResource(int r2) {
                r1 = this;
                r0 = 3
                if (r2 > r0) goto L6
                int r2 = androidx.media.R.layout.notification_template_big_media_narrow
                goto L8
            L6:
                int r2 = androidx.media.R.layout.notification_template_big_media
            L8:
                return r2
        }

        public int getContentViewLayoutResource() {
                r1 = this;
                int r0 = androidx.media.R.layout.notification_template_media
                return r0
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public android.widget.RemoteViews makeBigContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // androidx.core.app.NotificationCompat.Style
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public android.widget.RemoteViews makeContentView(androidx.core.app.NotificationBuilderWithBuilderAccessor r1) {
                r0 = this;
                r1 = 0
                return r1
        }

        public androidx.media.app.NotificationCompat.MediaStyle setCancelButtonIntent(android.app.PendingIntent r1) {
                r0 = this;
                return r0
        }

        public androidx.media.app.NotificationCompat.MediaStyle setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token r1) {
                r0 = this;
                r0.mToken = r1
                return r0
        }

        public androidx.media.app.NotificationCompat.MediaStyle setShowActionsInCompactView(int... r1) {
                r0 = this;
                r0.mActionsToShowInCompact = r1
                return r0
        }

        public androidx.media.app.NotificationCompat.MediaStyle setShowCancelButton(boolean r1) {
                r0 = this;
                return r0
        }
    }

    private NotificationCompat() {
            r0 = this;
            r0.<init>()
            return
    }
}
