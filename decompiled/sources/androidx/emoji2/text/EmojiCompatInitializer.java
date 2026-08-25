package androidx.emoji2.text;

/* JADX INFO: loaded from: classes2.dex */
public class EmojiCompatInitializer implements androidx.startup.Initializer<java.lang.Boolean> {
    private static final long STARTUP_THREAD_CREATION_DELAY_MS = 500;
    private static final java.lang.String S_INITIALIZER_THREAD_NAME = "EmojiCompatInitializer";


    @androidx.annotation.RequiresApi(19)
    public static class BackgroundDefaultConfig extends androidx.emoji2.text.EmojiCompat.Config {
        public BackgroundDefaultConfig(android.content.Context r2) {
                r1 = this;
                androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader r0 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader
                r0.<init>(r2)
                r1.<init>(r0)
                r2 = 1
                r1.setMetadataLoadStrategy(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(19)
    public static class BackgroundDefaultLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private final android.content.Context mContext;


        public static /* synthetic */ void $r8$lambda$2V1iWTiAwNxOBlVvz73bbuEdzIw(androidx.emoji2.text.EmojiCompatInitializer.BackgroundDefaultLoader r0, androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r1, java.util.concurrent.ThreadPoolExecutor r2) {
                r0.lambda$load$0(r1, r2)
                return
        }

        public BackgroundDefaultLoader(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                android.content.Context r1 = r1.getApplicationContext()
                r0.mContext = r1
                return
        }

        private void lambda$load$0(androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r3, java.util.concurrent.ThreadPoolExecutor r4) {
                r2 = this;
                android.content.Context r0 = r2.mContext     // Catch: java.lang.Throwable -> L1e
                androidx.emoji2.text.FontRequestEmojiCompatConfig r0 = androidx.emoji2.text.DefaultEmojiCompatConfig.create(r0)     // Catch: java.lang.Throwable -> L1e
                if (r0 == 0) goto L16
                r0.setLoadingExecutor(r4)     // Catch: java.lang.Throwable -> L1e
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r0.mMetadataLoader     // Catch: java.lang.Throwable -> L1e
                androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$1 r1 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$1     // Catch: java.lang.Throwable -> L1e
                r1.<init>(r3, r4)     // Catch: java.lang.Throwable -> L1e
                r0.load(r1)     // Catch: java.lang.Throwable -> L1e
                goto L25
            L16:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L1e
                java.lang.String r1 = "EmojiCompat font provider not available on this device."
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e
                throw r0     // Catch: java.lang.Throwable -> L1e
            L1e:
                r0 = move-exception
                r3.onFailed(r0)
                r4.shutdown()
            L25:
                return
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        public void load(@androidx.annotation.NonNull androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r3) {
                r2 = this;
                java.lang.String r0 = "EmojiCompatInitializer"
                java.util.concurrent.ThreadPoolExecutor r0 = androidx.emoji2.text.ConcurrencyHelpers.createBackgroundPriorityExecutor(r0)
                androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0 r1 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultLoader$$ExternalSyntheticLambda0
                r1.<init>(r2, r3, r0)
                r0.execute(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class LoadEmojiCompatRunnable implements java.lang.Runnable {
        public LoadEmojiCompatRunnable() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r1 = this;
                java.lang.String r0 = "EmojiCompat.EmojiCompatInitializer.run"
                androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L16
                boolean r0 = androidx.emoji2.text.EmojiCompat.isConfigured()     // Catch: java.lang.Throwable -> L16
                if (r0 == 0) goto L12
                androidx.emoji2.text.EmojiCompat r0 = androidx.emoji2.text.EmojiCompat.get()     // Catch: java.lang.Throwable -> L16
                r0.load()     // Catch: java.lang.Throwable -> L16
            L12:
                androidx.core.os.TraceCompat.endSection()
                return
            L16:
                r0 = move-exception
                androidx.core.os.TraceCompat.endSection()
                throw r0
        }
    }

    public EmojiCompatInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @androidx.annotation.NonNull
    public java.lang.Boolean create(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultConfig r0 = new androidx.emoji2.text.EmojiCompatInitializer$BackgroundDefaultConfig
            r0.<init>(r2)
            androidx.emoji2.text.EmojiCompat.init(r0)
            androidx.startup.AppInitializer r2 = androidx.startup.AppInitializer.getInstance(r2)
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.lang.Object r2 = r2.initializeComponent(r0)
            androidx.lifecycle.LifecycleOwner r2 = (androidx.lifecycle.LifecycleOwner) r2
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            androidx.emoji2.text.EmojiCompatInitializer$1 r0 = new androidx.emoji2.text.EmojiCompatInitializer$1
            r0.<init>(r1, r2)
            r2.addObserver(r0)
            java.lang.Boolean r2 = java.lang.Boolean.TRUE
            return r2
    }

    @Override // androidx.startup.Initializer
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.lang.Boolean create(@androidx.annotation.NonNull android.content.Context r1) {
            r0 = this;
            java.lang.Boolean r1 = r0.create(r1)
            return r1
    }

    @Override // androidx.startup.Initializer
    @androidx.annotation.NonNull
    public java.util.List<java.lang.Class<? extends androidx.startup.Initializer<?>>> dependencies() {
            r1 = this;
            java.lang.Class<androidx.lifecycle.ProcessLifecycleInitializer> r0 = androidx.lifecycle.ProcessLifecycleInitializer.class
            java.util.List r0 = java.util.Collections.singletonList(r0)
            return r0
    }
}
