package eightbitlab.com.blurview;

/* JADX INFO: loaded from: classes3.dex */
public final class RenderScriptBlur implements eightbitlab.com.blurview.BlurAlgorithm {
    private final android.renderscript.ScriptIntrinsicBlur blurScript;
    private int lastBitmapHeight;
    private int lastBitmapWidth;
    private android.renderscript.Allocation outAllocation;
    private final android.renderscript.RenderScript renderScript;

    @androidx.annotation.RequiresApi(api = 17)
    public RenderScriptBlur(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.lastBitmapWidth = r0
            r1.lastBitmapHeight = r0
            android.renderscript.RenderScript r2 = android.renderscript.RenderScript.create(r2)
            r1.renderScript = r2
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r2)
            android.renderscript.ScriptIntrinsicBlur r2 = android.renderscript.ScriptIntrinsicBlur.create(r2, r0)
            r1.blurScript = r2
            return
    }

    private boolean canReuseAllocation(android.graphics.Bitmap r3) {
            r2 = this;
            int r0 = r3.getHeight()
            int r1 = r2.lastBitmapHeight
            if (r0 != r1) goto L12
            int r3 = r3.getWidth()
            int r0 = r2.lastBitmapWidth
            if (r3 != r0) goto L12
            r3 = 1
            goto L13
        L12:
            r3 = 0
        L13:
            return r3
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    @androidx.annotation.RequiresApi(api = 17)
    public final android.graphics.Bitmap blur(android.graphics.Bitmap r4, float r5) {
            r3 = this;
            android.renderscript.RenderScript r0 = r3.renderScript
            android.renderscript.Allocation r0 = android.renderscript.Allocation.createFromBitmap(r0, r4)
            boolean r1 = r3.canReuseAllocation(r4)
            if (r1 != 0) goto L2b
            android.renderscript.Allocation r1 = r3.outAllocation
            if (r1 == 0) goto L13
            r1.destroy()
        L13:
            android.renderscript.RenderScript r1 = r3.renderScript
            android.renderscript.Type r2 = r0.getType()
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createTyped(r1, r2)
            r3.outAllocation = r1
            int r1 = r4.getWidth()
            r3.lastBitmapWidth = r1
            int r1 = r4.getHeight()
            r3.lastBitmapHeight = r1
        L2b:
            android.renderscript.ScriptIntrinsicBlur r1 = r3.blurScript
            r1.setRadius(r5)
            android.renderscript.ScriptIntrinsicBlur r5 = r3.blurScript
            r5.setInput(r0)
            android.renderscript.ScriptIntrinsicBlur r5 = r3.blurScript
            android.renderscript.Allocation r1 = r3.outAllocation
            r5.forEach(r1)
            android.renderscript.Allocation r5 = r3.outAllocation
            r5.copyTo(r4)
            r0.destroy()
            return r4
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public boolean canModifyBitmap() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    public final void destroy() {
            r1 = this;
            android.renderscript.ScriptIntrinsicBlur r0 = r1.blurScript
            r0.destroy()
            android.renderscript.RenderScript r0 = r1.renderScript
            r0.destroy()
            android.renderscript.Allocation r0 = r1.outAllocation
            if (r0 == 0) goto L11
            r0.destroy()
        L11:
            return
    }

    @Override // eightbitlab.com.blurview.BlurAlgorithm
    @androidx.annotation.NonNull
    public android.graphics.Bitmap.Config getSupportedBitmapConfig() {
            r1 = this;
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.ARGB_8888
            return r0
    }
}
