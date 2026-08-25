package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
class PlaceholderDrawingSurfaceTextureListener implements android.view.TextureView.SurfaceTextureListener {
    private final pl.droidsonroids.gif.GifTextureView.PlaceholderDrawListener mDrawer;

    public PlaceholderDrawingSurfaceTextureListener(pl.droidsonroids.gif.GifTextureView.PlaceholderDrawListener r1) {
            r0 = this;
            r0.<init>()
            r0.mDrawer = r1
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            android.view.Surface r2 = new android.view.Surface
            r2.<init>(r1)
            r1 = 0
            android.graphics.Canvas r1 = r2.lockCanvas(r1)
            pl.droidsonroids.gif.GifTextureView$PlaceholderDrawListener r3 = r0.mDrawer
            r3.onDrawPlaceholder(r1)
            r2.unlockCanvasAndPost(r1)
            r2.release()
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture r1, int r2, int r3) {
            r0 = this;
            return
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture r1) {
            r0 = this;
            return
    }
}
