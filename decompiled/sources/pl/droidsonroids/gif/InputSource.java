package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
public abstract class InputSource {

    /* JADX INFO: renamed from: pl.droidsonroids.gif.InputSource$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
    }

    public static class AssetFileDescriptorSource extends pl.droidsonroids.gif.InputSource {
        private final android.content.res.AssetFileDescriptor mAssetFileDescriptor;

        public AssetFileDescriptorSource(@androidx.annotation.NonNull android.content.res.AssetFileDescriptor r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mAssetFileDescriptor = r2
                return
        }

        @Override // pl.droidsonroids.gif.InputSource
        public final pl.droidsonroids.gif.GifInfoHandle open() throws java.io.IOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                android.content.res.AssetFileDescriptor r1 = r2.mAssetFileDescriptor
                r0.<init>(r1)
                return r0
        }
    }

    public static final class AssetSource extends pl.droidsonroids.gif.InputSource {
        private final android.content.res.AssetManager mAssetManager;
        private final java.lang.String mAssetName;

        public AssetSource(@androidx.annotation.NonNull android.content.res.AssetManager r2, @androidx.annotation.NonNull java.lang.String r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mAssetManager = r2
                r1.mAssetName = r3
                return
        }

        @Override // pl.droidsonroids.gif.InputSource
        public final pl.droidsonroids.gif.GifInfoHandle open() throws java.io.IOException {
                r3 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                android.content.res.AssetManager r1 = r3.mAssetManager
                java.lang.String r2 = r3.mAssetName
                android.content.res.AssetFileDescriptor r1 = r1.openFd(r2)
                r0.<init>(r1)
                return r0
        }
    }

    public static final class ByteArraySource extends pl.droidsonroids.gif.InputSource {
        private final byte[] bytes;

        public ByteArraySource(@androidx.annotation.NonNull byte[] r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.bytes = r2
                return
        }

        @Override // pl.droidsonroids.gif.InputSource
        public final pl.droidsonroids.gif.GifInfoHandle open() throws pl.droidsonroids.gif.GifIOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                byte[] r1 = r2.bytes
                r0.<init>(r1)
                return r0
        }
    }

    public static final class DirectByteBufferSource extends pl.droidsonroids.gif.InputSource {
        private final java.nio.ByteBuffer byteBuffer;

        public DirectByteBufferSource(@androidx.annotation.NonNull java.nio.ByteBuffer r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.byteBuffer = r2
                return
        }

        @Override // pl.droidsonroids.gif.InputSource
        public final pl.droidsonroids.gif.GifInfoHandle open() throws pl.droidsonroids.gif.GifIOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                java.nio.ByteBuffer r1 = r2.byteBuffer
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class FileDescriptorSource extends pl.droidsonroids.gif.InputSource {
        private final java.io.FileDescriptor mFd;

        public FileDescriptorSource(@androidx.annotation.NonNull java.io.FileDescriptor r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mFd = r2
                return
        }

        @Override // pl.droidsonroids.gif.InputSource
        public final pl.droidsonroids.gif.GifInfoHandle open() throws java.io.IOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                java.io.FileDescriptor r1 = r2.mFd
                r0.<init>(r1)
                return r0
        }
    }

    public static final class FileSource extends pl.droidsonroids.gif.InputSource {
        private final java.lang.String mPath;

        public FileSource(@androidx.annotation.NonNull java.io.File r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                java.lang.String r2 = r2.getPath()
                r1.mPath = r2
                return
        }

        public FileSource(@androidx.annotation.NonNull java.lang.String r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mPath = r2
                return
        }

        @Override // pl.droidsonroids.gif.InputSource
        public final pl.droidsonroids.gif.GifInfoHandle open() throws pl.droidsonroids.gif.GifIOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                java.lang.String r1 = r2.mPath
                r0.<init>(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class InputStreamSource extends pl.droidsonroids.gif.InputSource {
        private final java.io.InputStream inputStream;

        public InputStreamSource(@androidx.annotation.NonNull java.io.InputStream r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.inputStream = r2
                return
        }

        @Override // pl.droidsonroids.gif.InputSource
        public final pl.droidsonroids.gif.GifInfoHandle open() throws java.io.IOException {
                r2 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                java.io.InputStream r1 = r2.inputStream
                r0.<init>(r1)
                return r0
        }
    }

    public static class ResourcesSource extends pl.droidsonroids.gif.InputSource {
        private final int mResourceId;
        private final android.content.res.Resources mResources;

        public ResourcesSource(@androidx.annotation.NonNull android.content.res.Resources r2, @androidx.annotation.DrawableRes @androidx.annotation.RawRes int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mResources = r2
                r1.mResourceId = r3
                return
        }

        @Override // pl.droidsonroids.gif.InputSource
        public final pl.droidsonroids.gif.GifInfoHandle open() throws java.io.IOException {
                r3 = this;
                pl.droidsonroids.gif.GifInfoHandle r0 = new pl.droidsonroids.gif.GifInfoHandle
                android.content.res.Resources r1 = r3.mResources
                int r2 = r3.mResourceId
                android.content.res.AssetFileDescriptor r1 = r1.openRawResourceFd(r2)
                r0.<init>(r1)
                return r0
        }
    }

    public static final class UriSource extends pl.droidsonroids.gif.InputSource {
        private final android.content.ContentResolver mContentResolver;
        private final android.net.Uri mUri;

        public UriSource(@androidx.annotation.Nullable android.content.ContentResolver r2, @androidx.annotation.NonNull android.net.Uri r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                r1.mContentResolver = r2
                r1.mUri = r3
                return
        }

        @Override // pl.droidsonroids.gif.InputSource
        public final pl.droidsonroids.gif.GifInfoHandle open() throws java.io.IOException {
                r2 = this;
                android.content.ContentResolver r0 = r2.mContentResolver
                android.net.Uri r1 = r2.mUri
                pl.droidsonroids.gif.GifInfoHandle r0 = pl.droidsonroids.gif.GifInfoHandle.openUri(r0, r1)
                return r0
        }
    }

    private InputSource() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ InputSource(pl.droidsonroids.gif.InputSource.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract pl.droidsonroids.gif.GifInfoHandle open() throws java.io.IOException;
}
