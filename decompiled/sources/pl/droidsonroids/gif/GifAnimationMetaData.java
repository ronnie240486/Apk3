package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
public class GifAnimationMetaData implements java.io.Serializable, android.os.Parcelable {
    public static final android.os.Parcelable.Creator<pl.droidsonroids.gif.GifAnimationMetaData> CREATOR = null;
    private static final long serialVersionUID = 5692363926580237325L;
    private final int mDuration;
    private final int mHeight;
    private final int mImageCount;
    private final int mLoopCount;
    private final long mMetadataBytesCount;
    private final long mPixelsBytesCount;
    private final int mWidth;


    static {
            pl.droidsonroids.gif.GifAnimationMetaData$1 r0 = new pl.droidsonroids.gif.GifAnimationMetaData$1
            r0.<init>()
            pl.droidsonroids.gif.GifAnimationMetaData.CREATOR = r0
            return
    }

    public GifAnimationMetaData(@androidx.annotation.Nullable android.content.ContentResolver r1, @androidx.annotation.NonNull android.net.Uri r2) throws java.io.IOException {
            r0 = this;
            pl.droidsonroids.gif.GifInfoHandle r1 = pl.droidsonroids.gif.GifInfoHandle.openUri(r1, r2)
            r0.<init>(r1)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull android.content.res.AssetFileDescriptor r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull android.content.res.AssetManager r1, @androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
            r0.<init>(r1)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull android.content.res.Resources r1, @androidx.annotation.DrawableRes @androidx.annotation.RawRes int r2) throws android.content.res.Resources.NotFoundException, java.io.IOException {
            r0 = this;
            android.content.res.AssetFileDescriptor r1 = r1.openRawResourceFd(r2)
            r0.<init>(r1)
            return
    }

    private GifAnimationMetaData(android.os.Parcel r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.readInt()
            r2.mLoopCount = r0
            int r0 = r3.readInt()
            r2.mDuration = r0
            int r0 = r3.readInt()
            r2.mHeight = r0
            int r0 = r3.readInt()
            r2.mWidth = r0
            int r0 = r3.readInt()
            r2.mImageCount = r0
            long r0 = r3.readLong()
            r2.mMetadataBytesCount = r0
            long r0 = r3.readLong()
            r2.mPixelsBytesCount = r0
            return
    }

    public /* synthetic */ GifAnimationMetaData(android.os.Parcel r1, pl.droidsonroids.gif.GifAnimationMetaData.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.io.File r1) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getPath()
            r0.<init>(r1)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.io.FileDescriptor r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.lang.String r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull java.nio.ByteBuffer r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    private GifAnimationMetaData(pl.droidsonroids.gif.GifInfoHandle r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.getLoopCount()
            r2.mLoopCount = r0
            int r0 = r3.getDuration()
            r2.mDuration = r0
            int r0 = r3.getWidth()
            r2.mWidth = r0
            int r0 = r3.getHeight()
            r2.mHeight = r0
            int r0 = r3.getNumberOfFrames()
            r2.mImageCount = r0
            long r0 = r3.getMetadataByteCount()
            r2.mMetadataBytesCount = r0
            long r0 = r3.getAllocationByteCount()
            r2.mPixelsBytesCount = r0
            r3.recycle()
            return
    }

    public GifAnimationMetaData(@androidx.annotation.NonNull byte[] r2) throws java.io.IOException {
            r1 = this;
            pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public long getAllocationByteCount() {
            r2 = this;
            long r0 = r2.mPixelsBytesCount
            return r0
    }

    @pl.droidsonroids.gif.annotations.Beta
    public long getDrawableAllocationByteCount(@androidx.annotation.Nullable pl.droidsonroids.gif.GifDrawable r5, @androidx.annotation.IntRange(from = 1, to = 65535) int r6) {
            r4 = this;
            r0 = 65535(0xffff, float:9.1834E-41)
            r1 = 1
            if (r6 < r1) goto L2b
            if (r6 > r0) goto L2b
            int r6 = r6 * r6
            if (r5 == 0) goto L1b
            android.graphics.Bitmap r0 = r5.mBuffer
            boolean r0 = r0.isRecycled()
            if (r0 != 0) goto L1b
            android.graphics.Bitmap r5 = r5.mBuffer
            int r5 = r5.getAllocationByteCount()
            goto L24
        L1b:
            int r5 = r4.mWidth
            int r0 = r4.mHeight
            int r5 = r5 * r0
            int r5 = r5 * 4
            int r5 = r5 / r6
        L24:
            long r0 = (long) r5
            long r2 = r4.mPixelsBytesCount
            long r5 = (long) r6
            long r2 = r2 / r5
            long r2 = r2 + r0
            return r2
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Sample size "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = " out of range <1, "
            r1.append(r6)
            r1.append(r0)
            java.lang.String r6 = ">"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            r5.<init>(r6)
            throw r5
    }

    public int getDuration() {
            r1 = this;
            int r0 = r1.mDuration
            return r0
    }

    public int getHeight() {
            r1 = this;
            int r0 = r1.mHeight
            return r0
    }

    public int getLoopCount() {
            r1 = this;
            int r0 = r1.mLoopCount
            return r0
    }

    public long getMetadataAllocationByteCount() {
            r2 = this;
            long r0 = r2.mMetadataBytesCount
            return r0
    }

    public int getNumberOfFrames() {
            r1 = this;
            int r0 = r1.mImageCount
            return r0
    }

    public int getWidth() {
            r1 = this;
            int r0 = r1.mWidth
            return r0
    }

    public boolean isAnimated() {
            r2 = this;
            int r0 = r2.mImageCount
            r1 = 1
            if (r0 <= r1) goto La
            int r0 = r2.mDuration
            if (r0 <= 0) goto La
            goto Lb
        La:
            r1 = 0
        Lb:
            return r1
    }

    @androidx.annotation.NonNull
    public java.lang.String toString() {
            r5 = this;
            int r0 = r5.mLoopCount
            if (r0 != 0) goto L7
            java.lang.String r0 = "Infinity"
            goto Lb
        L7:
            java.lang.String r0 = java.lang.Integer.toString(r0)
        Lb:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            r2 = 5
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            int r4 = r5.mWidth
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r3 = 1
            int r4 = r5.mHeight
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r3 = 2
            int r4 = r5.mImageCount
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r2[r3] = r4
            r3 = 3
            r2[r3] = r0
            r0 = 4
            int r3 = r5.mDuration
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "GIF: size: %dx%d, frames: %d, loops: %s, duration: %d"
            java.lang.String r0 = java.lang.String.format(r1, r0, r2)
            boolean r1 = r5.isAnimated()
            if (r1 == 0) goto L49
            java.lang.String r1 = "Animated "
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r0)
        L49:
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = r2.mLoopCount
            r3.writeInt(r4)
            int r4 = r2.mDuration
            r3.writeInt(r4)
            int r4 = r2.mHeight
            r3.writeInt(r4)
            int r4 = r2.mWidth
            r3.writeInt(r4)
            int r4 = r2.mImageCount
            r3.writeInt(r4)
            long r0 = r2.mMetadataBytesCount
            r3.writeLong(r0)
            long r0 = r2.mPixelsBytesCount
            r3.writeLong(r0)
            return
    }
}
