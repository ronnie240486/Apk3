package pl.droidsonroids.gif;

/* JADX INFO: loaded from: classes3.dex */
public final enum GifError extends java.lang.Enum<pl.droidsonroids.gif.GifError> {
    private static final /* synthetic */ pl.droidsonroids.gif.GifError[] $VALUES = null;
    public static final pl.droidsonroids.gif.GifError CLOSE_FAILED = null;
    public static final pl.droidsonroids.gif.GifError DATA_TOO_BIG = null;
    public static final pl.droidsonroids.gif.GifError EOF_TOO_SOON = null;
    public static final pl.droidsonroids.gif.GifError IMAGE_DEFECT = null;
    public static final pl.droidsonroids.gif.GifError IMG_NOT_CONFINED = null;
    public static final pl.droidsonroids.gif.GifError INVALID_BYTE_BUFFER = null;

    @java.lang.Deprecated
    public static final pl.droidsonroids.gif.GifError INVALID_IMG_DIMS = null;
    public static final pl.droidsonroids.gif.GifError INVALID_SCR_DIMS = null;
    public static final pl.droidsonroids.gif.GifError NOT_ENOUGH_MEM = null;
    public static final pl.droidsonroids.gif.GifError NOT_GIF_FILE = null;
    public static final pl.droidsonroids.gif.GifError NOT_READABLE = null;
    public static final pl.droidsonroids.gif.GifError NO_COLOR_MAP = null;
    public static final pl.droidsonroids.gif.GifError NO_ERROR = null;
    public static final pl.droidsonroids.gif.GifError NO_FRAMES = null;
    public static final pl.droidsonroids.gif.GifError NO_IMAG_DSCR = null;
    public static final pl.droidsonroids.gif.GifError NO_SCRN_DSCR = null;
    public static final pl.droidsonroids.gif.GifError OPEN_FAILED = null;
    public static final pl.droidsonroids.gif.GifError READ_FAILED = null;
    public static final pl.droidsonroids.gif.GifError REWIND_FAILED = null;
    public static final pl.droidsonroids.gif.GifError UNKNOWN = null;
    public static final pl.droidsonroids.gif.GifError WRONG_RECORD = null;

    @androidx.annotation.NonNull
    public final java.lang.String description;
    public int errorCode;

    static {
            pl.droidsonroids.gif.GifError r0 = new pl.droidsonroids.gif.GifError
            java.lang.String r1 = "NO_ERROR"
            r2 = 0
            java.lang.String r3 = "No error"
            r0.<init>(r1, r2, r2, r3)
            pl.droidsonroids.gif.GifError.NO_ERROR = r0
            pl.droidsonroids.gif.GifError r1 = new pl.droidsonroids.gif.GifError
            java.lang.String r3 = "OPEN_FAILED"
            r4 = 1
            r5 = 101(0x65, float:1.42E-43)
            java.lang.String r6 = "Failed to open given input"
            r1.<init>(r3, r4, r5, r6)
            pl.droidsonroids.gif.GifError.OPEN_FAILED = r1
            pl.droidsonroids.gif.GifError r3 = new pl.droidsonroids.gif.GifError
            java.lang.String r5 = "READ_FAILED"
            r6 = 2
            r7 = 102(0x66, float:1.43E-43)
            java.lang.String r8 = "Failed to read from given input"
            r3.<init>(r5, r6, r7, r8)
            pl.droidsonroids.gif.GifError.READ_FAILED = r3
            pl.droidsonroids.gif.GifError r5 = new pl.droidsonroids.gif.GifError
            java.lang.String r7 = "NOT_GIF_FILE"
            r8 = 3
            r9 = 103(0x67, float:1.44E-43)
            java.lang.String r10 = "Data is not in GIF format"
            r5.<init>(r7, r8, r9, r10)
            pl.droidsonroids.gif.GifError.NOT_GIF_FILE = r5
            pl.droidsonroids.gif.GifError r7 = new pl.droidsonroids.gif.GifError
            java.lang.String r9 = "NO_SCRN_DSCR"
            r10 = 4
            r11 = 104(0x68, float:1.46E-43)
            java.lang.String r12 = "No screen descriptor detected"
            r7.<init>(r9, r10, r11, r12)
            pl.droidsonroids.gif.GifError.NO_SCRN_DSCR = r7
            pl.droidsonroids.gif.GifError r9 = new pl.droidsonroids.gif.GifError
            java.lang.String r11 = "NO_IMAG_DSCR"
            r12 = 5
            r13 = 105(0x69, float:1.47E-43)
            java.lang.String r14 = "No image descriptor detected"
            r9.<init>(r11, r12, r13, r14)
            pl.droidsonroids.gif.GifError.NO_IMAG_DSCR = r9
            pl.droidsonroids.gif.GifError r11 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "NO_COLOR_MAP"
            r14 = 6
            r15 = 106(0x6a, float:1.49E-43)
            java.lang.String r12 = "Neither global nor local color map found"
            r11.<init>(r13, r14, r15, r12)
            pl.droidsonroids.gif.GifError.NO_COLOR_MAP = r11
            pl.droidsonroids.gif.GifError r12 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "WRONG_RECORD"
            r15 = 7
            r14 = 107(0x6b, float:1.5E-43)
            java.lang.String r10 = "Wrong record type detected"
            r12.<init>(r13, r15, r14, r10)
            pl.droidsonroids.gif.GifError.WRONG_RECORD = r12
            pl.droidsonroids.gif.GifError r10 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "DATA_TOO_BIG"
            r14 = 8
            r15 = 108(0x6c, float:1.51E-43)
            java.lang.String r8 = "Number of pixels bigger than width * height"
            r10.<init>(r13, r14, r15, r8)
            pl.droidsonroids.gif.GifError.DATA_TOO_BIG = r10
            pl.droidsonroids.gif.GifError r8 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "NOT_ENOUGH_MEM"
            r15 = 9
            r14 = 109(0x6d, float:1.53E-43)
            java.lang.String r6 = "Failed to allocate required memory"
            r8.<init>(r13, r15, r14, r6)
            pl.droidsonroids.gif.GifError.NOT_ENOUGH_MEM = r8
            pl.droidsonroids.gif.GifError r6 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "CLOSE_FAILED"
            r14 = 10
            r15 = 110(0x6e, float:1.54E-43)
            java.lang.String r4 = "Failed to close given input"
            r6.<init>(r13, r14, r15, r4)
            pl.droidsonroids.gif.GifError.CLOSE_FAILED = r6
            pl.droidsonroids.gif.GifError r4 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "NOT_READABLE"
            r15 = 11
            r14 = 111(0x6f, float:1.56E-43)
            java.lang.String r2 = "Given file was not opened for read"
            r4.<init>(r13, r15, r14, r2)
            pl.droidsonroids.gif.GifError.NOT_READABLE = r4
            pl.droidsonroids.gif.GifError r2 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "IMAGE_DEFECT"
            r14 = 12
            r15 = 112(0x70, float:1.57E-43)
            r16 = r4
            java.lang.String r4 = "Image is defective, decoding aborted"
            r2.<init>(r13, r14, r15, r4)
            pl.droidsonroids.gif.GifError.IMAGE_DEFECT = r2
            pl.droidsonroids.gif.GifError r4 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "EOF_TOO_SOON"
            r15 = 13
            r14 = 113(0x71, float:1.58E-43)
            r17 = r2
            java.lang.String r2 = "Image EOF detected before image complete"
            r4.<init>(r13, r15, r14, r2)
            pl.droidsonroids.gif.GifError.EOF_TOO_SOON = r4
            pl.droidsonroids.gif.GifError r2 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "NO_FRAMES"
            r14 = 14
            r15 = 1000(0x3e8, float:1.401E-42)
            r18 = r4
            java.lang.String r4 = "No frames found, at least one frame required"
            r2.<init>(r13, r14, r15, r4)
            pl.droidsonroids.gif.GifError.NO_FRAMES = r2
            pl.droidsonroids.gif.GifError r4 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "INVALID_SCR_DIMS"
            r15 = 15
            r14 = 1001(0x3e9, float:1.403E-42)
            r19 = r2
            java.lang.String r2 = "Invalid screen size, dimensions must be positive"
            r4.<init>(r13, r15, r14, r2)
            pl.droidsonroids.gif.GifError.INVALID_SCR_DIMS = r4
            pl.droidsonroids.gif.GifError r2 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "INVALID_IMG_DIMS"
            r14 = 16
            r15 = 1002(0x3ea, float:1.404E-42)
            r20 = r4
            java.lang.String r4 = "Invalid image size, dimensions must be positive"
            r2.<init>(r13, r14, r15, r4)
            pl.droidsonroids.gif.GifError.INVALID_IMG_DIMS = r2
            pl.droidsonroids.gif.GifError r4 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "IMG_NOT_CONFINED"
            r15 = 17
            r14 = 1003(0x3eb, float:1.406E-42)
            r21 = r2
            java.lang.String r2 = "Image size exceeds screen size"
            r4.<init>(r13, r15, r14, r2)
            pl.droidsonroids.gif.GifError.IMG_NOT_CONFINED = r4
            pl.droidsonroids.gif.GifError r2 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "REWIND_FAILED"
            r14 = 18
            r15 = 1004(0x3ec, float:1.407E-42)
            r22 = r4
            java.lang.String r4 = "Input source rewind failed, animation stopped"
            r2.<init>(r13, r14, r15, r4)
            pl.droidsonroids.gif.GifError.REWIND_FAILED = r2
            pl.droidsonroids.gif.GifError r4 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "INVALID_BYTE_BUFFER"
            r15 = 19
            r14 = 1005(0x3ed, float:1.408E-42)
            r23 = r2
            java.lang.String r2 = "Invalid and/or indirect byte buffer specified"
            r4.<init>(r13, r15, r14, r2)
            pl.droidsonroids.gif.GifError.INVALID_BYTE_BUFFER = r4
            pl.droidsonroids.gif.GifError r2 = new pl.droidsonroids.gif.GifError
            java.lang.String r13 = "UNKNOWN"
            r14 = 20
            r15 = -1
            r24 = r4
            java.lang.String r4 = "Unknown error"
            r2.<init>(r13, r14, r15, r4)
            pl.droidsonroids.gif.GifError.UNKNOWN = r2
            r4 = 21
            pl.droidsonroids.gif.GifError[] r4 = new pl.droidsonroids.gif.GifError[r4]
            r13 = 0
            r4[r13] = r0
            r0 = 1
            r4[r0] = r1
            r0 = 2
            r4[r0] = r3
            r0 = 3
            r4[r0] = r5
            r0 = 4
            r4[r0] = r7
            r0 = 5
            r4[r0] = r9
            r0 = 6
            r4[r0] = r11
            r0 = 7
            r4[r0] = r12
            r0 = 8
            r4[r0] = r10
            r0 = 9
            r4[r0] = r8
            r0 = 10
            r4[r0] = r6
            r0 = 11
            r4[r0] = r16
            r0 = 12
            r4[r0] = r17
            r0 = 13
            r4[r0] = r18
            r0 = 14
            r4[r0] = r19
            r0 = 15
            r4[r0] = r20
            r0 = 16
            r4[r0] = r21
            r0 = 17
            r4[r0] = r22
            r0 = 18
            r4[r0] = r23
            r0 = 19
            r4[r0] = r24
            r4[r14] = r2
            pl.droidsonroids.gif.GifError.$VALUES = r4
            return
    }

    private GifError(java.lang.String r1, @androidx.annotation.NonNull int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.errorCode = r3
            r0.description = r4
            return
    }

    public static pl.droidsonroids.gif.GifError fromCode(int r5) {
            pl.droidsonroids.gif.GifError[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            int r4 = r3.errorCode
            if (r4 != r5) goto Lf
            return r3
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            pl.droidsonroids.gif.GifError r0 = pl.droidsonroids.gif.GifError.UNKNOWN
            r0.errorCode = r5
            return r0
    }

    public static pl.droidsonroids.gif.GifError valueOf(java.lang.String r1) {
            java.lang.Class<pl.droidsonroids.gif.GifError> r0 = pl.droidsonroids.gif.GifError.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            pl.droidsonroids.gif.GifError r1 = (pl.droidsonroids.gif.GifError) r1
            return r1
    }

    public static pl.droidsonroids.gif.GifError[] values() {
            pl.droidsonroids.gif.GifError[] r0 = pl.droidsonroids.gif.GifError.$VALUES
            java.lang.Object r0 = r0.clone()
            pl.droidsonroids.gif.GifError[] r0 = (pl.droidsonroids.gif.GifError[]) r0
            return r0
    }

    public int getErrorCode() {
            r1 = this;
            int r0 = r1.errorCode
            return r0
    }

    public final java.lang.String getFormattedDescription() {
            r4 = this;
            java.util.Locale r0 = java.util.Locale.ENGLISH
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            int r2 = r4.errorCode
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 0
            r1[r3] = r2
            java.lang.String r2 = r4.description
            r3 = 1
            r1[r3] = r2
            java.lang.String r2 = "GifError %d: %s"
            java.lang.String r0 = java.lang.String.format(r0, r2, r1)
            return r0
    }
}
