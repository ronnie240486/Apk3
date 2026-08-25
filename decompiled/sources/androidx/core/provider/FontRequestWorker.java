package androidx.core.provider;

/* JADX INFO: loaded from: classes.dex */
class FontRequestWorker {
    private static final java.util.concurrent.ExecutorService DEFAULT_EXECUTOR_SERVICE = null;
    public static final java.lang.Object LOCK = null;

    @androidx.annotation.GuardedBy("LOCK")
    public static final androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker.TypefaceResult>>> PENDING_REPLIES = null;
    public static final androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> sTypefaceCache = null;





    public static final class TypefaceResult {
        public final int mResult;
        public final android.graphics.Typeface mTypeface;

        public TypefaceResult(int r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.mTypeface = r0
                r1.mResult = r2
                return
        }

        @android.annotation.SuppressLint({"WrongConstant"})
        public TypefaceResult(@androidx.annotation.NonNull android.graphics.Typeface r1) {
                r0 = this;
                r0.<init>()
                r0.mTypeface = r1
                r1 = 0
                r0.mResult = r1
                return
        }
    }

    static {
            androidx.collection.LruCache r0 = new androidx.collection.LruCache
            r1 = 16
            r0.<init>(r1)
            androidx.core.provider.FontRequestWorker.sTypefaceCache = r0
            androidx.core.provider.RequestExecutor$DefaultThreadFactory r9 = new androidx.core.provider.RequestExecutor$DefaultThreadFactory
            r9.<init>()
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r1 = 10000(0x2710, float:1.4013E-41)
            long r5 = (long) r1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            r3 = 0
            r4 = 1
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r1 = 1
            r0.allowCoreThreadTimeOut(r1)
            androidx.core.provider.FontRequestWorker.DEFAULT_EXECUTOR_SERVICE = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            androidx.core.provider.FontRequestWorker.LOCK = r0
            androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
            r0.<init>()
            androidx.core.provider.FontRequestWorker.PENDING_REPLIES = r0
            return
    }

    private FontRequestWorker() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String createCacheId(@androidx.annotation.NonNull androidx.core.provider.FontRequest r1, int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getId()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    @android.annotation.SuppressLint({"WrongConstant"})
    private static int getFontFamilyResultStatus(@androidx.annotation.NonNull androidx.core.provider.FontsContractCompat.FontFamilyResult r5) {
            int r0 = r5.getStatusCode()
            r1 = -3
            r2 = 1
            if (r0 == 0) goto L11
            int r5 = r5.getStatusCode()
            if (r5 == r2) goto Lf
            return r1
        Lf:
            r5 = -2
            return r5
        L11:
            androidx.core.provider.FontsContractCompat$FontInfo[] r5 = r5.getFonts()
            if (r5 == 0) goto L30
            int r0 = r5.length
            if (r0 != 0) goto L1b
            goto L30
        L1b:
            int r0 = r5.length
            r2 = 0
            r3 = 0
        L1e:
            if (r3 >= r0) goto L30
            r4 = r5[r3]
            int r4 = r4.getResultCode()
            if (r4 == 0) goto L2d
            if (r4 >= 0) goto L2b
            goto L2c
        L2b:
            r1 = r4
        L2c:
            return r1
        L2d:
            int r3 = r3 + 1
            goto L1e
        L30:
            return r2
    }

    @androidx.annotation.NonNull
    public static androidx.core.provider.FontRequestWorker.TypefaceResult getFontSync(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull androidx.core.provider.FontRequest r5, int r6) {
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r0 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            java.lang.Object r1 = r0.get(r3)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r3.<init>(r1)
            return r3
        L10:
            r1 = 0
            androidx.core.provider.FontsContractCompat$FontFamilyResult r5 = androidx.core.provider.FontProvider.getFontFamilyResult(r4, r5, r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3b
            int r2 = getFontFamilyResultStatus(r5)
            if (r2 == 0) goto L21
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r3.<init>(r2)
            return r3
        L21:
            androidx.core.provider.FontsContractCompat$FontInfo[] r5 = r5.getFonts()
            android.graphics.Typeface r4 = androidx.core.graphics.TypefaceCompat.createFromFontInfo(r4, r1, r5, r6)
            if (r4 == 0) goto L34
            r0.put(r3, r4)
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r3.<init>(r4)
            return r3
        L34:
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r4 = -3
            r3.<init>(r4)
            return r3
        L3b:
            androidx.core.provider.FontRequestWorker$TypefaceResult r3 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r4 = -1
            r3.<init>(r4)
            return r3
    }

    public static android.graphics.Typeface requestFontAsync(@androidx.annotation.NonNull android.content.Context r5, @androidx.annotation.NonNull androidx.core.provider.FontRequest r6, int r7, @androidx.annotation.Nullable java.util.concurrent.Executor r8, @androidx.annotation.NonNull androidx.core.provider.CallbackWithHandler r9) {
            java.lang.String r0 = createCacheId(r6, r7)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L17
            androidx.core.provider.FontRequestWorker$TypefaceResult r5 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r5.<init>(r1)
            r9.onTypefaceResult(r5)
            return r1
        L17:
            androidx.core.provider.FontRequestWorker$2 r1 = new androidx.core.provider.FontRequestWorker$2
            r1.<init>(r9)
            java.lang.Object r9 = androidx.core.provider.FontRequestWorker.LOCK
            monitor-enter(r9)
            androidx.collection.SimpleArrayMap<java.lang.String, java.util.ArrayList<androidx.core.util.Consumer<androidx.core.provider.FontRequestWorker$TypefaceResult>>> r2 = androidx.core.provider.FontRequestWorker.PENDING_REPLIES     // Catch: java.lang.Throwable -> L56
            java.lang.Object r3 = r2.get(r0)     // Catch: java.lang.Throwable -> L56
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Throwable -> L56
            r4 = 0
            if (r3 == 0) goto L2f
            r3.add(r1)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L56
            return r4
        L2f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L56
            r3.<init>()     // Catch: java.lang.Throwable -> L56
            r3.add(r1)     // Catch: java.lang.Throwable -> L56
            r2.put(r0, r3)     // Catch: java.lang.Throwable -> L56
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L56
            androidx.core.provider.FontRequestWorker$3 r9 = new androidx.core.provider.FontRequestWorker$3
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L44
            java.util.concurrent.ExecutorService r8 = androidx.core.provider.FontRequestWorker.DEFAULT_EXECUTOR_SERVICE
        L44:
            androidx.core.provider.FontRequestWorker$4 r5 = new androidx.core.provider.FontRequestWorker$4
            r5.<init>(r0)
            android.os.Handler r6 = androidx.core.provider.CalleeHandler.create()
            androidx.core.provider.RequestExecutor$ReplyRunnable r7 = new androidx.core.provider.RequestExecutor$ReplyRunnable
            r7.<init>(r6, r9, r5)
            r8.execute(r7)
            return r4
        L56:
            r5 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L56
            throw r5
    }

    public static android.graphics.Typeface requestFontSync(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull androidx.core.provider.FontRequest r3, @androidx.annotation.NonNull androidx.core.provider.CallbackWithHandler r4, int r5, int r6) {
            java.lang.String r0 = createCacheId(r3, r5)
            androidx.collection.LruCache<java.lang.String, android.graphics.Typeface> r1 = androidx.core.provider.FontRequestWorker.sTypefaceCache
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L17
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r2.<init>(r1)
            r4.onTypefaceResult(r2)
            return r1
        L17:
            r1 = -1
            if (r6 != r1) goto L24
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = getFontSync(r0, r2, r3, r5)
            r4.onTypefaceResult(r2)
            android.graphics.Typeface r2 = r2.mTypeface
            return r2
        L24:
            androidx.core.provider.FontRequestWorker$1 r1 = new androidx.core.provider.FontRequestWorker$1
            r1.<init>(r0, r2, r3, r5)
            java.util.concurrent.ExecutorService r2 = androidx.core.provider.FontRequestWorker.DEFAULT_EXECUTOR_SERVICE     // Catch: java.lang.InterruptedException -> L50
            java.util.concurrent.Future r2 = r2.submit(r1)     // Catch: java.lang.InterruptedException -> L50
            long r5 = (long) r6
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L3e java.lang.InterruptedException -> L47 java.util.concurrent.ExecutionException -> L49
            java.lang.Object r2 = r2.get(r5, r3)     // Catch: java.util.concurrent.TimeoutException -> L3e java.lang.InterruptedException -> L47 java.util.concurrent.ExecutionException -> L49
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = (androidx.core.provider.FontRequestWorker.TypefaceResult) r2     // Catch: java.lang.InterruptedException -> L50
            r4.onTypefaceResult(r2)     // Catch: java.lang.InterruptedException -> L50
            android.graphics.Typeface r2 = r2.mTypeface     // Catch: java.lang.InterruptedException -> L50
            return r2
        L3e:
            java.lang.InterruptedException r2 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> L50
            java.lang.String r3 = "timeout"
            r2.<init>(r3)     // Catch: java.lang.InterruptedException -> L50
            throw r2     // Catch: java.lang.InterruptedException -> L50
        L47:
            r2 = move-exception
            throw r2     // Catch: java.lang.InterruptedException -> L50
        L49:
            r2 = move-exception
            java.lang.RuntimeException r3 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> L50
            r3.<init>(r2)     // Catch: java.lang.InterruptedException -> L50
            throw r3     // Catch: java.lang.InterruptedException -> L50
        L50:
            androidx.core.provider.FontRequestWorker$TypefaceResult r2 = new androidx.core.provider.FontRequestWorker$TypefaceResult
            r3 = -3
            r2.<init>(r3)
            r4.onTypefaceResult(r2)
            r2 = 0
            return r2
    }
}
