package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes2.dex */
public class GifIOException extends java.io.IOException {
    public static final /* synthetic */ int $r8$clinit = 0;
    private static final long serialVersionUID = 13038402904505L;
    private final java.lang.String mErrnoMessage;

    @androidx.annotation.NonNull
    public final pl.droidsonroids.gif.GifError reason;

    public GifIOException(int r1, java.lang.String r2) {
            r0 = this;
            r0.<init>()
            pl.droidsonroids.gif.GifError r1 = pl.droidsonroids.gif.GifError.fromCode(r1)
            r0.reason = r1
            r0.mErrnoMessage = r2
            return
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r2 = this;
            java.lang.String r0 = r2.mErrnoMessage
            if (r0 != 0) goto Lb
            pl.droidsonroids.gif.GifError r0 = r2.reason
            java.lang.String r0 = r0.getFormattedDescription()
            return r0
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            pl.droidsonroids.gif.GifError r1 = r2.reason
            java.lang.String r1 = r1.getFormattedDescription()
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = r2.mErrnoMessage
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
