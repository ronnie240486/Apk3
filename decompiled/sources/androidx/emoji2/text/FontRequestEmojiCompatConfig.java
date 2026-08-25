package androidx.emoji2.text;

/* JADX INFO: loaded from: classes3.dex */
public class FontRequestEmojiCompatConfig extends androidx.emoji2.text.EmojiCompat.Config {
    private static final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper DEFAULT_FONTS_CONTRACT = null;

    /* JADX INFO: loaded from: classes2.dex */
    public static class ExponentialBackoffRetryPolicy extends androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy {
        private long mRetryOrigin;
        private final long mTotalMs;

        public ExponentialBackoffRetryPolicy(long r1) {
                r0 = this;
                r0.<init>()
                r0.mTotalMs = r1
                return
        }

        @Override // androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy
        public long getRetryDelay() {
                r6 = this;
                long r0 = r6.mRetryOrigin
                r2 = 0
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 != 0) goto Lf
                long r0 = android.os.SystemClock.uptimeMillis()
                r6.mRetryOrigin = r0
                return r2
            Lf:
                long r0 = android.os.SystemClock.uptimeMillis()
                long r2 = r6.mRetryOrigin
                long r0 = r0 - r2
                long r2 = r6.mTotalMs
                int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r4 <= 0) goto L1f
                r0 = -1
                return r0
            L1f:
                r2 = 1000(0x3e8, double:4.94E-321)
                long r2 = java.lang.Math.max(r0, r2)
                long r4 = r6.mTotalMs
                long r4 = r4 - r0
                long r0 = java.lang.Math.min(r2, r4)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class FontProviderHelper {
        public FontProviderHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public android.graphics.Typeface buildTypeface(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontInfo r4) throws android.content.pm.PackageManager.NameNotFoundException {
                r2 = this;
                r0 = 1
                androidx.core.provider.FontsContractCompat$FontInfo[] r0 = new androidx.core.provider.FontsContractCompat.FontInfo[r0]
                r1 = 0
                r0[r1] = r4
                r4 = 0
                android.graphics.Typeface r3 = androidx.core.provider.FontsContractCompat.buildTypeface(r3, r4, r0)
                return r3
        }

        @androidx.annotation.NonNull
        public androidx.core.provider.FontsContractCompat.FontFamilyResult fetchFonts(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.core.provider.FontRequest r3) throws android.content.pm.PackageManager.NameNotFoundException {
                r1 = this;
                r0 = 0
                androidx.core.provider.FontsContractCompat$FontFamilyResult r2 = androidx.core.provider.FontsContractCompat.fetchFonts(r2, r0, r3)
                return r2
        }

        public void registerObserver(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull android.net.Uri r3, @androidx.annotation.NonNull android.database.ContentObserver r4) {
                r1 = this;
                android.content.ContentResolver r2 = r2.getContentResolver()
                r0 = 0
                r2.registerContentObserver(r3, r0, r4)
                return
        }

        public void unregisterObserver(@androidx.annotation.NonNull android.content.Context r1, @androidx.annotation.NonNull android.database.ContentObserver r2) {
                r0 = this;
                android.content.ContentResolver r1 = r1.getContentResolver()
                r1.unregisterContentObserver(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class FontRequestMetadataLoader implements androidx.emoji2.text.EmojiCompat.MetadataRepoLoader {
        private static final java.lang.String S_TRACE_BUILD_TYPEFACE = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface";

        @androidx.annotation.Nullable
        @androidx.annotation.GuardedBy("mLock")
        public androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback mCallback;

        @androidx.annotation.NonNull
        private final android.content.Context mContext;

        @androidx.annotation.Nullable
        @androidx.annotation.GuardedBy("mLock")
        private java.util.concurrent.Executor mExecutor;

        @androidx.annotation.NonNull
        private final androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper mFontProviderHelper;

        @androidx.annotation.NonNull
        private final java.lang.Object mLock;

        @androidx.annotation.Nullable
        @androidx.annotation.GuardedBy("mLock")
        private android.os.Handler mMainHandler;

        @androidx.annotation.Nullable
        @androidx.annotation.GuardedBy("mLock")
        private java.lang.Runnable mMainHandlerLoadCallback;

        @androidx.annotation.Nullable
        @androidx.annotation.GuardedBy("mLock")
        private java.util.concurrent.ThreadPoolExecutor mMyThreadPoolExecutor;

        @androidx.annotation.Nullable
        @androidx.annotation.GuardedBy("mLock")
        private android.database.ContentObserver mObserver;

        @androidx.annotation.NonNull
        private final androidx.core.provider.FontRequest mRequest;

        @androidx.annotation.Nullable
        @androidx.annotation.GuardedBy("mLock")
        private androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy mRetryPolicy;


        public FontRequestMetadataLoader(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.core.provider.FontRequest r3, @androidx.annotation.NonNull androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper r4) {
                r1 = this;
                r1.<init>()
                java.lang.Object r0 = new java.lang.Object
                r0.<init>()
                r1.mLock = r0
                java.lang.String r0 = "Context cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.lang.String r0 = "FontRequest cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r3, r0)
                android.content.Context r2 = r2.getApplicationContext()
                r1.mContext = r2
                r1.mRequest = r3
                r1.mFontProviderHelper = r4
                return
        }

        private void cleanUp() {
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
                r1 = 0
                r5.mCallback = r1     // Catch: java.lang.Throwable -> L2b
                android.database.ContentObserver r2 = r5.mObserver     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto L13
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r3 = r5.mFontProviderHelper     // Catch: java.lang.Throwable -> L2b
                android.content.Context r4 = r5.mContext     // Catch: java.lang.Throwable -> L2b
                r3.unregisterObserver(r4, r2)     // Catch: java.lang.Throwable -> L2b
                r5.mObserver = r1     // Catch: java.lang.Throwable -> L2b
            L13:
                android.os.Handler r2 = r5.mMainHandler     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto L1c
                java.lang.Runnable r3 = r5.mMainHandlerLoadCallback     // Catch: java.lang.Throwable -> L2b
                r2.removeCallbacks(r3)     // Catch: java.lang.Throwable -> L2b
            L1c:
                r5.mMainHandler = r1     // Catch: java.lang.Throwable -> L2b
                java.util.concurrent.ThreadPoolExecutor r2 = r5.mMyThreadPoolExecutor     // Catch: java.lang.Throwable -> L2b
                if (r2 == 0) goto L25
                r2.shutdown()     // Catch: java.lang.Throwable -> L2b
            L25:
                r5.mExecutor = r1     // Catch: java.lang.Throwable -> L2b
                r5.mMyThreadPoolExecutor = r1     // Catch: java.lang.Throwable -> L2b
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                return
            L2b:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2b
                throw r1
        }

        @androidx.annotation.WorkerThread
        private androidx.core.provider.FontsContractCompat.FontInfo retrieveFontInfo() {
                r3 = this;
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r0 = r3.mFontProviderHelper     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
                android.content.Context r1 = r3.mContext     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
                androidx.core.provider.FontRequest r2 = r3.mRequest     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
                androidx.core.provider.FontsContractCompat$FontFamilyResult r0 = r0.fetchFonts(r1, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L41
                int r1 = r0.getStatusCode()
                if (r1 != 0) goto L25
                androidx.core.provider.FontsContractCompat$FontInfo[] r0 = r0.getFonts()
                if (r0 == 0) goto L1d
                int r1 = r0.length
                if (r1 == 0) goto L1d
                r1 = 0
                r0 = r0[r1]
                return r0
            L1d:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.String r1 = "fetchFonts failed (empty result)"
                r0.<init>(r1)
                throw r0
            L25:
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "fetchFonts failed ("
                java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
                int r0 = r0.getStatusCode()
                r2.append(r0)
                java.lang.String r0 = ")"
                r2.append(r0)
                java.lang.String r0 = r2.toString()
                r1.<init>(r0)
                throw r1
            L41:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "provider not found"
                r1.<init>(r2, r0)
                throw r1
        }

        @androidx.annotation.RequiresApi(19)
        @androidx.annotation.WorkerThread
        private void scheduleRetry(android.net.Uri r6, long r7) {
                r5 = this;
                java.lang.Object r0 = r5.mLock
                monitor-enter(r0)
                android.os.Handler r1 = r5.mMainHandler     // Catch: java.lang.Throwable -> L32
                if (r1 != 0) goto Ld
                android.os.Handler r1 = androidx.emoji2.text.ConcurrencyHelpers.mainHandlerAsync()     // Catch: java.lang.Throwable -> L32
                r5.mMainHandler = r1     // Catch: java.lang.Throwable -> L32
            Ld:
                android.database.ContentObserver r2 = r5.mObserver     // Catch: java.lang.Throwable -> L32
                if (r2 != 0) goto L1f
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1 r2 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$1     // Catch: java.lang.Throwable -> L32
                r2.<init>(r5, r1)     // Catch: java.lang.Throwable -> L32
                r5.mObserver = r2     // Catch: java.lang.Throwable -> L32
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r3 = r5.mFontProviderHelper     // Catch: java.lang.Throwable -> L32
                android.content.Context r4 = r5.mContext     // Catch: java.lang.Throwable -> L32
                r3.registerObserver(r4, r6, r2)     // Catch: java.lang.Throwable -> L32
            L1f:
                java.lang.Runnable r6 = r5.mMainHandlerLoadCallback     // Catch: java.lang.Throwable -> L32
                if (r6 != 0) goto L2b
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0 r6 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L32
                r2 = 1
                r6.<init>(r5, r2)     // Catch: java.lang.Throwable -> L32
                r5.mMainHandlerLoadCallback = r6     // Catch: java.lang.Throwable -> L32
            L2b:
                java.lang.Runnable r6 = r5.mMainHandlerLoadCallback     // Catch: java.lang.Throwable -> L32
                r1.postDelayed(r6, r7)     // Catch: java.lang.Throwable -> L32
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
                return
            L32:
                r6 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L32
                throw r6
        }

        @androidx.annotation.RequiresApi(19)
        @androidx.annotation.WorkerThread
        public final void createMetadata() {
                r8 = this;
                java.lang.Object r0 = r8.mLock
                monitor-enter(r0)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r1 = r8.mCallback     // Catch: java.lang.Throwable -> La7
                if (r1 != 0) goto L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
                return
            L9:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
                androidx.core.provider.FontsContractCompat$FontInfo r0 = r8.retrieveFontInfo()     // Catch: java.lang.Throwable -> L94
                int r1 = r0.getResultCode()     // Catch: java.lang.Throwable -> L94
                r2 = 2
                if (r1 != r2) goto L34
                java.lang.Object r2 = r8.mLock     // Catch: java.lang.Throwable -> L94
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L94
                androidx.emoji2.text.FontRequestEmojiCompatConfig$RetryPolicy r3 = r8.mRetryPolicy     // Catch: java.lang.Throwable -> L31
                if (r3 == 0) goto L2f
                long r3 = r3.getRetryDelay()     // Catch: java.lang.Throwable -> L31
                r5 = 0
                int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r7 < 0) goto L2f
                android.net.Uri r0 = r0.getUri()     // Catch: java.lang.Throwable -> L31
                r8.scheduleRetry(r0, r3)     // Catch: java.lang.Throwable -> L31
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
                return
            L2f:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
                goto L34
            L31:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
                throw r0     // Catch: java.lang.Throwable -> L94
            L34:
                if (r1 != 0) goto L78
                java.lang.String r1 = "EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface"
                androidx.core.os.TraceCompat.beginSection(r1)     // Catch: java.lang.Throwable -> L73
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r1 = r8.mFontProviderHelper     // Catch: java.lang.Throwable -> L73
                android.content.Context r2 = r8.mContext     // Catch: java.lang.Throwable -> L73
                android.graphics.Typeface r1 = r1.buildTypeface(r2, r0)     // Catch: java.lang.Throwable -> L73
                android.content.Context r2 = r8.mContext     // Catch: java.lang.Throwable -> L73
                r3 = 0
                android.net.Uri r0 = r0.getUri()     // Catch: java.lang.Throwable -> L73
                java.nio.ByteBuffer r0 = androidx.core.graphics.TypefaceCompatUtil.mmap(r2, r3, r0)     // Catch: java.lang.Throwable -> L73
                if (r0 == 0) goto L6b
                if (r1 == 0) goto L6b
                androidx.emoji2.text.MetadataRepo r0 = androidx.emoji2.text.MetadataRepo.create(r1, r0)     // Catch: java.lang.Throwable -> L73
                androidx.core.os.TraceCompat.endSection()     // Catch: java.lang.Throwable -> L94
                java.lang.Object r1 = r8.mLock     // Catch: java.lang.Throwable -> L94
                monitor-enter(r1)     // Catch: java.lang.Throwable -> L94
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r2 = r8.mCallback     // Catch: java.lang.Throwable -> L68
                if (r2 == 0) goto L63
                r2.onLoaded(r0)     // Catch: java.lang.Throwable -> L68
            L63:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
                r8.cleanUp()     // Catch: java.lang.Throwable -> L94
                goto La3
            L68:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
                throw r0     // Catch: java.lang.Throwable -> L94
            L6b:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L73
                java.lang.String r1 = "Unable to open file."
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L73
                throw r0     // Catch: java.lang.Throwable -> L73
            L73:
                r0 = move-exception
                androidx.core.os.TraceCompat.endSection()     // Catch: java.lang.Throwable -> L94
                throw r0     // Catch: java.lang.Throwable -> L94
            L78:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L94
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
                r2.<init>()     // Catch: java.lang.Throwable -> L94
                java.lang.String r3 = "fetchFonts result is not OK. ("
                r2.append(r3)     // Catch: java.lang.Throwable -> L94
                r2.append(r1)     // Catch: java.lang.Throwable -> L94
                java.lang.String r1 = ")"
                r2.append(r1)     // Catch: java.lang.Throwable -> L94
                java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L94
                r0.<init>(r1)     // Catch: java.lang.Throwable -> L94
                throw r0     // Catch: java.lang.Throwable -> L94
            L94:
                r0 = move-exception
                java.lang.Object r1 = r8.mLock
                monitor-enter(r1)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r2 = r8.mCallback     // Catch: java.lang.Throwable -> La4
                if (r2 == 0) goto L9f
                r2.onFailed(r0)     // Catch: java.lang.Throwable -> La4
            L9f:
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
                r8.cleanUp()
            La3:
                return
            La4:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> La4
                throw r0
            La7:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> La7
                throw r1
        }

        @Override // androidx.emoji2.text.EmojiCompat.MetadataRepoLoader
        @androidx.annotation.RequiresApi(19)
        public void load(@androidx.annotation.NonNull androidx.emoji2.text.EmojiCompat.MetadataRepoLoaderCallback r2) {
                r1 = this;
                java.lang.String r0 = "LoaderCallback cannot be null"
                androidx.core.util.Preconditions.checkNotNull(r2, r0)
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                r1.mCallback = r2     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                r1.loadInternal()
                return
            Lf:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
                throw r2
        }

        @androidx.annotation.RequiresApi(19)
        public final void loadInternal() {
                r4 = this;
                java.lang.Object r0 = r4.mLock
                monitor-enter(r0)
                androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback r1 = r4.mCallback     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L9
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                return
            L9:
                java.util.concurrent.Executor r1 = r4.mExecutor     // Catch: java.lang.Throwable -> L24
                if (r1 != 0) goto L17
                java.lang.String r1 = "emojiCompat"
                java.util.concurrent.ThreadPoolExecutor r1 = androidx.emoji2.text.ConcurrencyHelpers.createBackgroundPriorityExecutor(r1)     // Catch: java.lang.Throwable -> L24
                r4.mMyThreadPoolExecutor = r1     // Catch: java.lang.Throwable -> L24
                r4.mExecutor = r1     // Catch: java.lang.Throwable -> L24
            L17:
                java.util.concurrent.Executor r1 = r4.mExecutor     // Catch: java.lang.Throwable -> L24
                androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0 r2 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L24
                r3 = 0
                r2.<init>(r4, r3)     // Catch: java.lang.Throwable -> L24
                r1.execute(r2)     // Catch: java.lang.Throwable -> L24
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                return
            L24:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
                throw r1
        }

        public void setExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r2) {
                r1 = this;
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                r1.mExecutor = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }

        public void setRetryPolicy(@androidx.annotation.Nullable androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy r2) {
                r1 = this;
                java.lang.Object r0 = r1.mLock
                monitor-enter(r0)
                r1.mRetryPolicy = r2     // Catch: java.lang.Throwable -> L7
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r2 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L7
                throw r2
        }
    }

    public static abstract class RetryPolicy {
        public RetryPolicy() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract long getRetryDelay();
    }

    static {
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper
            r0.<init>()
            androidx.emoji2.text.FontRequestEmojiCompatConfig.DEFAULT_FONTS_CONTRACT = r0
            return
    }

    public FontRequestEmojiCompatConfig(@androidx.annotation.NonNull android.content.Context r3, @androidx.annotation.NonNull androidx.core.provider.FontRequest r4) {
            r2 = this;
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontProviderHelper r1 = androidx.emoji2.text.FontRequestEmojiCompatConfig.DEFAULT_FONTS_CONTRACT
            r0.<init>(r3, r4, r1)
            r2.<init>(r0)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public FontRequestEmojiCompatConfig(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.core.provider.FontRequest r3, @androidx.annotation.NonNull androidx.emoji2.text.FontRequestEmojiCompatConfig.FontProviderHelper r4) {
            r1 = this;
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader
            r0.<init>(r2, r3, r4)
            r1.<init>(r0)
            return
    }

    @androidx.annotation.NonNull
    @java.lang.Deprecated
    public androidx.emoji2.text.FontRequestEmojiCompatConfig setHandler(@androidx.annotation.Nullable android.os.Handler r2) {
            r1 = this;
            if (r2 != 0) goto L3
            return r1
        L3:
            androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0 r0 = new androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0
            r0.<init>(r2)
            r1.setLoadingExecutor(r0)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.emoji2.text.FontRequestEmojiCompatConfig setLoadingExecutor(@androidx.annotation.NonNull java.util.concurrent.Executor r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r1.mMetadataLoader
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = (androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) r0
            r0.setExecutor(r2)
            return r1
    }

    @androidx.annotation.NonNull
    public androidx.emoji2.text.FontRequestEmojiCompatConfig setRetryPolicy(@androidx.annotation.Nullable androidx.emoji2.text.FontRequestEmojiCompatConfig.RetryPolicy r2) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$MetadataRepoLoader r0 = r1.mMetadataLoader
            androidx.emoji2.text.FontRequestEmojiCompatConfig$FontRequestMetadataLoader r0 = (androidx.emoji2.text.FontRequestEmojiCompatConfig.FontRequestMetadataLoader) r0
            r0.setRetryPolicy(r2)
            return r1
    }
}
