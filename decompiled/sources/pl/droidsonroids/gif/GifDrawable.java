package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
public class GifDrawable extends android.graphics.drawable.Drawable implements android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl {
    public final android.graphics.Bitmap mBuffer;
    private final android.graphics.Rect mDstRect;
    public final java.util.concurrent.ScheduledThreadPoolExecutor mExecutor;
    public final pl.droidsonroids.gif.InvalidationHandler mInvalidationHandler;
    public final boolean mIsRenderingTriggeredOnDraw;
    public volatile boolean mIsRunning;
    public final java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.AnimationListener> mListeners;
    public final pl.droidsonroids.gif.GifInfoHandle mNativeInfoHandle;
    public long mNextFrameRenderTime;
    public final android.graphics.Paint mPaint;
    private final pl.droidsonroids.gif.RenderTask mRenderTask;
    public java.util.concurrent.ScheduledFuture<?> mRenderTaskSchedule;
    private int mScaledHeight;
    private int mScaledWidth;
    private final android.graphics.Rect mSrcRect;
    private android.content.res.ColorStateList mTint;
    private android.graphics.PorterDuffColorFilter mTintFilter;
    private android.graphics.PorterDuff.Mode mTintMode;
    private pl.droidsonroids.gif.transforms.Transform mTransform;




    public GifDrawable(@androidx.annotation.Nullable android.content.ContentResolver r2, @androidx.annotation.NonNull android.net.Uri r3) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r2 = pl.droidsonroids.gif.GifInfoHandle.openUri(r2, r3)
            r3 = 0
            r0 = 1
            r1.<init>(r2, r3, r3, r0)
            return
    }

    public GifDrawable(@androidx.annotation.NonNull android.content.res.AssetFileDescriptor r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    public GifDrawable(@androidx.annotation.NonNull android.content.res.AssetManager r1, @androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
            r0.<init>(r1)
            return
    }

    public GifDrawable(@androidx.annotation.NonNull android.content.res.Resources r3, @androidx.annotation.DrawableRes @androidx.annotation.RawRes int r4) throws android.content.res.Resources.NotFoundException, java.io.IOException {
            r2 = this;
            android.content.res.AssetFileDescriptor r0 = r3.openRawResourceFd(r4)
            r2.<init>(r0)
            java.util.List<java.lang.String> r0 = pl.droidsonroids.gif.GifViewUtils.SUPPORTED_RESOURCE_TYPE_NAMES
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r1 = 1
            r3.getValue(r4, r0, r1)
            int r4 = r0.density
            if (r4 != 0) goto L19
            r4 = 160(0xa0, float:2.24E-43)
            goto L20
        L19:
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r4 == r0) goto L1f
            goto L20
        L1f:
            r4 = 0
        L20:
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            int r3 = r3.densityDpi
            if (r4 <= 0) goto L2e
            if (r3 <= 0) goto L2e
            float r3 = (float) r3
            float r4 = (float) r4
            float r3 = r3 / r4
            goto L30
        L2e:
            r3 = 1065353216(0x3f800000, float:1.0)
        L30:
            pl.droidsonroids.gif.GifInfoHandle r4 = r2.mNativeInfoHandle
            int r4 = r4.getHeight()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r4 = (int) r4
            r2.mScaledHeight = r4
            pl.droidsonroids.gif.GifInfoHandle r4 = r2.mNativeInfoHandle
            int r4 = r4.getWidth()
            float r4 = (float) r4
            float r4 = r4 * r3
            int r3 = (int) r4
            r2.mScaledWidth = r3
            return
    }

    public GifDrawable(@androidx.annotation.NonNull java.io.File r1) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            return
    }

    public GifDrawable(@androidx.annotation.NonNull java.io.FileDescriptor r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    public GifDrawable(@androidx.annotation.NonNull java.io.InputStream r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    public GifDrawable(@androidx.annotation.NonNull java.lang.String r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    public GifDrawable(@androidx.annotation.NonNull java.nio.ByteBuffer r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    public GifDrawable(pl.droidsonroids.gif.GifInfoHandle r6, pl.droidsonroids.gif.GifDrawable r7, java.util.concurrent.ScheduledThreadPoolExecutor r8, boolean r9) {
            r5 = this;
            r5.<init>()
            r0 = 1
            r5.mIsRunning = r0
            r1 = -9223372036854775808
            r5.mNextFrameRenderTime = r1
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r5.mDstRect = r1
            android.graphics.Paint r1 = new android.graphics.Paint
            r2 = 6
            r1.<init>(r2)
            r5.mPaint = r1
            java.util.concurrent.ConcurrentLinkedQueue r1 = new java.util.concurrent.ConcurrentLinkedQueue
            r1.<init>()
            r5.mListeners = r1
            pl.droidsonroids.gif.RenderTask r1 = new pl.droidsonroids.gif.RenderTask
            r1.<init>(r5)
            r5.mRenderTask = r1
            r5.mIsRenderingTriggeredOnDraw = r9
            if (r8 == 0) goto L2c
            goto L32
        L2c:
            int r8 = pl.droidsonroids.gif.GifRenderingExecutor.$r8$clinit
            pl.droidsonroids.gif.GifRenderingExecutor r8 = pl.droidsonroids.gif.GifRenderingExecutor.InstanceHolder.access$100()
        L32:
            r5.mExecutor = r8
            r5.mNativeInfoHandle = r6
            r8 = 0
            r9 = 0
            if (r7 == 0) goto L6b
            pl.droidsonroids.gif.GifInfoHandle r2 = r7.mNativeInfoHandle
            monitor-enter(r2)
            pl.droidsonroids.gif.GifInfoHandle r3 = r7.mNativeInfoHandle     // Catch: java.lang.Throwable -> L68
            boolean r3 = r3.isRecycled()     // Catch: java.lang.Throwable -> L68
            if (r3 != 0) goto L66
            pl.droidsonroids.gif.GifInfoHandle r3 = r7.mNativeInfoHandle     // Catch: java.lang.Throwable -> L68
            int r3 = r3.getHeight()     // Catch: java.lang.Throwable -> L68
            int r4 = r6.getHeight()     // Catch: java.lang.Throwable -> L68
            if (r3 < r4) goto L66
            pl.droidsonroids.gif.GifInfoHandle r3 = r7.mNativeInfoHandle     // Catch: java.lang.Throwable -> L68
            int r3 = r3.getWidth()     // Catch: java.lang.Throwable -> L68
            int r4 = r6.getWidth()     // Catch: java.lang.Throwable -> L68
            if (r3 < r4) goto L66
            r7.shutdown()     // Catch: java.lang.Throwable -> L68
            android.graphics.Bitmap r7 = r7.mBuffer     // Catch: java.lang.Throwable -> L68
            r7.eraseColor(r9)     // Catch: java.lang.Throwable -> L68
            r8 = r7
        L66:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L68
            goto L6b
        L68:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L68
            throw r6
        L6b:
            if (r8 != 0) goto L7e
            int r7 = r6.getWidth()
            int r8 = r6.getHeight()
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r7 = android.graphics.Bitmap.createBitmap(r7, r8, r2)
            r5.mBuffer = r7
            goto L80
        L7e:
            r5.mBuffer = r8
        L80:
            android.graphics.Bitmap r7 = r5.mBuffer
            boolean r8 = r6.isOpaque()
            r8 = r8 ^ r0
            r7.setHasAlpha(r8)
            android.graphics.Rect r7 = new android.graphics.Rect
            int r8 = r6.getWidth()
            int r0 = r6.getHeight()
            r7.<init>(r9, r9, r8, r0)
            r5.mSrcRect = r7
            pl.droidsonroids.gif.InvalidationHandler r7 = new pl.droidsonroids.gif.InvalidationHandler
            r7.<init>(r5)
            r5.mInvalidationHandler = r7
            r1.doWork()
            int r7 = r6.getWidth()
            r5.mScaledWidth = r7
            int r6 = r6.getHeight()
            r5.mScaledHeight = r6
            return
    }

    public GifDrawable(@androidx.annotation.NonNull byte[] r3) throws java.io.IOException {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            r2.<init>(r0, r3, r3, r1)
            return
    }

    private void cancelPendingRenderTask() {
            r2 = this;
            java.util.concurrent.ScheduledFuture<?> r0 = r2.mRenderTaskSchedule
            if (r0 == 0) goto L8
            r1 = 0
            r0.cancel(r1)
        L8:
            pl.droidsonroids.gif.InvalidationHandler r0 = r2.mInvalidationHandler
            r1 = -1
            r0.removeMessages(r1)
            return
    }

    @androidx.annotation.Nullable
    public static pl.droidsonroids.gif.GifDrawable createFromResource(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.DrawableRes @androidx.annotation.RawRes int r2) {
            pl.droidsonroids.gif.GifDrawable r0 = new pl.droidsonroids.gif.GifDrawable     // Catch: java.io.IOException -> L6
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L6
            return r0
        L6:
            r1 = 0
            return r1
    }

    private void scheduleNextRender() {
            r8 = this;
            boolean r0 = r8.mIsRenderingTriggeredOnDraw
            if (r0 == 0) goto L30
            boolean r0 = r8.mIsRunning
            if (r0 == 0) goto L30
            long r0 = r8.mNextFrameRenderTime
            r2 = -9223372036854775808
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L30
            r4 = 0
            long r6 = android.os.SystemClock.uptimeMillis()
            long r0 = r0 - r6
            long r0 = java.lang.Math.max(r4, r0)
            r8.mNextFrameRenderTime = r2
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r8.mExecutor
            pl.droidsonroids.gif.RenderTask r3 = r8.mRenderTask
            r2.remove(r3)
            java.util.concurrent.ScheduledThreadPoolExecutor r2 = r8.mExecutor
            pl.droidsonroids.gif.RenderTask r3 = r8.mRenderTask
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r0 = r2.schedule(r3, r0, r4)
            r8.mRenderTaskSchedule = r0
        L30:
            return
    }

    private void shutdown() {
            r2 = this;
            r0 = 0
            r2.mIsRunning = r0
            pl.droidsonroids.gif.InvalidationHandler r0 = r2.mInvalidationHandler
            r1 = -1
            r0.removeMessages(r1)
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.mNativeInfoHandle
            r0.recycle()
            return
    }

    private android.graphics.PorterDuffColorFilter updateTintFilter(android.content.res.ColorStateList r3, android.graphics.PorterDuff.Mode r4) {
            r2 = this;
            if (r3 == 0) goto L14
            if (r4 != 0) goto L5
            goto L14
        L5:
            int[] r0 = r2.getState()
            r1 = 0
            int r3 = r3.getColorForState(r0, r1)
            android.graphics.PorterDuffColorFilter r0 = new android.graphics.PorterDuffColorFilter
            r0.<init>(r3, r4)
            return r0
        L14:
            r3 = 0
            return r3
    }

    public void addAnimationListener(@androidx.annotation.NonNull pl.droidsonroids.gif.AnimationListener r2) {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.AnimationListener> r0 = r1.mListeners
            r0.add(r2)
            return
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canPause() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekBackward() {
            r2 = this;
            int r0 = r2.getNumberOfFrames()
            r1 = 1
            if (r0 <= r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean canSeekForward() {
            r2 = this;
            int r0 = r2.getNumberOfFrames()
            r1 = 1
            if (r0 <= r1) goto L8
            goto L9
        L8:
            r1 = 0
        L9:
            return r1
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r6) {
            r5 = this;
            android.graphics.PorterDuffColorFilter r0 = r5.mTintFilter
            if (r0 == 0) goto L15
            android.graphics.Paint r0 = r5.mPaint
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            if (r0 != 0) goto L15
            android.graphics.Paint r0 = r5.mPaint
            android.graphics.PorterDuffColorFilter r1 = r5.mTintFilter
            r0.setColorFilter(r1)
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            pl.droidsonroids.gif.transforms.Transform r1 = r5.mTransform
            if (r1 != 0) goto L26
            android.graphics.Bitmap r1 = r5.mBuffer
            android.graphics.Rect r2 = r5.mSrcRect
            android.graphics.Rect r3 = r5.mDstRect
            android.graphics.Paint r4 = r5.mPaint
            r6.drawBitmap(r1, r2, r3, r4)
            goto L2d
        L26:
            android.graphics.Paint r2 = r5.mPaint
            android.graphics.Bitmap r3 = r5.mBuffer
            r1.onDraw(r6, r2, r3)
        L2d:
            if (r0 == 0) goto L35
            android.graphics.Paint r6 = r5.mPaint
            r0 = 0
            r6.setColorFilter(r0)
        L35:
            return
    }

    public long getAllocationByteCount() {
            r4 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r4.mNativeInfoHandle
            long r0 = r0.getAllocationByteCount()
            android.graphics.Bitmap r2 = r4.mBuffer
            int r2 = r2.getAllocationByteCount()
            long r2 = (long) r2
            long r0 = r0 + r2
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            int r0 = r0.getAlpha()
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getAudioSessionId() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getBufferPercentage() {
            r1 = this;
            r0 = 100
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            android.graphics.ColorFilter r0 = r0.getColorFilter()
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getComment() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            java.lang.String r0 = r0.getComment()
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d)
    public float getCornerRadius() {
            r2 = this;
            pl.droidsonroids.gif.transforms.Transform r0 = r2.mTransform
            boolean r1 = r0 instanceof pl.droidsonroids.gif.transforms.CornerRadiusTransform
            if (r1 == 0) goto Ld
            pl.droidsonroids.gif.transforms.CornerRadiusTransform r0 = (pl.droidsonroids.gif.transforms.CornerRadiusTransform) r0
            float r0 = r0.getCornerRadius()
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public android.graphics.Bitmap getCurrentFrame() {
            r3 = this;
            android.graphics.Bitmap r0 = r3.mBuffer
            android.graphics.Bitmap$Config r1 = r0.getConfig()
            android.graphics.Bitmap r2 = r3.mBuffer
            boolean r2 = r2.isMutable()
            android.graphics.Bitmap r0 = r0.copy(r1, r2)
            android.graphics.Bitmap r1 = r3.mBuffer
            boolean r1 = r1.hasAlpha()
            r0.setHasAlpha(r1)
            return r0
    }

    public int getCurrentFrameIndex() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            int r0 = r0.getCurrentFrameIndex()
            return r0
    }

    public int getCurrentLoop() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.mNativeInfoHandle
            int r0 = r0.getCurrentLoop()
            if (r0 == 0) goto L13
            pl.droidsonroids.gif.GifInfoHandle r1 = r2.mNativeInfoHandle
            int r1 = r1.getLoopCount()
            if (r0 >= r1) goto L11
            goto L13
        L11:
            int r0 = r0 + (-1)
        L13:
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getCurrentPosition() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            int r0 = r0.getCurrentPosition()
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public int getDuration() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            int r0 = r0.getDuration()
            return r0
    }

    @androidx.annotation.NonNull
    public pl.droidsonroids.gif.GifError getError() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            int r0 = r0.getNativeErrorCode()
            pl.droidsonroids.gif.GifError r0 = pl.droidsonroids.gif.GifError.fromCode(r0)
            return r0
    }

    public int getFrameByteCount() {
            r2 = this;
            android.graphics.Bitmap r0 = r2.mBuffer
            int r0 = r0.getRowBytes()
            android.graphics.Bitmap r1 = r2.mBuffer
            int r1 = r1.getHeight()
            int r1 = r1 * r0
            return r1
    }

    public int getFrameDuration(@androidx.annotation.IntRange(from = 0) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            int r2 = r0.getFrameDuration(r2)
            return r2
    }

    public long getInputSourceByteCount() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.mNativeInfoHandle
            long r0 = r0.getSourceLength()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
            r1 = this;
            int r0 = r1.mScaledHeight
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
            r1 = this;
            int r0 = r1.mScaledWidth
            return r0
    }

    public int getLoopCount() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            int r0 = r0.getLoopCount()
            return r0
    }

    public long getMetadataAllocationByteCount() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.mNativeInfoHandle
            long r0 = r0.getMetadataByteCount()
            return r0
    }

    public int getNumberOfFrames() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            int r0 = r0.getNumberOfFrames()
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
            r2 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.mNativeInfoHandle
            boolean r0 = r0.isOpaque()
            if (r0 == 0) goto L15
            android.graphics.Paint r0 = r2.mPaint
            int r0 = r0.getAlpha()
            r1 = 255(0xff, float:3.57E-43)
            if (r0 >= r1) goto L13
            goto L15
        L13:
            r0 = -1
            return r0
        L15:
            r0 = -2
            return r0
    }

    @androidx.annotation.NonNull
    public final android.graphics.Paint getPaint() {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            return r0
    }

    public int getPixel(@androidx.annotation.IntRange(from = 0) int r2, @androidx.annotation.IntRange(from = 0) int r3) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            int r0 = r0.getWidth()
            if (r2 >= r0) goto L20
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            int r0 = r0.getHeight()
            if (r3 >= r0) goto L17
            android.graphics.Bitmap r0 = r1.mBuffer
            int r2 = r0.getPixel(r2, r3)
            return r2
        L17:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "y must be < height"
            r2.<init>(r3)
            throw r2
        L20:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "x must be < width"
            r2.<init>(r3)
            throw r2
    }

    public void getPixels(@androidx.annotation.NonNull int[] r9) {
            r8 = this;
            android.graphics.Bitmap r0 = r8.mBuffer
            pl.droidsonroids.gif.GifInfoHandle r1 = r8.mNativeInfoHandle
            int r3 = r1.getWidth()
            pl.droidsonroids.gif.GifInfoHandle r1 = r8.mNativeInfoHandle
            int r6 = r1.getWidth()
            pl.droidsonroids.gif.GifInfoHandle r1 = r8.mNativeInfoHandle
            int r7 = r1.getHeight()
            r2 = 0
            r4 = 0
            r5 = 0
            r1 = r9
            r0.getPixels(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @androidx.annotation.Nullable
    public pl.droidsonroids.gif.transforms.Transform getTransform() {
            r1 = this;
            pl.droidsonroids.gif.transforms.Transform r0 = r1.mTransform
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
            r0 = this;
            super.invalidateSelf()
            r0.scheduleNextRender()
            return
    }

    public boolean isAnimationCompleted() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            boolean r0 = r0.isAnimationCompleted()
            return r0
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public boolean isPlaying() {
            r1 = this;
            boolean r0 = r1.mIsRunning
            return r0
    }

    public boolean isRecycled() {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            boolean r0 = r0.isRecycled()
            return r0
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
            r1 = this;
            boolean r0 = r1.mIsRunning
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
            r1 = this;
            boolean r0 = super.isStateful()
            if (r0 != 0) goto L13
            android.content.res.ColorStateList r0 = r1.mTint
            if (r0 == 0) goto L11
            boolean r0 = r0.isStateful()
            if (r0 == 0) goto L11
            goto L13
        L11:
            r0 = 0
            goto L14
        L13:
            r0 = 1
        L14:
            return r0
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.mDstRect
            r0.set(r2)
            pl.droidsonroids.gif.transforms.Transform r0 = r1.mTransform
            if (r0 == 0) goto Lc
            r0.onBoundsChange(r2)
        Lc:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] r2) {
            r1 = this;
            android.content.res.ColorStateList r2 = r1.mTint
            if (r2 == 0) goto L10
            android.graphics.PorterDuff$Mode r0 = r1.mTintMode
            if (r0 == 0) goto L10
            android.graphics.PorterDuffColorFilter r2 = r1.updateTintFilter(r2, r0)
            r1.mTintFilter = r2
            r2 = 1
            return r2
        L10:
            r2 = 0
            return r2
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void pause() {
            r0 = this;
            r0.stop()
            return
    }

    public void recycle() {
            r1 = this;
            r1.shutdown()
            android.graphics.Bitmap r0 = r1.mBuffer
            r0.recycle()
            return
    }

    public boolean removeAnimationListener(pl.droidsonroids.gif.AnimationListener r2) {
            r1 = this;
            java.util.concurrent.ConcurrentLinkedQueue<pl.droidsonroids.gif.AnimationListener> r0 = r1.mListeners
            boolean r2 = r0.remove(r2)
            return r2
    }

    public void reset() {
            r2 = this;
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r2.mExecutor
            pl.droidsonroids.gif.GifDrawable$1 r1 = new pl.droidsonroids.gif.GifDrawable$1
            r1.<init>(r2, r2)
            r0.execute(r1)
            return
    }

    @Override // android.widget.MediaController.MediaPlayerControl
    public void seekTo(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r3) {
            r2 = this;
            if (r3 < 0) goto Ld
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r2.mExecutor
            pl.droidsonroids.gif.GifDrawable$2 r1 = new pl.droidsonroids.gif.GifDrawable$2
            r1.<init>(r2, r2, r3)
            r0.execute(r1)
            return
        Ld:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Position is not positive"
            r3.<init>(r0)
            throw r3
    }

    public void seekToBlocking(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r4) {
            r3 = this;
            if (r4 < 0) goto L19
            pl.droidsonroids.gif.GifInfoHandle r0 = r3.mNativeInfoHandle
            monitor-enter(r0)
            pl.droidsonroids.gif.GifInfoHandle r1 = r3.mNativeInfoHandle     // Catch: java.lang.Throwable -> L16
            android.graphics.Bitmap r2 = r3.mBuffer     // Catch: java.lang.Throwable -> L16
            r1.seekToTime(r4, r2)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            pl.droidsonroids.gif.InvalidationHandler r4 = r3.mInvalidationHandler
            r0 = -1
            r1 = 0
            r4.sendEmptyMessageAtTime(r0, r1)
            return
        L16:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
        L19:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Position is not positive"
            r4.<init>(r0)
            throw r4
    }

    public void seekToFrame(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r3) {
            r2 = this;
            if (r3 < 0) goto Ld
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r2.mExecutor
            pl.droidsonroids.gif.GifDrawable$3 r1 = new pl.droidsonroids.gif.GifDrawable$3
            r1.<init>(r2, r2, r3)
            r0.execute(r1)
            return
        Ld:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Frame index is not positive"
            r3.<init>(r0)
            throw r3
    }

    public android.graphics.Bitmap seekToFrameAndGet(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r5) {
            r4 = this;
            if (r5 < 0) goto L1d
            pl.droidsonroids.gif.GifInfoHandle r0 = r4.mNativeInfoHandle
            monitor-enter(r0)
            pl.droidsonroids.gif.GifInfoHandle r1 = r4.mNativeInfoHandle     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r2 = r4.mBuffer     // Catch: java.lang.Throwable -> L1a
            r1.seekToFrame(r5, r2)     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r5 = r4.getCurrentFrame()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            pl.droidsonroids.gif.InvalidationHandler r0 = r4.mInvalidationHandler
            r1 = -1
            r2 = 0
            r0.sendEmptyMessageAtTime(r1, r2)
            return r5
        L1a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
        L1d:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            java.lang.String r0 = "Frame index is not positive"
            r5.<init>(r0)
            throw r5
    }

    public android.graphics.Bitmap seekToPositionAndGet(@androidx.annotation.IntRange(from = 0, to = 2147483647L) int r5) {
            r4 = this;
            if (r5 < 0) goto L1d
            pl.droidsonroids.gif.GifInfoHandle r0 = r4.mNativeInfoHandle
            monitor-enter(r0)
            pl.droidsonroids.gif.GifInfoHandle r1 = r4.mNativeInfoHandle     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r2 = r4.mBuffer     // Catch: java.lang.Throwable -> L1a
            r1.seekToTime(r5, r2)     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r5 = r4.getCurrentFrame()     // Catch: java.lang.Throwable -> L1a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            pl.droidsonroids.gif.InvalidationHandler r0 = r4.mInvalidationHandler
            r1 = -1
            r2 = 0
            r0.sendEmptyMessageAtTime(r1, r2)
            return r5
        L1a:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1a
            throw r5
        L1d:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Position is not positive"
            r5.<init>(r0)
            throw r5
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@androidx.annotation.IntRange(from = 0, to = 255) int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setAlpha(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@androidx.annotation.Nullable android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setColorFilter(r2)
            return
    }

    public void setCornerRadius(@androidx.annotation.FloatRange(from = 0.0d) float r2) {
            r1 = this;
            pl.droidsonroids.gif.transforms.CornerRadiusTransform r0 = new pl.droidsonroids.gif.transforms.CornerRadiusTransform
            r0.<init>(r2)
            r1.mTransform = r0
            android.graphics.Rect r2 = r1.mDstRect
            r0.onBoundsChange(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setDither(r2)
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.mPaint
            r0.setFilterBitmap(r2)
            r1.invalidateSelf()
            return
    }

    public void setLoopCount(@androidx.annotation.IntRange(from = 0, to = 65535) int r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            r0.setLoopCount(r2)
            return
    }

    public void setSpeed(@androidx.annotation.FloatRange(from = 0.0d, fromInclusive = false) float r2) {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            r0.setSpeedFactor(r2)
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(android.content.res.ColorStateList r2) {
            r1 = this;
            r1.mTint = r2
            android.graphics.PorterDuff$Mode r0 = r1.mTintMode
            android.graphics.PorterDuffColorFilter r2 = r1.updateTintFilter(r2, r0)
            r1.mTintFilter = r2
            r1.invalidateSelf()
            return
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(@androidx.annotation.Nullable android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            r1.mTintMode = r2
            android.content.res.ColorStateList r0 = r1.mTint
            android.graphics.PorterDuffColorFilter r2 = r1.updateTintFilter(r0, r2)
            r1.mTintFilter = r2
            r1.invalidateSelf()
            return
    }

    public void setTransform(@androidx.annotation.Nullable pl.droidsonroids.gif.transforms.Transform r2) {
            r1 = this;
            r1.mTransform = r2
            if (r2 == 0) goto L9
            android.graphics.Rect r0 = r1.mDstRect
            r2.onBoundsChange(r0)
        L9:
            return
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean r3, boolean r4) {
            r2 = this;
            boolean r0 = super.setVisible(r3, r4)
            boolean r1 = r2.mIsRenderingTriggeredOnDraw
            if (r1 != 0) goto L1a
            if (r3 == 0) goto L15
            if (r4 == 0) goto Lf
            r2.reset()
        Lf:
            if (r0 == 0) goto L1a
            r2.start()
            goto L1a
        L15:
            if (r0 == 0) goto L1a
            r2.stop()
        L1a:
            return r0
    }

    @Override // android.graphics.drawable.Animatable, android.widget.MediaController.MediaPlayerControl
    public void start() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mIsRunning     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L7
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            return
        L7:
            r0 = 1
            r2.mIsRunning = r0     // Catch: java.lang.Throwable -> L15
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            pl.droidsonroids.gif.GifInfoHandle r0 = r2.mNativeInfoHandle
            long r0 = r0.restoreRemainder()
            r2.startAnimation(r0)
            return
        L15:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
            throw r0
    }

    public final void startAnimation(long r5) {
            r4 = this;
            boolean r0 = r4.mIsRenderingTriggeredOnDraw
            r1 = 0
            if (r0 == 0) goto Lf
            r4.mNextFrameRenderTime = r1
            pl.droidsonroids.gif.InvalidationHandler r5 = r4.mInvalidationHandler
            r6 = -1
            r5.sendEmptyMessageAtTime(r6, r1)
            goto L22
        Lf:
            r4.cancelPendingRenderTask()
            java.util.concurrent.ScheduledThreadPoolExecutor r0 = r4.mExecutor
            pl.droidsonroids.gif.RenderTask r3 = r4.mRenderTask
            long r5 = java.lang.Math.max(r5, r1)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            java.util.concurrent.ScheduledFuture r5 = r0.schedule(r3, r5, r1)
            r4.mRenderTaskSchedule = r5
        L22:
            return
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mIsRunning     // Catch: java.lang.Throwable -> L14
            if (r0 != 0) goto L7
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            return
        L7:
            r0 = 0
            r1.mIsRunning = r0     // Catch: java.lang.Throwable -> L14
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            r1.cancelPendingRenderTask()
            pl.droidsonroids.gif.GifInfoHandle r0 = r1.mNativeInfoHandle
            r0.saveRemainder()
            return
        L14:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L14
            throw r0
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]
            pl.droidsonroids.gif.GifInfoHandle r2 = r4.mNativeInfoHandle
            int r2 = r2.getWidth()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            pl.droidsonroids.gif.GifInfoHandle r2 = r4.mNativeInfoHandle
            int r2 = r2.getHeight()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 1
            r1[r3] = r2
            pl.droidsonroids.gif.GifInfoHandle r2 = r4.mNativeInfoHandle
            int r2 = r2.getNumberOfFrames()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 2
            r1[r3] = r2
            pl.droidsonroids.gif.GifInfoHandle r2 = r4.mNativeInfoHandle
            int r2 = r2.getNativeErrorCode()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            r1[r3] = r2
            java.lang.String r2 = "GIF: size: %dx%d, frames: %d, error: %d"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }
}
