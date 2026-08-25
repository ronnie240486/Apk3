package com.google.android.exoplayer2;

/* JADX INFO: loaded from: classes.dex */
public interface Player {
    public static final int COMMAND_ADJUST_DEVICE_VOLUME = 26;
    public static final int COMMAND_CHANGE_MEDIA_ITEMS = 20;
    public static final int COMMAND_GET_AUDIO_ATTRIBUTES = 21;
    public static final int COMMAND_GET_CURRENT_MEDIA_ITEM = 16;
    public static final int COMMAND_GET_DEVICE_VOLUME = 23;
    public static final int COMMAND_GET_MEDIA_ITEMS_METADATA = 18;
    public static final int COMMAND_GET_TEXT = 28;
    public static final int COMMAND_GET_TIMELINE = 17;
    public static final int COMMAND_GET_TRACKS = 30;
    public static final int COMMAND_GET_VOLUME = 22;
    public static final int COMMAND_INVALID = -1;
    public static final int COMMAND_PLAY_PAUSE = 1;
    public static final int COMMAND_PREPARE = 2;
    public static final int COMMAND_SEEK_BACK = 11;
    public static final int COMMAND_SEEK_FORWARD = 12;
    public static final int COMMAND_SEEK_IN_CURRENT_MEDIA_ITEM = 5;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_IN_CURRENT_WINDOW = 5;
    public static final int COMMAND_SEEK_TO_DEFAULT_POSITION = 4;
    public static final int COMMAND_SEEK_TO_MEDIA_ITEM = 10;
    public static final int COMMAND_SEEK_TO_NEXT = 9;
    public static final int COMMAND_SEEK_TO_NEXT_MEDIA_ITEM = 8;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_TO_NEXT_WINDOW = 8;
    public static final int COMMAND_SEEK_TO_PREVIOUS = 7;
    public static final int COMMAND_SEEK_TO_PREVIOUS_MEDIA_ITEM = 6;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_TO_PREVIOUS_WINDOW = 6;

    @java.lang.Deprecated
    public static final int COMMAND_SEEK_TO_WINDOW = 10;
    public static final int COMMAND_SET_DEVICE_VOLUME = 25;
    public static final int COMMAND_SET_MEDIA_ITEM = 31;
    public static final int COMMAND_SET_MEDIA_ITEMS_METADATA = 19;
    public static final int COMMAND_SET_REPEAT_MODE = 15;
    public static final int COMMAND_SET_SHUFFLE_MODE = 14;
    public static final int COMMAND_SET_SPEED_AND_PITCH = 13;
    public static final int COMMAND_SET_TRACK_SELECTION_PARAMETERS = 29;
    public static final int COMMAND_SET_VIDEO_SURFACE = 27;
    public static final int COMMAND_SET_VOLUME = 24;
    public static final int COMMAND_STOP = 3;
    public static final int DISCONTINUITY_REASON_AUTO_TRANSITION = 0;
    public static final int DISCONTINUITY_REASON_INTERNAL = 5;
    public static final int DISCONTINUITY_REASON_REMOVE = 4;
    public static final int DISCONTINUITY_REASON_SEEK = 1;
    public static final int DISCONTINUITY_REASON_SEEK_ADJUSTMENT = 2;
    public static final int DISCONTINUITY_REASON_SKIP = 3;
    public static final int EVENT_AUDIO_ATTRIBUTES_CHANGED = 20;
    public static final int EVENT_AUDIO_SESSION_ID = 21;
    public static final int EVENT_AVAILABLE_COMMANDS_CHANGED = 13;
    public static final int EVENT_CUES = 27;
    public static final int EVENT_DEVICE_INFO_CHANGED = 29;
    public static final int EVENT_DEVICE_VOLUME_CHANGED = 30;
    public static final int EVENT_IS_LOADING_CHANGED = 3;
    public static final int EVENT_IS_PLAYING_CHANGED = 7;
    public static final int EVENT_MAX_SEEK_TO_PREVIOUS_POSITION_CHANGED = 18;
    public static final int EVENT_MEDIA_ITEM_TRANSITION = 1;
    public static final int EVENT_MEDIA_METADATA_CHANGED = 14;
    public static final int EVENT_METADATA = 28;
    public static final int EVENT_PLAYBACK_PARAMETERS_CHANGED = 12;
    public static final int EVENT_PLAYBACK_STATE_CHANGED = 4;
    public static final int EVENT_PLAYBACK_SUPPRESSION_REASON_CHANGED = 6;
    public static final int EVENT_PLAYER_ERROR = 10;
    public static final int EVENT_PLAYLIST_METADATA_CHANGED = 15;
    public static final int EVENT_PLAY_WHEN_READY_CHANGED = 5;
    public static final int EVENT_POSITION_DISCONTINUITY = 11;
    public static final int EVENT_RENDERED_FIRST_FRAME = 26;
    public static final int EVENT_REPEAT_MODE_CHANGED = 8;
    public static final int EVENT_SEEK_BACK_INCREMENT_CHANGED = 16;
    public static final int EVENT_SEEK_FORWARD_INCREMENT_CHANGED = 17;
    public static final int EVENT_SHUFFLE_MODE_ENABLED_CHANGED = 9;
    public static final int EVENT_SKIP_SILENCE_ENABLED_CHANGED = 23;
    public static final int EVENT_SURFACE_SIZE_CHANGED = 24;
    public static final int EVENT_TIMELINE_CHANGED = 0;
    public static final int EVENT_TRACKS_CHANGED = 2;
    public static final int EVENT_TRACK_SELECTION_PARAMETERS_CHANGED = 19;
    public static final int EVENT_VIDEO_SIZE_CHANGED = 25;
    public static final int EVENT_VOLUME_CHANGED = 22;
    public static final int MEDIA_ITEM_TRANSITION_REASON_AUTO = 1;
    public static final int MEDIA_ITEM_TRANSITION_REASON_PLAYLIST_CHANGED = 3;
    public static final int MEDIA_ITEM_TRANSITION_REASON_REPEAT = 0;
    public static final int MEDIA_ITEM_TRANSITION_REASON_SEEK = 2;
    public static final int PLAYBACK_SUPPRESSION_REASON_NONE = 0;
    public static final int PLAYBACK_SUPPRESSION_REASON_TRANSIENT_AUDIO_FOCUS_LOSS = 1;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_BECOMING_NOISY = 3;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_AUDIO_FOCUS_LOSS = 2;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_END_OF_MEDIA_ITEM = 5;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_REMOTE = 4;
    public static final int PLAY_WHEN_READY_CHANGE_REASON_USER_REQUEST = 1;
    public static final int REPEAT_MODE_ALL = 2;
    public static final int REPEAT_MODE_OFF = 0;
    public static final int REPEAT_MODE_ONE = 1;
    public static final int STATE_BUFFERING = 2;
    public static final int STATE_ENDED = 4;
    public static final int STATE_IDLE = 1;
    public static final int STATE_READY = 3;
    public static final int TIMELINE_CHANGE_REASON_PLAYLIST_CHANGED = 0;
    public static final int TIMELINE_CHANGE_REASON_SOURCE_UPDATE = 1;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.Player$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes3.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Command {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Commands implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Player.Commands> CREATOR = null;
        public static final com.google.android.exoplayer2.Player.Commands EMPTY = null;
        private static final java.lang.String FIELD_COMMANDS = null;
        private final com.google.android.exoplayer2.util.FlagSet flags;

        /* JADX INFO: loaded from: classes3.dex */
        public static final class Builder {
            private static final int[] SUPPORTED_COMMANDS = null;
            private final com.google.android.exoplayer2.util.FlagSet.Builder flagsBuilder;

            static {
                    r0 = 31
                    int[] r0 = new int[r0]
                    r0 = {x000a: FILL_ARRAY_DATA , data: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 31, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30} // fill-array
                    com.google.android.exoplayer2.Player.Commands.Builder.SUPPORTED_COMMANDS = r0
                    return
            }

            public Builder() {
                    r1 = this;
                    r1.<init>()
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = new com.google.android.exoplayer2.util.FlagSet$Builder
                    r0.<init>()
                    r1.flagsBuilder = r0
                    return
            }

            private Builder(com.google.android.exoplayer2.Player.Commands r2) {
                    r1 = this;
                    r1.<init>()
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = new com.google.android.exoplayer2.util.FlagSet$Builder
                    r0.<init>()
                    r1.flagsBuilder = r0
                    com.google.android.exoplayer2.util.FlagSet r2 = com.google.android.exoplayer2.Player.Commands.access$000(r2)
                    r0.addAll(r2)
                    return
            }

            public /* synthetic */ Builder(com.google.android.exoplayer2.Player.Commands r1, com.google.android.exoplayer2.Player.AnonymousClass1 r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.Player.Commands.Builder add(int r2) {
                    r1 = this;
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = r1.flagsBuilder
                    r0.add(r2)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.Player.Commands.Builder addAll(com.google.android.exoplayer2.Player.Commands r2) {
                    r1 = this;
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = r1.flagsBuilder
                    com.google.android.exoplayer2.util.FlagSet r2 = com.google.android.exoplayer2.Player.Commands.access$000(r2)
                    r0.addAll(r2)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.Player.Commands.Builder addAll(int... r2) {
                    r1 = this;
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = r1.flagsBuilder
                    r0.addAll(r2)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.Player.Commands.Builder addAllCommands() {
                    r2 = this;
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = r2.flagsBuilder
                    int[] r1 = com.google.android.exoplayer2.Player.Commands.Builder.SUPPORTED_COMMANDS
                    r0.addAll(r1)
                    return r2
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.Player.Commands.Builder addIf(int r2, boolean r3) {
                    r1 = this;
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = r1.flagsBuilder
                    r0.addIf(r2, r3)
                    return r1
            }

            public com.google.android.exoplayer2.Player.Commands build() {
                    r3 = this;
                    com.google.android.exoplayer2.Player$Commands r0 = new com.google.android.exoplayer2.Player$Commands
                    com.google.android.exoplayer2.util.FlagSet$Builder r1 = r3.flagsBuilder
                    com.google.android.exoplayer2.util.FlagSet r1 = r1.build()
                    r2 = 0
                    r0.<init>(r1, r2)
                    return r0
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.Player.Commands.Builder remove(int r2) {
                    r1 = this;
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = r1.flagsBuilder
                    r0.remove(r2)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.Player.Commands.Builder removeAll(int... r2) {
                    r1 = this;
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = r1.flagsBuilder
                    r0.removeAll(r2)
                    return r1
            }

            @com.google.errorprone.annotations.CanIgnoreReturnValue
            public com.google.android.exoplayer2.Player.Commands.Builder removeIf(int r2, boolean r3) {
                    r1 = this;
                    com.google.android.exoplayer2.util.FlagSet$Builder r0 = r1.flagsBuilder
                    r0.removeIf(r2, r3)
                    return r1
            }
        }

        public static /* synthetic */ com.google.android.exoplayer2.Player.Commands $r8$lambda$9wfIGaCsSPvbzymZpUY6mofx72A(android.os.Bundle r0) {
                com.google.android.exoplayer2.Player$Commands r0 = fromBundle(r0)
                return r0
        }

        static {
                com.google.android.exoplayer2.Player$Commands$Builder r0 = new com.google.android.exoplayer2.Player$Commands$Builder
                r0.<init>()
                com.google.android.exoplayer2.Player$Commands r0 = r0.build()
                com.google.android.exoplayer2.Player.Commands.EMPTY = r0
                r0 = 0
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Player.Commands.FIELD_COMMANDS = r0
                com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$15
                com.google.android.exoplayer2.Player.Commands.CREATOR = r0
                return
        }

        private Commands(com.google.android.exoplayer2.util.FlagSet r1) {
                r0 = this;
                r0.<init>()
                r0.flags = r1
                return
        }

        public /* synthetic */ Commands(com.google.android.exoplayer2.util.FlagSet r1, com.google.android.exoplayer2.Player.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ com.google.android.exoplayer2.util.FlagSet access$000(com.google.android.exoplayer2.Player.Commands r0) {
                com.google.android.exoplayer2.util.FlagSet r0 = r0.flags
                return r0
        }

        private static com.google.android.exoplayer2.Player.Commands fromBundle(android.os.Bundle r3) {
                java.lang.String r0 = com.google.android.exoplayer2.Player.Commands.FIELD_COMMANDS
                java.util.ArrayList r3 = r3.getIntegerArrayList(r0)
                if (r3 != 0) goto Lb
                com.google.android.exoplayer2.Player$Commands r3 = com.google.android.exoplayer2.Player.Commands.EMPTY
                return r3
            Lb:
                com.google.android.exoplayer2.Player$Commands$Builder r0 = new com.google.android.exoplayer2.Player$Commands$Builder
                r0.<init>()
                r1 = 0
            L11:
                int r2 = r3.size()
                if (r1 >= r2) goto L27
                java.lang.Object r2 = r3.get(r1)
                java.lang.Integer r2 = (java.lang.Integer) r2
                int r2 = r2.intValue()
                r0.add(r2)
                int r1 = r1 + 1
                goto L11
            L27:
                com.google.android.exoplayer2.Player$Commands r3 = r0.build()
                return r3
        }

        public com.google.android.exoplayer2.Player.Commands.Builder buildUpon() {
                r2 = this;
                com.google.android.exoplayer2.Player$Commands$Builder r0 = new com.google.android.exoplayer2.Player$Commands$Builder
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public boolean contains(int r2) {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                boolean r2 = r0.contains(r2)
                return r2
        }

        public boolean containsAny(int... r2) {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                boolean r2 = r0.containsAny(r2)
                return r2
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof com.google.android.exoplayer2.Player.Commands
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                com.google.android.exoplayer2.Player$Commands r2 = (com.google.android.exoplayer2.Player.Commands) r2
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                com.google.android.exoplayer2.util.FlagSet r2 = r2.flags
                boolean r2 = r0.equals(r2)
                return r2
        }

        public int get(int r2) {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                int r2 = r0.get(r2)
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                int r0 = r0.hashCode()
                return r0
        }

        public int size() {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                int r0 = r0.size()
                return r0
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r4 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r2 = 0
            Lb:
                com.google.android.exoplayer2.util.FlagSet r3 = r4.flags
                int r3 = r3.size()
                if (r2 >= r3) goto L23
                com.google.android.exoplayer2.util.FlagSet r3 = r4.flags
                int r3 = r3.get(r2)
                java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                r1.add(r3)
                int r2 = r2 + 1
                goto Lb
            L23:
                java.lang.String r2 = com.google.android.exoplayer2.Player.Commands.FIELD_COMMANDS
                r0.putIntegerArrayList(r2, r1)
                return r0
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface DiscontinuityReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Event {
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Events {
        private final com.google.android.exoplayer2.util.FlagSet flags;

        public Events(com.google.android.exoplayer2.util.FlagSet r1) {
                r0 = this;
                r0.<init>()
                r0.flags = r1
                return
        }

        public boolean contains(int r2) {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                boolean r2 = r0.contains(r2)
                return r2
        }

        public boolean containsAny(int... r2) {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                boolean r2 = r0.containsAny(r2)
                return r2
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r2) {
                r1 = this;
                if (r1 != r2) goto L4
                r2 = 1
                return r2
            L4:
                boolean r0 = r2 instanceof com.google.android.exoplayer2.Player.Events
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                com.google.android.exoplayer2.Player$Events r2 = (com.google.android.exoplayer2.Player.Events) r2
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                com.google.android.exoplayer2.util.FlagSet r2 = r2.flags
                boolean r2 = r0.equals(r2)
                return r2
        }

        public int get(int r2) {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                int r2 = r0.get(r2)
                return r2
        }

        public int hashCode() {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                int r0 = r0.hashCode()
                return r0
        }

        public int size() {
                r1 = this;
                com.google.android.exoplayer2.util.FlagSet r0 = r1.flags
                int r0 = r0.size()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface Listener {

        /* JADX INFO: renamed from: com.google.android.exoplayer2.Player$Listener$-CC, reason: invalid class name */
        /* JADX INFO: loaded from: classes.dex */
        public final /* synthetic */ class CC {
            public static void $default$onAudioAttributesChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.audio.AudioAttributes r1) {
                    return
            }

            public static void $default$onAudioSessionIdChanged(com.google.android.exoplayer2.Player.Listener r0, int r1) {
                    return
            }

            public static void $default$onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.Player.Commands r1) {
                    return
            }

            public static void $default$onCues(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.text.CueGroup r1) {
                    return
            }

            @java.lang.Deprecated
            public static void $default$onCues(com.google.android.exoplayer2.Player.Listener r0, java.util.List r1) {
                    return
            }

            public static void $default$onDeviceInfoChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.DeviceInfo r1) {
                    return
            }

            public static void $default$onDeviceVolumeChanged(com.google.android.exoplayer2.Player.Listener r0, int r1, boolean r2) {
                    return
            }

            public static void $default$onEvents(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.Player.Events r2) {
                    return
            }

            public static void $default$onIsLoadingChanged(com.google.android.exoplayer2.Player.Listener r0, boolean r1) {
                    return
            }

            public static void $default$onIsPlayingChanged(com.google.android.exoplayer2.Player.Listener r0, boolean r1) {
                    return
            }

            @java.lang.Deprecated
            public static void $default$onLoadingChanged(com.google.android.exoplayer2.Player.Listener r0, boolean r1) {
                    return
            }

            public static void $default$onMaxSeekToPreviousPositionChanged(com.google.android.exoplayer2.Player.Listener r0, long r1) {
                    return
            }

            public static void $default$onMediaItemTransition(com.google.android.exoplayer2.Player.Listener r0, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem r1, int r2) {
                    return
            }

            public static void $default$onMediaMetadataChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.MediaMetadata r1) {
                    return
            }

            public static void $default$onMetadata(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.metadata.Metadata r1) {
                    return
            }

            public static void $default$onPlayWhenReadyChanged(com.google.android.exoplayer2.Player.Listener r0, boolean r1, int r2) {
                    return
            }

            public static void $default$onPlaybackParametersChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.PlaybackParameters r1) {
                    return
            }

            public static void $default$onPlaybackStateChanged(com.google.android.exoplayer2.Player.Listener r0, int r1) {
                    return
            }

            public static void $default$onPlaybackSuppressionReasonChanged(com.google.android.exoplayer2.Player.Listener r0, int r1) {
                    return
            }

            public static void $default$onPlayerError(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.PlaybackException r1) {
                    return
            }

            public static void $default$onPlayerErrorChanged(com.google.android.exoplayer2.Player.Listener r0, @androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r1) {
                    return
            }

            @java.lang.Deprecated
            public static void $default$onPlayerStateChanged(com.google.android.exoplayer2.Player.Listener r0, boolean r1, int r2) {
                    return
            }

            public static void $default$onPlaylistMetadataChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.MediaMetadata r1) {
                    return
            }

            @java.lang.Deprecated
            public static void $default$onPositionDiscontinuity(com.google.android.exoplayer2.Player.Listener r0, int r1) {
                    return
            }

            public static void $default$onPositionDiscontinuity(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, int r3) {
                    return
            }

            public static void $default$onRenderedFirstFrame(com.google.android.exoplayer2.Player.Listener r0) {
                    return
            }

            public static void $default$onRepeatModeChanged(com.google.android.exoplayer2.Player.Listener r0, int r1) {
                    return
            }

            public static void $default$onSeekBackIncrementChanged(com.google.android.exoplayer2.Player.Listener r0, long r1) {
                    return
            }

            public static void $default$onSeekForwardIncrementChanged(com.google.android.exoplayer2.Player.Listener r0, long r1) {
                    return
            }

            @java.lang.Deprecated
            public static void $default$onSeekProcessed(com.google.android.exoplayer2.Player.Listener r0) {
                    return
            }

            public static void $default$onShuffleModeEnabledChanged(com.google.android.exoplayer2.Player.Listener r0, boolean r1) {
                    return
            }

            public static void $default$onSkipSilenceEnabledChanged(com.google.android.exoplayer2.Player.Listener r0, boolean r1) {
                    return
            }

            public static void $default$onSurfaceSizeChanged(com.google.android.exoplayer2.Player.Listener r0, int r1, int r2) {
                    return
            }

            public static void $default$onTimelineChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.Timeline r1, int r2) {
                    return
            }

            public static void $default$onTrackSelectionParametersChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1) {
                    return
            }

            public static void $default$onTracksChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.Tracks r1) {
                    return
            }

            public static void $default$onVideoSizeChanged(com.google.android.exoplayer2.Player.Listener r0, com.google.android.exoplayer2.video.VideoSize r1) {
                    return
            }

            public static void $default$onVolumeChanged(com.google.android.exoplayer2.Player.Listener r0, float r1) {
                    return
            }
        }

        void onAudioAttributesChanged(com.google.android.exoplayer2.audio.AudioAttributes r1);

        void onAudioSessionIdChanged(int r1);

        void onAvailableCommandsChanged(com.google.android.exoplayer2.Player.Commands r1);

        void onCues(com.google.android.exoplayer2.text.CueGroup r1);

        @java.lang.Deprecated
        void onCues(java.util.List<com.google.android.exoplayer2.text.Cue> r1);

        void onDeviceInfoChanged(com.google.android.exoplayer2.DeviceInfo r1);

        void onDeviceVolumeChanged(int r1, boolean r2);

        void onEvents(com.google.android.exoplayer2.Player r1, com.google.android.exoplayer2.Player.Events r2);

        void onIsLoadingChanged(boolean r1);

        void onIsPlayingChanged(boolean r1);

        @java.lang.Deprecated
        void onLoadingChanged(boolean r1);

        void onMaxSeekToPreviousPositionChanged(long r1);

        void onMediaItemTransition(@androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem r1, int r2);

        void onMediaMetadataChanged(com.google.android.exoplayer2.MediaMetadata r1);

        void onMetadata(com.google.android.exoplayer2.metadata.Metadata r1);

        void onPlayWhenReadyChanged(boolean r1, int r2);

        void onPlaybackParametersChanged(com.google.android.exoplayer2.PlaybackParameters r1);

        void onPlaybackStateChanged(int r1);

        void onPlaybackSuppressionReasonChanged(int r1);

        void onPlayerError(com.google.android.exoplayer2.PlaybackException r1);

        void onPlayerErrorChanged(@androidx.annotation.Nullable com.google.android.exoplayer2.PlaybackException r1);

        @java.lang.Deprecated
        void onPlayerStateChanged(boolean r1, int r2);

        void onPlaylistMetadataChanged(com.google.android.exoplayer2.MediaMetadata r1);

        @java.lang.Deprecated
        void onPositionDiscontinuity(int r1);

        void onPositionDiscontinuity(com.google.android.exoplayer2.Player.PositionInfo r1, com.google.android.exoplayer2.Player.PositionInfo r2, int r3);

        void onRenderedFirstFrame();

        void onRepeatModeChanged(int r1);

        void onSeekBackIncrementChanged(long r1);

        void onSeekForwardIncrementChanged(long r1);

        @java.lang.Deprecated
        void onSeekProcessed();

        void onShuffleModeEnabledChanged(boolean r1);

        void onSkipSilenceEnabledChanged(boolean r1);

        void onSurfaceSizeChanged(int r1, int r2);

        void onTimelineChanged(com.google.android.exoplayer2.Timeline r1, int r2);

        void onTrackSelectionParametersChanged(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1);

        void onTracksChanged(com.google.android.exoplayer2.Tracks r1);

        void onVideoSizeChanged(com.google.android.exoplayer2.video.VideoSize r1);

        void onVolumeChanged(float r1);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface MediaItemTransitionReason {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlayWhenReadyChangeReason {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface PlaybackSuppressionReason {
    }

    public static final class PositionInfo implements com.google.android.exoplayer2.Bundleable {
        public static final com.google.android.exoplayer2.Bundleable.Creator<com.google.android.exoplayer2.Player.PositionInfo> CREATOR = null;
        private static final java.lang.String FIELD_AD_GROUP_INDEX = null;
        private static final java.lang.String FIELD_AD_INDEX_IN_AD_GROUP = null;
        private static final java.lang.String FIELD_CONTENT_POSITION_MS = null;
        private static final java.lang.String FIELD_MEDIA_ITEM = null;
        private static final java.lang.String FIELD_MEDIA_ITEM_INDEX = null;
        private static final java.lang.String FIELD_PERIOD_INDEX = null;
        private static final java.lang.String FIELD_POSITION_MS = null;
        public final int adGroupIndex;
        public final int adIndexInAdGroup;
        public final long contentPositionMs;

        @androidx.annotation.Nullable
        public final com.google.android.exoplayer2.MediaItem mediaItem;
        public final int mediaItemIndex;
        public final int periodIndex;

        @androidx.annotation.Nullable
        public final java.lang.Object periodUid;
        public final long positionMs;

        @java.lang.Deprecated
        public final int windowIndex;

        @androidx.annotation.Nullable
        public final java.lang.Object windowUid;

        /* JADX INFO: renamed from: $r8$lambda$0Jai4hp00qCDar7e3Ewko-nPWjA, reason: not valid java name */
        public static /* synthetic */ com.google.android.exoplayer2.Player.PositionInfo m172$r8$lambda$0Jai4hp00qCDar7e3EwkonPWjA(android.os.Bundle r0) {
                com.google.android.exoplayer2.Player$PositionInfo r0 = fromBundle(r0)
                return r0
        }

        static {
                r0 = 0
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Player.PositionInfo.FIELD_MEDIA_ITEM_INDEX = r0
                r0 = 1
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Player.PositionInfo.FIELD_MEDIA_ITEM = r0
                r0 = 2
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Player.PositionInfo.FIELD_PERIOD_INDEX = r0
                r0 = 3
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Player.PositionInfo.FIELD_POSITION_MS = r0
                r0 = 4
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Player.PositionInfo.FIELD_CONTENT_POSITION_MS = r0
                r0 = 5
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Player.PositionInfo.FIELD_AD_GROUP_INDEX = r0
                r0 = 6
                java.lang.String r0 = com.google.android.exoplayer2.util.Util.intToStringMaxRadix(r0)
                com.google.android.exoplayer2.Player.PositionInfo.FIELD_AD_INDEX_IN_AD_GROUP = r0
                com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0 r0 = com.google.android.exoplayer2.Format$$ExternalSyntheticLambda0.INSTANCE$16
                com.google.android.exoplayer2.Player.PositionInfo.CREATOR = r0
                return
        }

        public PositionInfo(@androidx.annotation.Nullable java.lang.Object r1, int r2, @androidx.annotation.Nullable com.google.android.exoplayer2.MediaItem r3, @androidx.annotation.Nullable java.lang.Object r4, int r5, long r6, long r8, int r10, int r11) {
                r0 = this;
                r0.<init>()
                r0.windowUid = r1
                r0.windowIndex = r2
                r0.mediaItemIndex = r2
                r0.mediaItem = r3
                r0.periodUid = r4
                r0.periodIndex = r5
                r0.positionMs = r6
                r0.contentPositionMs = r8
                r0.adGroupIndex = r10
                r0.adIndexInAdGroup = r11
                return
        }

        @java.lang.Deprecated
        public PositionInfo(@androidx.annotation.Nullable java.lang.Object r13, int r14, @androidx.annotation.Nullable java.lang.Object r15, int r16, long r17, long r19, int r21, int r22) {
                r12 = this;
                com.google.android.exoplayer2.MediaItem r3 = com.google.android.exoplayer2.MediaItem.EMPTY
                r0 = r12
                r1 = r13
                r2 = r14
                r4 = r15
                r5 = r16
                r6 = r17
                r8 = r19
                r10 = r21
                r11 = r22
                r0.<init>(r1, r2, r3, r4, r5, r6, r8, r10, r11)
                return
        }

        private static com.google.android.exoplayer2.Player.PositionInfo fromBundle(android.os.Bundle r14) {
                java.lang.String r0 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_MEDIA_ITEM_INDEX
                r1 = 0
                int r4 = r14.getInt(r0, r1)
                java.lang.String r0 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_MEDIA_ITEM
                android.os.Bundle r0 = r14.getBundle(r0)
                if (r0 != 0) goto L11
                r0 = 0
                goto L19
            L11:
                com.google.android.exoplayer2.Bundleable$Creator<com.google.android.exoplayer2.MediaItem> r2 = com.google.android.exoplayer2.MediaItem.CREATOR
                com.google.android.exoplayer2.Bundleable r0 = r2.fromBundle(r0)
                com.google.android.exoplayer2.MediaItem r0 = (com.google.android.exoplayer2.MediaItem) r0
            L19:
                r5 = r0
                java.lang.String r0 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_PERIOD_INDEX
                int r7 = r14.getInt(r0, r1)
                java.lang.String r0 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_POSITION_MS
                r1 = 0
                long r8 = r14.getLong(r0, r1)
                java.lang.String r0 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_CONTENT_POSITION_MS
                long r10 = r14.getLong(r0, r1)
                java.lang.String r0 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_AD_GROUP_INDEX
                r1 = -1
                int r12 = r14.getInt(r0, r1)
                java.lang.String r0 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_AD_INDEX_IN_AD_GROUP
                int r13 = r14.getInt(r0, r1)
                com.google.android.exoplayer2.Player$PositionInfo r14 = new com.google.android.exoplayer2.Player$PositionInfo
                r3 = 0
                r6 = 0
                r2 = r14
                r2.<init>(r3, r4, r5, r6, r7, r8, r10, r12, r13)
                return r14
        }

        public boolean equals(@androidx.annotation.Nullable java.lang.Object r8) {
                r7 = this;
                r0 = 1
                if (r7 != r8) goto L4
                return r0
            L4:
                r1 = 0
                if (r8 == 0) goto L5b
                java.lang.Class<com.google.android.exoplayer2.Player$PositionInfo> r2 = com.google.android.exoplayer2.Player.PositionInfo.class
                java.lang.Class r3 = r8.getClass()
                if (r2 == r3) goto L10
                goto L5b
            L10:
                com.google.android.exoplayer2.Player$PositionInfo r8 = (com.google.android.exoplayer2.Player.PositionInfo) r8
                int r2 = r7.mediaItemIndex
                int r3 = r8.mediaItemIndex
                if (r2 != r3) goto L59
                int r2 = r7.periodIndex
                int r3 = r8.periodIndex
                if (r2 != r3) goto L59
                long r2 = r7.positionMs
                long r4 = r8.positionMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L59
                long r2 = r7.contentPositionMs
                long r4 = r8.contentPositionMs
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 != 0) goto L59
                int r2 = r7.adGroupIndex
                int r3 = r8.adGroupIndex
                if (r2 != r3) goto L59
                int r2 = r7.adIndexInAdGroup
                int r3 = r8.adIndexInAdGroup
                if (r2 != r3) goto L59
                java.lang.Object r2 = r7.windowUid
                java.lang.Object r3 = r8.windowUid
                boolean r2 = com.google.common.base.Objects.equal(r2, r3)
                if (r2 == 0) goto L59
                java.lang.Object r2 = r7.periodUid
                java.lang.Object r3 = r8.periodUid
                boolean r2 = com.google.common.base.Objects.equal(r2, r3)
                if (r2 == 0) goto L59
                com.google.android.exoplayer2.MediaItem r2 = r7.mediaItem
                com.google.android.exoplayer2.MediaItem r8 = r8.mediaItem
                boolean r8 = com.google.common.base.Objects.equal(r2, r8)
                if (r8 == 0) goto L59
                goto L5a
            L59:
                r0 = 0
            L5a:
                return r0
            L5b:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 9
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.Object r1 = r3.windowUid
                r2 = 0
                r0[r2] = r1
                int r1 = r3.mediaItemIndex
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 1
                r0[r2] = r1
                com.google.android.exoplayer2.MediaItem r1 = r3.mediaItem
                r2 = 2
                r0[r2] = r1
                java.lang.Object r1 = r3.periodUid
                r2 = 3
                r0[r2] = r1
                int r1 = r3.periodIndex
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 4
                r0[r2] = r1
                long r1 = r3.positionMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 5
                r0[r2] = r1
                long r1 = r3.contentPositionMs
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                r2 = 6
                r0[r2] = r1
                int r1 = r3.adGroupIndex
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 7
                r0[r2] = r1
                int r1 = r3.adIndexInAdGroup
                java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                r2 = 8
                r0[r2] = r1
                int r0 = com.google.common.base.Objects.hashCode(r0)
                return r0
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public android.os.Bundle toBundle() {
                r1 = this;
                r0 = 1
                android.os.Bundle r0 = r1.toBundle(r0, r0)
                return r0
        }

        public android.os.Bundle toBundle(boolean r6, boolean r7) {
                r5 = this;
                android.os.Bundle r0 = new android.os.Bundle
                r0.<init>()
                java.lang.String r1 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_MEDIA_ITEM_INDEX
                r2 = 0
                if (r7 == 0) goto Ld
                int r3 = r5.mediaItemIndex
                goto Le
            Ld:
                r3 = 0
            Le:
                r0.putInt(r1, r3)
                com.google.android.exoplayer2.MediaItem r1 = r5.mediaItem
                if (r1 == 0) goto L20
                if (r6 == 0) goto L20
                java.lang.String r3 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_MEDIA_ITEM
                android.os.Bundle r1 = r1.toBundle()
                r0.putBundle(r3, r1)
            L20:
                java.lang.String r1 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_PERIOD_INDEX
                if (r7 == 0) goto L26
                int r2 = r5.periodIndex
            L26:
                r0.putInt(r1, r2)
                java.lang.String r7 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_POSITION_MS
                r1 = 0
                if (r6 == 0) goto L32
                long r3 = r5.positionMs
                goto L33
            L32:
                r3 = r1
            L33:
                r0.putLong(r7, r3)
                java.lang.String r7 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_CONTENT_POSITION_MS
                if (r6 == 0) goto L3c
                long r1 = r5.contentPositionMs
            L3c:
                r0.putLong(r7, r1)
                java.lang.String r7 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_AD_GROUP_INDEX
                r1 = -1
                if (r6 == 0) goto L47
                int r2 = r5.adGroupIndex
                goto L48
            L47:
                r2 = -1
            L48:
                r0.putInt(r7, r2)
                java.lang.String r7 = com.google.android.exoplayer2.Player.PositionInfo.FIELD_AD_INDEX_IN_AD_GROUP
                if (r6 == 0) goto L51
                int r1 = r5.adIndexInAdGroup
            L51:
                r0.putInt(r7, r1)
                return r0
        }
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface RepeatMode {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface State {
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface TimelineChangeReason {
    }

    void addListener(com.google.android.exoplayer2.Player.Listener r1);

    void addMediaItem(int r1, com.google.android.exoplayer2.MediaItem r2);

    void addMediaItem(com.google.android.exoplayer2.MediaItem r1);

    void addMediaItems(int r1, java.util.List<com.google.android.exoplayer2.MediaItem> r2);

    void addMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r1);

    boolean canAdvertiseSession();

    void clearMediaItems();

    void clearVideoSurface();

    void clearVideoSurface(@androidx.annotation.Nullable android.view.Surface r1);

    void clearVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r1);

    void clearVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r1);

    void clearVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r1);

    void decreaseDeviceVolume();

    android.os.Looper getApplicationLooper();

    com.google.android.exoplayer2.audio.AudioAttributes getAudioAttributes();

    com.google.android.exoplayer2.Player.Commands getAvailableCommands();

    @androidx.annotation.IntRange(from = 0, to = 100)
    int getBufferedPercentage();

    long getBufferedPosition();

    long getContentBufferedPosition();

    long getContentDuration();

    long getContentPosition();

    int getCurrentAdGroupIndex();

    int getCurrentAdIndexInAdGroup();

    com.google.android.exoplayer2.text.CueGroup getCurrentCues();

    long getCurrentLiveOffset();

    @androidx.annotation.Nullable
    java.lang.Object getCurrentManifest();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.MediaItem getCurrentMediaItem();

    int getCurrentMediaItemIndex();

    int getCurrentPeriodIndex();

    long getCurrentPosition();

    com.google.android.exoplayer2.Timeline getCurrentTimeline();

    com.google.android.exoplayer2.Tracks getCurrentTracks();

    @java.lang.Deprecated
    int getCurrentWindowIndex();

    com.google.android.exoplayer2.DeviceInfo getDeviceInfo();

    @androidx.annotation.IntRange(from = 0)
    int getDeviceVolume();

    long getDuration();

    long getMaxSeekToPreviousPosition();

    com.google.android.exoplayer2.MediaItem getMediaItemAt(int r1);

    int getMediaItemCount();

    com.google.android.exoplayer2.MediaMetadata getMediaMetadata();

    int getNextMediaItemIndex();

    @java.lang.Deprecated
    int getNextWindowIndex();

    boolean getPlayWhenReady();

    com.google.android.exoplayer2.PlaybackParameters getPlaybackParameters();

    int getPlaybackState();

    int getPlaybackSuppressionReason();

    @androidx.annotation.Nullable
    com.google.android.exoplayer2.PlaybackException getPlayerError();

    com.google.android.exoplayer2.MediaMetadata getPlaylistMetadata();

    int getPreviousMediaItemIndex();

    @java.lang.Deprecated
    int getPreviousWindowIndex();

    int getRepeatMode();

    long getSeekBackIncrement();

    long getSeekForwardIncrement();

    boolean getShuffleModeEnabled();

    com.google.android.exoplayer2.util.Size getSurfaceSize();

    long getTotalBufferedDuration();

    com.google.android.exoplayer2.trackselection.TrackSelectionParameters getTrackSelectionParameters();

    com.google.android.exoplayer2.video.VideoSize getVideoSize();

    @androidx.annotation.FloatRange(from = 0.0d, to = 1.0d)
    float getVolume();

    @java.lang.Deprecated
    boolean hasNext();

    boolean hasNextMediaItem();

    @java.lang.Deprecated
    boolean hasNextWindow();

    @java.lang.Deprecated
    boolean hasPrevious();

    boolean hasPreviousMediaItem();

    @java.lang.Deprecated
    boolean hasPreviousWindow();

    void increaseDeviceVolume();

    boolean isCommandAvailable(int r1);

    boolean isCurrentMediaItemDynamic();

    boolean isCurrentMediaItemLive();

    boolean isCurrentMediaItemSeekable();

    @java.lang.Deprecated
    boolean isCurrentWindowDynamic();

    @java.lang.Deprecated
    boolean isCurrentWindowLive();

    @java.lang.Deprecated
    boolean isCurrentWindowSeekable();

    boolean isDeviceMuted();

    boolean isLoading();

    boolean isPlaying();

    boolean isPlayingAd();

    void moveMediaItem(int r1, int r2);

    void moveMediaItems(int r1, int r2, int r3);

    @java.lang.Deprecated
    void next();

    void pause();

    void play();

    void prepare();

    @java.lang.Deprecated
    void previous();

    void release();

    void removeListener(com.google.android.exoplayer2.Player.Listener r1);

    void removeMediaItem(int r1);

    void removeMediaItems(int r1, int r2);

    void seekBack();

    void seekForward();

    void seekTo(int r1, long r2);

    void seekTo(long r1);

    void seekToDefaultPosition();

    void seekToDefaultPosition(int r1);

    void seekToNext();

    void seekToNextMediaItem();

    @java.lang.Deprecated
    void seekToNextWindow();

    void seekToPrevious();

    void seekToPreviousMediaItem();

    @java.lang.Deprecated
    void seekToPreviousWindow();

    void setDeviceMuted(boolean r1);

    void setDeviceVolume(@androidx.annotation.IntRange(from = 0) int r1);

    void setMediaItem(com.google.android.exoplayer2.MediaItem r1);

    void setMediaItem(com.google.android.exoplayer2.MediaItem r1, long r2);

    void setMediaItem(com.google.android.exoplayer2.MediaItem r1, boolean r2);

    void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r1);

    void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r1, int r2, long r3);

    void setMediaItems(java.util.List<com.google.android.exoplayer2.MediaItem> r1, boolean r2);

    void setPlayWhenReady(boolean r1);

    void setPlaybackParameters(com.google.android.exoplayer2.PlaybackParameters r1);

    void setPlaybackSpeed(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r1);

    void setPlaylistMetadata(com.google.android.exoplayer2.MediaMetadata r1);

    void setRepeatMode(int r1);

    void setShuffleModeEnabled(boolean r1);

    void setTrackSelectionParameters(com.google.android.exoplayer2.trackselection.TrackSelectionParameters r1);

    void setVideoSurface(@androidx.annotation.Nullable android.view.Surface r1);

    void setVideoSurfaceHolder(@androidx.annotation.Nullable android.view.SurfaceHolder r1);

    void setVideoSurfaceView(@androidx.annotation.Nullable android.view.SurfaceView r1);

    void setVideoTextureView(@androidx.annotation.Nullable android.view.TextureView r1);

    void setVolume(@androidx.annotation.FloatRange(from = 0.0d, to = 1.0d) float r1);

    void stop();

    @java.lang.Deprecated
    void stop(boolean r1);
}
