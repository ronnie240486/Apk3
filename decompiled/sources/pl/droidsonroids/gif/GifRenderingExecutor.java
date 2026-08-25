package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
final class GifRenderingExecutor extends java.util.concurrent.ScheduledThreadPoolExecutor {
    public static final /* synthetic */ int $r8$clinit = 0;

    /* JADX INFO: renamed from: pl.droidsonroids.gif.GifRenderingExecutor$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes3.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static final class InstanceHolder {
        private static final pl.droidsonroids.gif.GifRenderingExecutor INSTANCE = null;

        static {
                pl.droidsonroids.gif.GifRenderingExecutor r0 = new pl.droidsonroids.gif.GifRenderingExecutor
                r1 = 0
                r0.<init>(r1)
                pl.droidsonroids.gif.GifRenderingExecutor.InstanceHolder.INSTANCE = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ pl.droidsonroids.gif.GifRenderingExecutor access$100() {
                pl.droidsonroids.gif.GifRenderingExecutor r0 = pl.droidsonroids.gif.GifRenderingExecutor.InstanceHolder.INSTANCE
                return r0
        }
    }

    private GifRenderingExecutor() {
            r2 = this;
            java.util.concurrent.ThreadPoolExecutor$DiscardPolicy r0 = new java.util.concurrent.ThreadPoolExecutor$DiscardPolicy
            r0.<init>()
            r1 = 1
            r2.<init>(r1, r0)
            return
    }

    public /* synthetic */ GifRenderingExecutor(pl.droidsonroids.gif.GifRenderingExecutor.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }
}
