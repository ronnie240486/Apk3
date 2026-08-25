package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
public class PlayerNotificationManager {
    private static final java.lang.String ACTION_DISMISS = "com.google.android.exoplayer.dismiss";
    public static final java.lang.String ACTION_FAST_FORWARD = "com.google.android.exoplayer.ffwd";
    public static final java.lang.String ACTION_NEXT = "com.google.android.exoplayer.next";
    public static final java.lang.String ACTION_PAUSE = "com.google.android.exoplayer.pause";
    public static final java.lang.String ACTION_PLAY = "com.google.android.exoplayer.play";
    public static final java.lang.String ACTION_PREVIOUS = "com.google.android.exoplayer.prev";
    public static final java.lang.String ACTION_REWIND = "com.google.android.exoplayer.rewind";
    public static final java.lang.String ACTION_STOP = "com.google.android.exoplayer.stop";
    public static final java.lang.String EXTRA_INSTANCE_ID = "INSTANCE_ID";
    private static final int MSG_START_OR_UPDATE_NOTIFICATION = 0;
    private static final int MSG_UPDATE_NOTIFICATION_BITMAP = 1;
    private static int instanceIdCounter;
    private int badgeIconType;

    @androidx.annotation.Nullable
    private androidx.core.app.NotificationCompat.Builder builder;

    @androidx.annotation.Nullable
    private java.util.List<androidx.core.app.NotificationCompat.Action> builderActions;
    private final java.lang.String channelId;
    private int color;
    private boolean colorized;
    private final android.content.Context context;
    private int currentNotificationTag;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver;
    private final java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> customActions;
    private int defaults;
    private final android.app.PendingIntent dismissPendingIntent;

    @androidx.annotation.Nullable
    private java.lang.String groupKey;
    private final int instanceId;
    private final android.content.IntentFilter intentFilter;
    private boolean isNotificationStarted;
    private final android.os.Handler mainHandler;
    private final com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter;

    @androidx.annotation.Nullable
    private android.support.v4.media.session.MediaSessionCompat.Token mediaSessionToken;
    private final com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationBroadcastReceiver notificationBroadcastReceiver;
    private final int notificationId;

    @androidx.annotation.Nullable
    private final com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener notificationListener;
    private final androidx.core.app.NotificationManagerCompat notificationManager;
    private final java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> playbackActions;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.Player player;
    private final com.google.android.exoplayer2.Player.Listener playerListener;
    private int priority;

    @androidx.annotation.DrawableRes
    private int smallIconResourceId;
    private boolean useChronometer;
    private boolean useFastForwardAction;
    private boolean useFastForwardActionInCompactView;
    private boolean useNextAction;
    private boolean useNextActionInCompactView;
    private boolean usePlayPauseActions;
    private boolean usePreviousAction;
    private boolean usePreviousActionInCompactView;
    private boolean useRewindAction;
    private boolean useRewindActionInCompactView;
    private boolean useStopAction;
    private int visibility;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public final class BitmapCallback {
        private final int notificationTag;
        public final /* synthetic */ com.google.android.exoplayer2.ui.PlayerNotificationManager this$0;

        private BitmapCallback(com.google.android.exoplayer2.ui.PlayerNotificationManager r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.notificationTag = r2
                return
        }

        public /* synthetic */ BitmapCallback(com.google.android.exoplayer2.ui.PlayerNotificationManager r1, int r2, com.google.android.exoplayer2.ui.PlayerNotificationManager.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public void onBitmap(android.graphics.Bitmap r3) {
                r2 = this;
                if (r3 == 0) goto L9
                com.google.android.exoplayer2.ui.PlayerNotificationManager r0 = r2.this$0
                int r1 = r2.notificationTag
                com.google.android.exoplayer2.ui.PlayerNotificationManager.access$000(r0, r3, r1)
            L9:
                return
        }
    }

    public static class Builder {
        public int channelDescriptionResourceId;
        public final java.lang.String channelId;
        public int channelImportance;
        public int channelNameResourceId;
        public final android.content.Context context;

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.ui.PlayerNotificationManager.CustomActionReceiver customActionReceiver;
        public int fastForwardActionIconResourceId;

        @androidx.annotation.Nullable
        public java.lang.String groupKey;
        public com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter mediaDescriptionAdapter;
        public int nextActionIconResourceId;
        public final int notificationId;

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener notificationListener;
        public int pauseActionIconResourceId;
        public int playActionIconResourceId;
        public int previousActionIconResourceId;
        public int rewindActionIconResourceId;
        public int smallIconResourceId;
        public int stopActionIconResourceId;

        public Builder(android.content.Context r2, @androidx.annotation.IntRange(from = 1) int r3, java.lang.String r4) {
                r1 = this;
                r1.<init>()
                if (r3 <= 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                com.google.android.exoplayer2.util.Assertions.checkArgument(r0)
                r1.context = r2
                r1.notificationId = r3
                r1.channelId = r4
                r2 = 2
                r1.channelImportance = r2
                com.google.android.exoplayer2.ui.DefaultMediaDescriptionAdapter r2 = new com.google.android.exoplayer2.ui.DefaultMediaDescriptionAdapter
                r3 = 0
                r2.<init>(r3)
                r1.mediaDescriptionAdapter = r2
                int r2 = com.google.android.exoplayer2.ui.R.drawable.exo_notification_small_icon
                r1.smallIconResourceId = r2
                int r2 = com.google.android.exoplayer2.ui.R.drawable.exo_notification_play
                r1.playActionIconResourceId = r2
                int r2 = com.google.android.exoplayer2.ui.R.drawable.exo_notification_pause
                r1.pauseActionIconResourceId = r2
                int r2 = com.google.android.exoplayer2.ui.R.drawable.exo_notification_stop
                r1.stopActionIconResourceId = r2
                int r2 = com.google.android.exoplayer2.ui.R.drawable.exo_notification_rewind
                r1.rewindActionIconResourceId = r2
                int r2 = com.google.android.exoplayer2.ui.R.drawable.exo_notification_fastforward
                r1.fastForwardActionIconResourceId = r2
                int r2 = com.google.android.exoplayer2.ui.R.drawable.exo_notification_previous
                r1.previousActionIconResourceId = r2
                int r2 = com.google.android.exoplayer2.ui.R.drawable.exo_notification_next
                r1.nextActionIconResourceId = r2
                return
        }

        @java.lang.Deprecated
        public Builder(android.content.Context r1, int r2, java.lang.String r3, com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                r0.mediaDescriptionAdapter = r4
                return
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager build() {
                r22 = this;
                r0 = r22
                int r1 = r0.channelNameResourceId
                if (r1 == 0) goto L11
                android.content.Context r2 = r0.context
                java.lang.String r3 = r0.channelId
                int r4 = r0.channelDescriptionResourceId
                int r5 = r0.channelImportance
                com.google.android.exoplayer2.util.NotificationUtil.createNotificationChannel(r2, r3, r1, r4, r5)
            L11:
                com.google.android.exoplayer2.ui.PlayerNotificationManager r1 = new com.google.android.exoplayer2.ui.PlayerNotificationManager
                android.content.Context r7 = r0.context
                java.lang.String r8 = r0.channelId
                int r9 = r0.notificationId
                com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter r10 = r0.mediaDescriptionAdapter
                com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationListener r11 = r0.notificationListener
                com.google.android.exoplayer2.ui.PlayerNotificationManager$CustomActionReceiver r12 = r0.customActionReceiver
                int r13 = r0.smallIconResourceId
                int r14 = r0.playActionIconResourceId
                int r15 = r0.pauseActionIconResourceId
                int r2 = r0.stopActionIconResourceId
                int r3 = r0.rewindActionIconResourceId
                int r4 = r0.fastForwardActionIconResourceId
                int r5 = r0.previousActionIconResourceId
                int r6 = r0.nextActionIconResourceId
                r19 = r5
                java.lang.String r5 = r0.groupKey
                r20 = r6
                r6 = r1
                r16 = r2
                r17 = r3
                r18 = r4
                r21 = r5
                r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
                return r1
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setChannelDescriptionResourceId(int r1) {
                r0 = this;
                r0.channelDescriptionResourceId = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setChannelImportance(int r1) {
                r0 = this;
                r0.channelImportance = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setChannelNameResourceId(int r1) {
                r0 = this;
                r0.channelNameResourceId = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setCustomActionReceiver(com.google.android.exoplayer2.ui.PlayerNotificationManager.CustomActionReceiver r1) {
                r0 = this;
                r0.customActionReceiver = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setFastForwardActionIconResourceId(int r1) {
                r0 = this;
                r0.fastForwardActionIconResourceId = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setGroup(java.lang.String r1) {
                r0 = this;
                r0.groupKey = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setMediaDescriptionAdapter(com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter r1) {
                r0 = this;
                r0.mediaDescriptionAdapter = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setNextActionIconResourceId(int r1) {
                r0 = this;
                r0.nextActionIconResourceId = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setNotificationListener(com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener r1) {
                r0 = this;
                r0.notificationListener = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setPauseActionIconResourceId(int r1) {
                r0 = this;
                r0.pauseActionIconResourceId = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setPlayActionIconResourceId(int r1) {
                r0 = this;
                r0.playActionIconResourceId = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setPreviousActionIconResourceId(int r1) {
                r0 = this;
                r0.previousActionIconResourceId = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setRewindActionIconResourceId(int r1) {
                r0 = this;
                r0.rewindActionIconResourceId = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setSmallIconResourceId(int r1) {
                r0 = this;
                r0.smallIconResourceId = r1
                return r0
        }

        public com.google.android.exoplayer2.ui.PlayerNotificationManager.Builder setStopActionIconResourceId(int r1) {
                r0 = this;
                r0.stopActionIconResourceId = r1
                return r0
        }
    }

    public interface CustomActionReceiver {
        java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> createCustomActions(android.content.Context r1, int r2);

        java.util.List<java.lang.String> getCustomActions(com.google.android.exoplayer2.Player r1);

        void onCustomAction(com.google.android.exoplayer2.Player r1, java.lang.String r2, android.content.Intent r3);
    }

    public interface MediaDescriptionAdapter {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes.dex */
        public final /* synthetic */ class CC {
            @androidx.annotation.Nullable
            public static java.lang.CharSequence $default$getCurrentSubText(com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter r0, com.google.android.exoplayer2.Player r1) {
                    r0 = 0
                    return r0
            }
        }

        @androidx.annotation.Nullable
        android.app.PendingIntent createCurrentContentIntent(com.google.android.exoplayer2.Player r1);

        @androidx.annotation.Nullable
        java.lang.CharSequence getCurrentContentText(com.google.android.exoplayer2.Player r1);

        java.lang.CharSequence getCurrentContentTitle(com.google.android.exoplayer2.Player r1);

        @androidx.annotation.Nullable
        android.graphics.Bitmap getCurrentLargeIcon(com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.ui.PlayerNotificationManager.BitmapCallback r2);

        @androidx.annotation.Nullable
        java.lang.CharSequence getCurrentSubText(com.google.android.exoplayer2.Player r1);
    }

    public class NotificationBroadcastReceiver extends android.content.BroadcastReceiver {
        public final /* synthetic */ com.google.android.exoplayer2.ui.PlayerNotificationManager this$0;

        private NotificationBroadcastReceiver(com.google.android.exoplayer2.ui.PlayerNotificationManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ NotificationBroadcastReceiver(com.google.android.exoplayer2.ui.PlayerNotificationManager r1, com.google.android.exoplayer2.ui.PlayerNotificationManager.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(android.content.Context r4, android.content.Intent r5) {
                r3 = this;
                com.google.android.exoplayer2.ui.PlayerNotificationManager r4 = r3.this$0
                com.google.android.exoplayer2.Player r4 = com.google.android.exoplayer2.ui.PlayerNotificationManager.access$500(r4)
                if (r4 == 0) goto L10e
                com.google.android.exoplayer2.ui.PlayerNotificationManager r0 = r3.this$0
                boolean r0 = com.google.android.exoplayer2.ui.PlayerNotificationManager.access$600(r0)
                if (r0 == 0) goto L10e
                com.google.android.exoplayer2.ui.PlayerNotificationManager r0 = r3.this$0
                int r0 = com.google.android.exoplayer2.ui.PlayerNotificationManager.access$700(r0)
                java.lang.String r1 = "INSTANCE_ID"
                int r0 = r5.getIntExtra(r1, r0)
                com.google.android.exoplayer2.ui.PlayerNotificationManager r1 = r3.this$0
                int r1 = com.google.android.exoplayer2.ui.PlayerNotificationManager.access$700(r1)
                if (r0 == r1) goto L26
                goto L10e
            L26:
                java.lang.String r0 = r5.getAction()
                java.lang.String r1 = "com.google.android.exoplayer.play"
                boolean r1 = r1.equals(r0)
                r2 = 1
                if (r1 == 0) goto L5f
                int r5 = r4.getPlaybackState()
                if (r5 != r2) goto L44
                r5 = 2
                boolean r5 = r4.isCommandAvailable(r5)
                if (r5 == 0) goto L44
                r4.prepare()
                goto L54
            L44:
                int r5 = r4.getPlaybackState()
                r0 = 4
                if (r5 != r0) goto L54
                boolean r5 = r4.isCommandAvailable(r0)
                if (r5 == 0) goto L54
                r4.seekToDefaultPosition()
            L54:
                boolean r5 = r4.isCommandAvailable(r2)
                if (r5 == 0) goto L10e
                r4.play()
                goto L10e
            L5f:
                java.lang.String r1 = "com.google.android.exoplayer.pause"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L72
                boolean r5 = r4.isCommandAvailable(r2)
                if (r5 == 0) goto L10e
                r4.pause()
                goto L10e
            L72:
                java.lang.String r1 = "com.google.android.exoplayer.prev"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L86
                r5 = 7
                boolean r5 = r4.isCommandAvailable(r5)
                if (r5 == 0) goto L10e
                r4.seekToPrevious()
                goto L10e
            L86:
                java.lang.String r1 = "com.google.android.exoplayer.rewind"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L9b
                r5 = 11
                boolean r5 = r4.isCommandAvailable(r5)
                if (r5 == 0) goto L10e
                r4.seekBack()
                goto L10e
            L9b:
                java.lang.String r1 = "com.google.android.exoplayer.ffwd"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto Laf
                r5 = 12
                boolean r5 = r4.isCommandAvailable(r5)
                if (r5 == 0) goto L10e
                r4.seekForward()
                goto L10e
            Laf:
                java.lang.String r1 = "com.google.android.exoplayer.next"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto Lc3
                r5 = 9
                boolean r5 = r4.isCommandAvailable(r5)
                if (r5 == 0) goto L10e
                r4.seekToNext()
                goto L10e
            Lc3:
                java.lang.String r1 = "com.google.android.exoplayer.stop"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto Le1
                r5 = 3
                boolean r5 = r4.isCommandAvailable(r5)
                if (r5 == 0) goto Ld5
                r4.stop()
            Ld5:
                r5 = 20
                boolean r5 = r4.isCommandAvailable(r5)
                if (r5 == 0) goto L10e
                r4.clearMediaItems()
                goto L10e
            Le1:
                java.lang.String r1 = "com.google.android.exoplayer.dismiss"
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto Lef
                com.google.android.exoplayer2.ui.PlayerNotificationManager r4 = r3.this$0
                com.google.android.exoplayer2.ui.PlayerNotificationManager.access$800(r4)
                goto L10e
            Lef:
                if (r0 == 0) goto L10e
                com.google.android.exoplayer2.ui.PlayerNotificationManager r1 = r3.this$0
                com.google.android.exoplayer2.ui.PlayerNotificationManager$CustomActionReceiver r1 = com.google.android.exoplayer2.ui.PlayerNotificationManager.access$900(r1)
                if (r1 == 0) goto L10e
                com.google.android.exoplayer2.ui.PlayerNotificationManager r1 = r3.this$0
                java.util.Map r1 = com.google.android.exoplayer2.ui.PlayerNotificationManager.access$1000(r1)
                boolean r1 = r1.containsKey(r0)
                if (r1 == 0) goto L10e
                com.google.android.exoplayer2.ui.PlayerNotificationManager r1 = r3.this$0
                com.google.android.exoplayer2.ui.PlayerNotificationManager$CustomActionReceiver r1 = com.google.android.exoplayer2.ui.PlayerNotificationManager.access$900(r1)
                r1.onCustomAction(r4, r0, r5)
            L10e:
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface NotificationListener {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationListener$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes2.dex */
        public final /* synthetic */ class CC {
            public static void $default$onNotificationCancelled(com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener r0, int r1, boolean r2) {
                    return
            }

            public static void $default$onNotificationPosted(com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener r0, int r1, android.app.Notification r2, boolean r3) {
                    return
            }
        }

        void onNotificationCancelled(int r1, boolean r2);

        void onNotificationPosted(int r1, android.app.Notification r2, boolean r3);
    }

    public class PlayerListener implements com.google.android.exoplayer2.Player.Listener {
        public final /* synthetic */ com.google.android.exoplayer2.ui.PlayerNotificationManager this$0;

        private PlayerListener(com.google.android.exoplayer2.ui.PlayerNotificationManager r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ PlayerListener(com.google.android.exoplayer2.ui.PlayerNotificationManager r1, com.google.android.exoplayer2.ui.PlayerNotificationManager.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioAttributesChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onAudioSessionIdChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onAudioSessionIdChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onAvailableCommandsChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onCues(com.google.android.exoplayer2.text.CueGroup r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onCues(java.util.List r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onCues(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceInfoChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onDeviceVolumeChanged(int r1, boolean r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onDeviceVolumeChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.Player.Events r2) {
                r0 = this;
                r1 = 9
                int[] r1 = new int[r1]
                r1 = {x0014: FILL_ARRAY_DATA , data: [4, 5, 7, 0, 12, 11, 8, 9, 14} // fill-array
                boolean r1 = r2.containsAny(r1)
                if (r1 == 0) goto L12
                com.google.android.exoplayer2.ui.PlayerNotificationManager r1 = r0.this$0
                com.google.android.exoplayer2.ui.PlayerNotificationManager.access$400(r1)
            L12:
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onIsLoadingChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onIsLoadingChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onIsPlayingChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onIsPlayingChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onLoadingChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onLoadingChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMaxSeekToPreviousPositionChanged(long r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMaxSeekToPreviousPositionChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMediaItemTransition(com.google.android.exoplayer2.MediaItem r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaItemTransition(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMediaMetadataChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onMetadata(com.google.android.exoplayer2.metadata.Metadata r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onMetadata(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayWhenReadyChanged(boolean r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayWhenReadyChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackParametersChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackStateChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackStateChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaybackSuppressionReasonChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaybackSuppressionReasonChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayerError(com.google.android.exoplayer2.PlaybackException r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerError(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayerErrorChanged(com.google.android.exoplayer2.PlaybackException r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerErrorChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlayerStateChanged(boolean r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlayerStateChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPlaylistMetadataChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPositionDiscontinuity(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, int r3) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onPositionDiscontinuity(r0, r1, r2, r3)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onRenderedFirstFrame() {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onRenderedFirstFrame(r0)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onRepeatModeChanged(int r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onRepeatModeChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSeekBackIncrementChanged(long r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekBackIncrementChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSeekForwardIncrementChanged(long r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekForwardIncrementChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSeekProcessed() {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSeekProcessed(r0)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onShuffleModeEnabledChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onShuffleModeEnabledChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSkipSilenceEnabledChanged(boolean r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSkipSilenceEnabledChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onSurfaceSizeChanged(int r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onSurfaceSizeChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.Timeline r1, int r2) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onTimelineChanged(r0, r1, r2)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onTrackSelectionParametersChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.Tracks r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onTracksChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onVideoSizeChanged(r0, r1)
                return
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public final /* synthetic */ void onVolumeChanged(float r1) {
                r0 = this;
                com.google.android.exoplayer2.Player.Listener.CC.$default$onVolumeChanged(r0, r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Priority {
    }

    /* JADX INFO: loaded from: classes.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Visibility {
    }

    public static /* synthetic */ boolean $r8$lambda$hDN6RMWHvTCSAt_reWH1_HHmp5E(com.google.android.exoplayer2.ui.PlayerNotificationManager r0, android.os.Message r1) {
            boolean r0 = r0.handleMessage(r1)
            return r0
    }

    public PlayerNotificationManager(android.content.Context r13, java.lang.String r14, int r15, com.google.android.exoplayer2.ui.PlayerNotificationManager.MediaDescriptionAdapter r16, @androidx.annotation.Nullable com.google.android.exoplayer2.ui.PlayerNotificationManager.NotificationListener r17, @androidx.annotation.Nullable com.google.android.exoplayer2.ui.PlayerNotificationManager.CustomActionReceiver r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, int r26, @androidx.annotation.Nullable java.lang.String r27) {
            r12 = this;
            r0 = r12
            r1 = r18
            r12.<init>()
            android.content.Context r11 = r13.getApplicationContext()
            r0.context = r11
            r2 = r14
            r0.channelId = r2
            r2 = r15
            r0.notificationId = r2
            r2 = r16
            r0.mediaDescriptionAdapter = r2
            r2 = r17
            r0.notificationListener = r2
            r0.customActionReceiver = r1
            r2 = r19
            r0.smallIconResourceId = r2
            r2 = r27
            r0.groupKey = r2
            int r3 = com.google.android.exoplayer2.ui.PlayerNotificationManager.instanceIdCounter
            int r2 = r3 + 1
            com.google.android.exoplayer2.ui.PlayerNotificationManager.instanceIdCounter = r2
            r0.instanceId = r3
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            com.google.android.exoplayer2.ui.PlayerNotificationManager$$ExternalSyntheticLambda0 r4 = new com.google.android.exoplayer2.ui.PlayerNotificationManager$$ExternalSyntheticLambda0
            r4.<init>(r12)
            android.os.Handler r2 = com.google.android.exoplayer2.util.Util.createHandler(r2, r4)
            r0.mainHandler = r2
            androidx.core.app.NotificationManagerCompat r2 = androidx.core.app.NotificationManagerCompat.from(r11)
            r0.notificationManager = r2
            com.google.android.exoplayer2.ui.PlayerNotificationManager$PlayerListener r2 = new com.google.android.exoplayer2.ui.PlayerNotificationManager$PlayerListener
            r4 = 0
            r2.<init>(r12, r4)
            r0.playerListener = r2
            com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationBroadcastReceiver r2 = new com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationBroadcastReceiver
            r2.<init>(r12, r4)
            r0.notificationBroadcastReceiver = r2
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            r0.intentFilter = r2
            r2 = 1
            r0.usePreviousAction = r2
            r0.useNextAction = r2
            r0.usePlayPauseActions = r2
            r0.useRewindAction = r2
            r0.useFastForwardAction = r2
            r0.colorized = r2
            r0.useChronometer = r2
            r4 = 0
            r0.color = r4
            r0.defaults = r4
            r4 = -1
            r0.priority = r4
            r0.badgeIconType = r2
            r0.visibility = r2
            r2 = r11
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = r26
            java.util.Map r2 = createPlaybackActions(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r0.playbackActions = r2
            java.util.Set r2 = r2.keySet()
            java.util.Iterator r2 = r2.iterator()
        L8f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto La1
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.content.IntentFilter r4 = r0.intentFilter
            r4.addAction(r3)
            goto L8f
        La1:
            if (r1 == 0) goto Laa
            int r2 = r0.instanceId
            java.util.Map r1 = r1.createCustomActions(r11, r2)
            goto Lae
        Laa:
            java.util.Map r1 = java.util.Collections.emptyMap()
        Lae:
            r0.customActions = r1
            java.util.Set r1 = r1.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lb8:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lca
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            android.content.IntentFilter r3 = r0.intentFilter
            r3.addAction(r2)
            goto Lb8
        Lca:
            int r1 = r0.instanceId
            java.lang.String r2 = "com.google.android.exoplayer.dismiss"
            android.app.PendingIntent r1 = createBroadcastIntent(r2, r11, r1)
            r0.dismissPendingIntent = r1
            android.content.IntentFilter r1 = r0.intentFilter
            r1.addAction(r2)
            return
    }

    public static /* synthetic */ void access$000(com.google.android.exoplayer2.ui.PlayerNotificationManager r0, android.graphics.Bitmap r1, int r2) {
            r0.postUpdateNotificationBitmap(r1, r2)
            return
    }

    public static /* synthetic */ java.util.Map access$1000(com.google.android.exoplayer2.ui.PlayerNotificationManager r0) {
            java.util.Map<java.lang.String, androidx.core.app.NotificationCompat$Action> r0 = r0.customActions
            return r0
    }

    public static /* synthetic */ void access$400(com.google.android.exoplayer2.ui.PlayerNotificationManager r0) {
            r0.postStartOrUpdateNotification()
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.Player access$500(com.google.android.exoplayer2.ui.PlayerNotificationManager r0) {
            com.google.android.exoplayer2.Player r0 = r0.player
            return r0
    }

    public static /* synthetic */ boolean access$600(com.google.android.exoplayer2.ui.PlayerNotificationManager r0) {
            boolean r0 = r0.isNotificationStarted
            return r0
    }

    public static /* synthetic */ int access$700(com.google.android.exoplayer2.ui.PlayerNotificationManager r0) {
            int r0 = r0.instanceId
            return r0
    }

    public static /* synthetic */ void access$800(com.google.android.exoplayer2.ui.PlayerNotificationManager r1) {
            r0 = 1
            r1.stopNotification(r0)
            return
    }

    public static /* synthetic */ com.google.android.exoplayer2.ui.PlayerNotificationManager.CustomActionReceiver access$900(com.google.android.exoplayer2.ui.PlayerNotificationManager r0) {
            com.google.android.exoplayer2.ui.PlayerNotificationManager$CustomActionReceiver r0 = r0.customActionReceiver
            return r0
    }

    private static android.app.PendingIntent createBroadcastIntent(java.lang.String r2, android.content.Context r3, int r4) {
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r2)
            java.lang.String r2 = r3.getPackageName()
            android.content.Intent r2 = r0.setPackage(r2)
            java.lang.String r0 = "INSTANCE_ID"
            r2.putExtra(r0, r4)
            int r0 = com.google.android.exoplayer2.util.Util.SDK_INT
            r1 = 23
            if (r0 < r1) goto L1b
            r0 = 201326592(0xc000000, float:9.8607613E-32)
            goto L1d
        L1b:
            r0 = 134217728(0x8000000, float:3.85186E-34)
        L1d:
            android.app.PendingIntent r2 = android.app.PendingIntent.getBroadcast(r3, r4, r2, r0)
            return r2
    }

    private static java.util.Map<java.lang.String, androidx.core.app.NotificationCompat.Action> createPlaybackActions(android.content.Context r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, int r13) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            androidx.core.app.NotificationCompat$Action r1 = new androidx.core.app.NotificationCompat$Action
            int r2 = com.google.android.exoplayer2.ui.R.string.exo_controls_play_description
            java.lang.String r2 = r5.getString(r2)
            java.lang.String r3 = "com.google.android.exoplayer.play"
            android.app.PendingIntent r4 = createBroadcastIntent(r3, r5, r6)
            r1.<init>(r7, r2, r4)
            r0.put(r3, r1)
            androidx.core.app.NotificationCompat$Action r7 = new androidx.core.app.NotificationCompat$Action
            int r1 = com.google.android.exoplayer2.ui.R.string.exo_controls_pause_description
            java.lang.String r1 = r5.getString(r1)
            java.lang.String r2 = "com.google.android.exoplayer.pause"
            android.app.PendingIntent r3 = createBroadcastIntent(r2, r5, r6)
            r7.<init>(r8, r1, r3)
            r0.put(r2, r7)
            androidx.core.app.NotificationCompat$Action r7 = new androidx.core.app.NotificationCompat$Action
            int r8 = com.google.android.exoplayer2.ui.R.string.exo_controls_stop_description
            java.lang.String r8 = r5.getString(r8)
            java.lang.String r1 = "com.google.android.exoplayer.stop"
            android.app.PendingIntent r2 = createBroadcastIntent(r1, r5, r6)
            r7.<init>(r9, r8, r2)
            r0.put(r1, r7)
            androidx.core.app.NotificationCompat$Action r7 = new androidx.core.app.NotificationCompat$Action
            int r8 = com.google.android.exoplayer2.ui.R.string.exo_controls_rewind_description
            java.lang.String r8 = r5.getString(r8)
            java.lang.String r9 = "com.google.android.exoplayer.rewind"
            android.app.PendingIntent r1 = createBroadcastIntent(r9, r5, r6)
            r7.<init>(r10, r8, r1)
            r0.put(r9, r7)
            androidx.core.app.NotificationCompat$Action r7 = new androidx.core.app.NotificationCompat$Action
            int r8 = com.google.android.exoplayer2.ui.R.string.exo_controls_fastforward_description
            java.lang.String r8 = r5.getString(r8)
            java.lang.String r9 = "com.google.android.exoplayer.ffwd"
            android.app.PendingIntent r10 = createBroadcastIntent(r9, r5, r6)
            r7.<init>(r11, r8, r10)
            r0.put(r9, r7)
            androidx.core.app.NotificationCompat$Action r7 = new androidx.core.app.NotificationCompat$Action
            int r8 = com.google.android.exoplayer2.ui.R.string.exo_controls_previous_description
            java.lang.String r8 = r5.getString(r8)
            java.lang.String r9 = "com.google.android.exoplayer.prev"
            android.app.PendingIntent r10 = createBroadcastIntent(r9, r5, r6)
            r7.<init>(r12, r8, r10)
            r0.put(r9, r7)
            androidx.core.app.NotificationCompat$Action r7 = new androidx.core.app.NotificationCompat$Action
            int r8 = com.google.android.exoplayer2.ui.R.string.exo_controls_next_description
            java.lang.String r8 = r5.getString(r8)
            java.lang.String r9 = "com.google.android.exoplayer.next"
            android.app.PendingIntent r5 = createBroadcastIntent(r9, r5, r6)
            r7.<init>(r13, r8, r5)
            r0.put(r9, r7)
            return r0
    }

    private boolean handleMessage(android.os.Message r5) {
            r4 = this;
            int r0 = r5.what
            r1 = 1
            if (r0 == 0) goto L1f
            if (r0 == r1) goto L9
            r5 = 0
            return r5
        L9:
            com.google.android.exoplayer2.Player r0 = r4.player
            if (r0 == 0) goto L27
            boolean r2 = r4.isNotificationStarted
            if (r2 == 0) goto L27
            int r2 = r4.currentNotificationTag
            int r3 = r5.arg1
            if (r2 != r3) goto L27
            java.lang.Object r5 = r5.obj
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            r4.startOrUpdateNotification(r0, r5)
            goto L27
        L1f:
            com.google.android.exoplayer2.Player r5 = r4.player
            if (r5 == 0) goto L27
            r0 = 0
            r4.startOrUpdateNotification(r5, r0)
        L27:
            return r1
    }

    private void postStartOrUpdateNotification() {
            r2 = this;
            android.os.Handler r0 = r2.mainHandler
            r1 = 0
            boolean r0 = r0.hasMessages(r1)
            if (r0 != 0) goto Le
            android.os.Handler r0 = r2.mainHandler
            r0.sendEmptyMessage(r1)
        Le:
            return
    }

    private void postUpdateNotificationBitmap(android.graphics.Bitmap r4, int r5) {
            r3 = this;
            android.os.Handler r0 = r3.mainHandler
            r1 = 1
            r2 = -1
            android.os.Message r4 = r0.obtainMessage(r1, r5, r2, r4)
            r4.sendToTarget()
            return
    }

    private static void setLargeIcon(androidx.core.app.NotificationCompat.Builder r0, @androidx.annotation.Nullable android.graphics.Bitmap r1) {
            r0.setLargeIcon(r1)
            return
    }

    private boolean shouldShowPauseButton(com.google.android.exoplayer2.Player r4) {
            r3 = this;
            int r0 = r4.getPlaybackState()
            r1 = 1
            r2 = 4
            if (r0 == r2) goto L15
            int r0 = r4.getPlaybackState()
            if (r0 == r1) goto L15
            boolean r4 = r4.getPlayWhenReady()
            if (r4 == 0) goto L15
            goto L16
        L15:
            r1 = 0
        L16:
            return r1
    }

    private void startOrUpdateNotification(com.google.android.exoplayer2.Player r17, @androidx.annotation.Nullable android.graphics.Bitmap r18) {
            r16 = this;
            r0 = r16
            r1 = r17
            int r2 = r17.getPlaybackState()
            r3 = 2
            r4 = 3
            r6 = 1
            if (r2 == r3) goto Lf
            if (r2 != r4) goto L17
        Lf:
            boolean r2 = r17.getPlayWhenReady()
            if (r2 == 0) goto L17
            r2 = 1
            goto L18
        L17:
            r2 = 0
        L18:
            androidx.core.app.NotificationCompat$Builder r3 = r0.builder
            int r7 = r17.getPlaybackState()
            r8 = 0
            if (r7 != r6) goto L37
            r7 = 17
            boolean r7 = r1.isCommandAvailable(r7)
            if (r7 == 0) goto L37
            com.google.android.exoplayer2.Timeline r7 = r17.getCurrentTimeline()
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L37
            r0.builderActions = r8
            goto L248
        L37:
            r7 = 7
            boolean r7 = r1.isCommandAvailable(r7)
            r9 = 11
            boolean r9 = r1.isCommandAvailable(r9)
            r10 = 12
            boolean r10 = r1.isCommandAvailable(r10)
            r11 = 9
            boolean r11 = r1.isCommandAvailable(r11)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            boolean r13 = r0.usePreviousAction
            java.lang.String r14 = "com.google.android.exoplayer.prev"
            if (r13 == 0) goto L5e
            if (r7 == 0) goto L5e
            r12.add(r14)
        L5e:
            boolean r7 = r0.useRewindAction
            java.lang.String r13 = "com.google.android.exoplayer.rewind"
            if (r7 == 0) goto L69
            if (r9 == 0) goto L69
            r12.add(r13)
        L69:
            boolean r7 = r0.usePlayPauseActions
            java.lang.String r9 = "com.google.android.exoplayer.pause"
            java.lang.String r15 = "com.google.android.exoplayer.play"
            if (r7 == 0) goto L7e
            boolean r7 = r16.shouldShowPauseButton(r17)
            if (r7 == 0) goto L7b
            r12.add(r9)
            goto L7e
        L7b:
            r12.add(r15)
        L7e:
            boolean r7 = r0.useFastForwardAction
            java.lang.String r8 = "com.google.android.exoplayer.ffwd"
            if (r7 == 0) goto L89
            if (r10 == 0) goto L89
            r12.add(r8)
        L89:
            boolean r7 = r0.useNextAction
            java.lang.String r10 = "com.google.android.exoplayer.next"
            if (r7 == 0) goto L94
            if (r11 == 0) goto L94
            r12.add(r10)
        L94:
            com.google.android.exoplayer2.ui.PlayerNotificationManager$CustomActionReceiver r7 = r0.customActionReceiver
            if (r7 == 0) goto L9f
            java.util.List r7 = r7.getCustomActions(r1)
            r12.addAll(r7)
        L9f:
            boolean r7 = r0.useStopAction
            if (r7 == 0) goto La8
            java.lang.String r7 = "com.google.android.exoplayer.stop"
            r12.add(r7)
        La8:
            java.util.ArrayList r7 = new java.util.ArrayList
            int r11 = r12.size()
            r7.<init>(r11)
            r11 = 0
        Lb2:
            int r6 = r12.size()
            if (r11 >= r6) goto Ldf
            java.lang.Object r6 = r12.get(r11)
            java.lang.String r6 = (java.lang.String) r6
            java.util.Map<java.lang.String, androidx.core.app.NotificationCompat$Action> r5 = r0.playbackActions
            boolean r5 = r5.containsKey(r6)
            if (r5 == 0) goto Lcf
            java.util.Map<java.lang.String, androidx.core.app.NotificationCompat$Action> r5 = r0.playbackActions
            java.lang.Object r5 = r5.get(r6)
            androidx.core.app.NotificationCompat$Action r5 = (androidx.core.app.NotificationCompat.Action) r5
            goto Ld7
        Lcf:
            java.util.Map<java.lang.String, androidx.core.app.NotificationCompat$Action> r5 = r0.customActions
            java.lang.Object r5 = r5.get(r6)
            androidx.core.app.NotificationCompat$Action r5 = (androidx.core.app.NotificationCompat.Action) r5
        Ld7:
            if (r5 == 0) goto Ldc
            r7.add(r5)
        Ldc:
            int r11 = r11 + 1
            goto Lb2
        Ldf:
            if (r3 == 0) goto Le9
            java.util.List<androidx.core.app.NotificationCompat$Action> r5 = r0.builderActions
            boolean r5 = r7.equals(r5)
            if (r5 != 0) goto L107
        Le9:
            androidx.core.app.NotificationCompat$Builder r3 = new androidx.core.app.NotificationCompat$Builder
            android.content.Context r5 = r0.context
            java.lang.String r6 = r0.channelId
            r3.<init>(r5, r6)
            r0.builderActions = r7
            r5 = 0
        Lf5:
            int r6 = r7.size()
            if (r5 >= r6) goto L107
            java.lang.Object r6 = r7.get(r5)
            androidx.core.app.NotificationCompat$Action r6 = (androidx.core.app.NotificationCompat.Action) r6
            r3.addAction(r6)
            int r5 = r5 + 1
            goto Lf5
        L107:
            androidx.media.app.NotificationCompat$MediaStyle r5 = new androidx.media.app.NotificationCompat$MediaStyle
            r5.<init>()
            android.support.v4.media.session.MediaSessionCompat$Token r6 = r0.mediaSessionToken
            if (r6 == 0) goto L113
            r5.setMediaSession(r6)
        L113:
            int r6 = r12.indexOf(r9)
            int r7 = r12.indexOf(r15)
            boolean r9 = r0.usePreviousActionInCompactView
            r11 = -1
            if (r9 == 0) goto L125
            int r9 = r12.indexOf(r14)
            goto L12f
        L125:
            boolean r9 = r0.useRewindActionInCompactView
            if (r9 == 0) goto L12e
            int r9 = r12.indexOf(r13)
            goto L12f
        L12e:
            r9 = -1
        L12f:
            boolean r13 = r0.useNextActionInCompactView
            if (r13 == 0) goto L138
            int r8 = r12.indexOf(r10)
            goto L142
        L138:
            boolean r10 = r0.useFastForwardActionInCompactView
            if (r10 == 0) goto L141
            int r8 = r12.indexOf(r8)
            goto L142
        L141:
            r8 = -1
        L142:
            int[] r4 = new int[r4]
            if (r9 == r11) goto L14b
            r10 = 0
            r4[r10] = r9
            r9 = 1
            goto L14c
        L14b:
            r9 = 0
        L14c:
            boolean r10 = r16.shouldShowPauseButton(r17)
            if (r6 == r11) goto L15a
            if (r10 == 0) goto L15a
            int r7 = r9 + 1
            r4[r9] = r6
            r9 = r7
            goto L163
        L15a:
            if (r7 == r11) goto L163
            if (r10 != 0) goto L163
            int r6 = r9 + 1
            r4[r9] = r7
            r9 = r6
        L163:
            if (r8 == r11) goto L16a
            int r6 = r9 + 1
            r4[r9] = r8
            r9 = r6
        L16a:
            int[] r4 = java.util.Arrays.copyOf(r4, r9)
            r5.setShowActionsInCompactView(r4)
            r4 = r2 ^ 1
            r5.setShowCancelButton(r4)
            android.app.PendingIntent r4 = r0.dismissPendingIntent
            r5.setCancelButtonIntent(r4)
            r3.setStyle(r5)
            android.app.PendingIntent r4 = r0.dismissPendingIntent
            r3.setDeleteIntent(r4)
            int r4 = r0.badgeIconType
            androidx.core.app.NotificationCompat$Builder r4 = r3.setBadgeIconType(r4)
            androidx.core.app.NotificationCompat$Builder r4 = r4.setOngoing(r2)
            int r5 = r0.color
            androidx.core.app.NotificationCompat$Builder r4 = r4.setColor(r5)
            boolean r5 = r0.colorized
            androidx.core.app.NotificationCompat$Builder r4 = r4.setColorized(r5)
            int r5 = r0.smallIconResourceId
            androidx.core.app.NotificationCompat$Builder r4 = r4.setSmallIcon(r5)
            int r5 = r0.visibility
            androidx.core.app.NotificationCompat$Builder r4 = r4.setVisibility(r5)
            int r5 = r0.priority
            androidx.core.app.NotificationCompat$Builder r4 = r4.setPriority(r5)
            int r5 = r0.defaults
            r4.setDefaults(r5)
            int r4 = com.google.android.exoplayer2.util.Util.SDK_INT
            r5 = 21
            if (r4 < r5) goto L1f6
            boolean r4 = r0.useChronometer
            if (r4 == 0) goto L1f6
            r4 = 16
            boolean r4 = r1.isCommandAvailable(r4)
            if (r4 == 0) goto L1f6
            boolean r4 = r17.isPlaying()
            if (r4 == 0) goto L1f6
            boolean r4 = r17.isPlayingAd()
            if (r4 != 0) goto L1f6
            boolean r4 = r17.isCurrentMediaItemDynamic()
            if (r4 != 0) goto L1f6
            com.google.android.exoplayer2.PlaybackParameters r4 = r17.getPlaybackParameters()
            float r4 = r4.speed
            r5 = 1065353216(0x3f800000, float:1.0)
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 != 0) goto L1f6
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r17.getContentPosition()
            long r4 = r4 - r6
            androidx.core.app.NotificationCompat$Builder r4 = r3.setWhen(r4)
            r5 = 1
            androidx.core.app.NotificationCompat$Builder r4 = r4.setShowWhen(r5)
            r4.setUsesChronometer(r5)
            goto L1fe
        L1f6:
            r4 = 0
            androidx.core.app.NotificationCompat$Builder r5 = r3.setShowWhen(r4)
            r5.setUsesChronometer(r4)
        L1fe:
            com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter r4 = r0.mediaDescriptionAdapter
            java.lang.CharSequence r4 = r4.getCurrentContentTitle(r1)
            r3.setContentTitle(r4)
            com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter r4 = r0.mediaDescriptionAdapter
            java.lang.CharSequence r4 = r4.getCurrentContentText(r1)
            r3.setContentText(r4)
            com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter r4 = r0.mediaDescriptionAdapter
            java.lang.CharSequence r4 = r4.getCurrentSubText(r1)
            r3.setSubText(r4)
            if (r18 != 0) goto L22e
            com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter r4 = r0.mediaDescriptionAdapter
            com.google.android.exoplayer2.ui.PlayerNotificationManager$BitmapCallback r5 = new com.google.android.exoplayer2.ui.PlayerNotificationManager$BitmapCallback
            int r6 = r0.currentNotificationTag
            r7 = 1
            int r6 = r6 + r7
            r0.currentNotificationTag = r6
            r7 = 0
            r5.<init>(r0, r6, r7)
            android.graphics.Bitmap r4 = r4.getCurrentLargeIcon(r1, r5)
            goto L230
        L22e:
            r4 = r18
        L230:
            setLargeIcon(r3, r4)
            com.google.android.exoplayer2.ui.PlayerNotificationManager$MediaDescriptionAdapter r4 = r0.mediaDescriptionAdapter
            android.app.PendingIntent r1 = r4.createCurrentContentIntent(r1)
            r3.setContentIntent(r1)
            java.lang.String r1 = r0.groupKey
            if (r1 == 0) goto L243
            r3.setGroup(r1)
        L243:
            r1 = 1
            r3.setOnlyAlertOnce(r1)
            r8 = r3
        L248:
            r0.builder = r8
            if (r8 != 0) goto L251
            r1 = 0
            r0.stopNotification(r1)
            return
        L251:
            r1 = 0
            android.app.Notification r3 = r8.build()
            androidx.core.app.NotificationManagerCompat r4 = r0.notificationManager
            int r5 = r0.notificationId
            r4.notify(r5, r3)
            boolean r4 = r0.isNotificationStarted
            if (r4 != 0) goto L26a
            android.content.Context r4 = r0.context
            com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationBroadcastReceiver r5 = r0.notificationBroadcastReceiver
            android.content.IntentFilter r6 = r0.intentFilter
            com.google.android.exoplayer2.util.Util.registerReceiverNotExported(r4, r5, r6)
        L26a:
            com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationListener r4 = r0.notificationListener
            if (r4 == 0) goto L27a
            int r5 = r0.notificationId
            if (r2 != 0) goto L276
            boolean r2 = r0.isNotificationStarted
            if (r2 != 0) goto L277
        L276:
            r1 = 1
        L277:
            r4.onNotificationPosted(r5, r3, r1)
        L27a:
            r1 = 1
            r0.isNotificationStarted = r1
            return
    }

    private void stopNotification(boolean r3) {
            r2 = this;
            boolean r0 = r2.isNotificationStarted
            if (r0 == 0) goto L23
            r0 = 0
            r2.isNotificationStarted = r0
            android.os.Handler r1 = r2.mainHandler
            r1.removeMessages(r0)
            androidx.core.app.NotificationManagerCompat r0 = r2.notificationManager
            int r1 = r2.notificationId
            r0.cancel(r1)
            android.content.Context r0 = r2.context
            com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationBroadcastReceiver r1 = r2.notificationBroadcastReceiver
            r0.unregisterReceiver(r1)
            com.google.android.exoplayer2.ui.PlayerNotificationManager$NotificationListener r0 = r2.notificationListener
            if (r0 == 0) goto L23
            int r1 = r2.notificationId
            r0.onNotificationCancelled(r1, r3)
        L23:
            return
    }

    public final void invalidate() {
            r1 = this;
            boolean r0 = r1.isNotificationStarted
            if (r0 == 0) goto L7
            r1.postStartOrUpdateNotification()
        L7:
            return
    }

    public final void setBadgeIconType(int r2) {
            r1 = this;
            int r0 = r1.badgeIconType
            if (r0 != r2) goto L5
            return
        L5:
            if (r2 == 0) goto L14
            r0 = 1
            if (r2 == r0) goto L14
            r0 = 2
            if (r2 != r0) goto Le
            goto L14
        Le:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L14:
            r1.badgeIconType = r2
            r1.invalidate()
            return
    }

    public final void setColor(int r2) {
            r1 = this;
            int r0 = r1.color
            if (r0 == r2) goto L9
            r1.color = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setColorized(boolean r2) {
            r1 = this;
            boolean r0 = r1.colorized
            if (r0 == r2) goto L9
            r1.colorized = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setDefaults(int r2) {
            r1 = this;
            int r0 = r1.defaults
            if (r0 == r2) goto L9
            r1.defaults = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setMediaSessionToken(android.support.v4.media.session.MediaSessionCompat.Token r2) {
            r1 = this;
            android.support.v4.media.session.MediaSessionCompat$Token r0 = r1.mediaSessionToken
            boolean r0 = com.google.android.exoplayer2.util.Util.areEqual(r0, r2)
            if (r0 != 0) goto Ld
            r1.mediaSessionToken = r2
            r1.invalidate()
        Ld:
            return
    }

    public final void setPlayer(@androidx.annotation.Nullable com.google.android.exoplayer2.Player r5) {
            r4 = this;
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 1
            r3 = 0
            if (r0 != r1) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            com.google.android.exoplayer2.util.Assertions.checkState(r0)
            if (r5 == 0) goto L20
            android.os.Looper r0 = r5.getApplicationLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L1f
            goto L20
        L1f:
            r2 = 0
        L20:
            com.google.android.exoplayer2.util.Assertions.checkArgument(r2)
            com.google.android.exoplayer2.Player r0 = r4.player
            if (r0 != r5) goto L28
            return
        L28:
            if (r0 == 0) goto L34
            com.google.android.exoplayer2.Player$Listener r1 = r4.playerListener
            r0.removeListener(r1)
            if (r5 != 0) goto L34
            r4.stopNotification(r3)
        L34:
            r4.player = r5
            if (r5 == 0) goto L40
            com.google.android.exoplayer2.Player$Listener r0 = r4.playerListener
            r5.addListener(r0)
            r4.postStartOrUpdateNotification()
        L40:
            return
    }

    public final void setPriority(int r2) {
            r1 = this;
            int r0 = r1.priority
            if (r0 != r2) goto L5
            return
        L5:
            r0 = -2
            if (r2 == r0) goto L1a
            r0 = -1
            if (r2 == r0) goto L1a
            if (r2 == 0) goto L1a
            r0 = 1
            if (r2 == r0) goto L1a
            r0 = 2
            if (r2 != r0) goto L14
            goto L1a
        L14:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            throw r2
        L1a:
            r1.priority = r2
            r1.invalidate()
            return
    }

    public final void setSmallIcon(@androidx.annotation.DrawableRes int r2) {
            r1 = this;
            int r0 = r1.smallIconResourceId
            if (r0 == r2) goto L9
            r1.smallIconResourceId = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setUseChronometer(boolean r2) {
            r1 = this;
            boolean r0 = r1.useChronometer
            if (r0 == r2) goto L9
            r1.useChronometer = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setUseFastForwardAction(boolean r2) {
            r1 = this;
            boolean r0 = r1.useFastForwardAction
            if (r0 == r2) goto L9
            r1.useFastForwardAction = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setUseFastForwardActionInCompactView(boolean r2) {
            r1 = this;
            boolean r0 = r1.useFastForwardActionInCompactView
            if (r0 == r2) goto Le
            r1.useFastForwardActionInCompactView = r2
            if (r2 == 0) goto Lb
            r2 = 0
            r1.useNextActionInCompactView = r2
        Lb:
            r1.invalidate()
        Le:
            return
    }

    public final void setUseNextAction(boolean r2) {
            r1 = this;
            boolean r0 = r1.useNextAction
            if (r0 == r2) goto L9
            r1.useNextAction = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setUseNextActionInCompactView(boolean r2) {
            r1 = this;
            boolean r0 = r1.useNextActionInCompactView
            if (r0 == r2) goto Le
            r1.useNextActionInCompactView = r2
            if (r2 == 0) goto Lb
            r2 = 0
            r1.useFastForwardActionInCompactView = r2
        Lb:
            r1.invalidate()
        Le:
            return
    }

    public final void setUsePlayPauseActions(boolean r2) {
            r1 = this;
            boolean r0 = r1.usePlayPauseActions
            if (r0 == r2) goto L9
            r1.usePlayPauseActions = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setUsePreviousAction(boolean r2) {
            r1 = this;
            boolean r0 = r1.usePreviousAction
            if (r0 == r2) goto L9
            r1.usePreviousAction = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setUsePreviousActionInCompactView(boolean r2) {
            r1 = this;
            boolean r0 = r1.usePreviousActionInCompactView
            if (r0 == r2) goto Le
            r1.usePreviousActionInCompactView = r2
            if (r2 == 0) goto Lb
            r2 = 0
            r1.useRewindActionInCompactView = r2
        Lb:
            r1.invalidate()
        Le:
            return
    }

    public final void setUseRewindAction(boolean r2) {
            r1 = this;
            boolean r0 = r1.useRewindAction
            if (r0 == r2) goto L9
            r1.useRewindAction = r2
            r1.invalidate()
        L9:
            return
    }

    public final void setUseRewindActionInCompactView(boolean r2) {
            r1 = this;
            boolean r0 = r1.useRewindActionInCompactView
            if (r0 == r2) goto Le
            r1.useRewindActionInCompactView = r2
            if (r2 == 0) goto Lb
            r2 = 0
            r1.usePreviousActionInCompactView = r2
        Lb:
            r1.invalidate()
        Le:
            return
    }

    public final void setUseStopAction(boolean r2) {
            r1 = this;
            boolean r0 = r1.useStopAction
            if (r0 != r2) goto L5
            return
        L5:
            r1.useStopAction = r2
            r1.invalidate()
            return
    }

    public final void setVisibility(int r2) {
            r1 = this;
            int r0 = r1.visibility
            if (r0 != r2) goto L5
            return
        L5:
            r0 = -1
            if (r2 == r0) goto L14
            if (r2 == 0) goto L14
            r0 = 1
            if (r2 != r0) goto Le
            goto L14
        Le:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            r2.<init>()
            throw r2
        L14:
            r1.visibility = r2
            r1.invalidate()
            return
    }
}
