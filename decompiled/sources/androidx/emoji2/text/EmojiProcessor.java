package androidx.emoji2.text;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.AnyThread
@androidx.annotation.RequiresApi(19)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
final class EmojiProcessor {
    private static final int ACTION_ADVANCE_BOTH = 1;
    private static final int ACTION_ADVANCE_END = 2;
    private static final int ACTION_FLUSH = 3;

    @androidx.annotation.Nullable
    private final int[] mEmojiAsDefaultStyleExceptions;

    @androidx.annotation.NonNull
    private androidx.emoji2.text.EmojiCompat.GlyphChecker mGlyphChecker;

    @androidx.annotation.NonNull
    private final androidx.emoji2.text.MetadataRepo mMetadataRepo;

    @androidx.annotation.NonNull
    private final androidx.emoji2.text.EmojiCompat.SpanFactory mSpanFactory;
    private final boolean mUseEmojiAsDefaultStyle;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(19)
    public static final class CodepointIndexFinder {
        private static final int INVALID_INDEX = -1;

        private CodepointIndexFinder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class ProcessorSm {
        private static final int STATE_DEFAULT = 1;
        private static final int STATE_WALKING = 2;
        private int mCurrentDepth;
        private androidx.emoji2.text.MetadataRepo.Node mCurrentNode;
        private final int[] mEmojiAsDefaultStyleExceptions;
        private androidx.emoji2.text.MetadataRepo.Node mFlushNode;
        private int mLastCodepoint;
        private final androidx.emoji2.text.MetadataRepo.Node mRootNode;
        private int mState;
        private final boolean mUseEmojiAsDefaultStyle;

        public ProcessorSm(androidx.emoji2.text.MetadataRepo.Node r2, boolean r3, int[] r4) {
                r1 = this;
                r1.<init>()
                r0 = 1
                r1.mState = r0
                r1.mRootNode = r2
                r1.mCurrentNode = r2
                r1.mUseEmojiAsDefaultStyle = r3
                r1.mEmojiAsDefaultStyleExceptions = r4
                return
        }

        private static boolean isEmojiStyle(int r1) {
                r0 = 65039(0xfe0f, float:9.1139E-41)
                if (r1 != r0) goto L7
                r1 = 1
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        private static boolean isTextStyle(int r1) {
                r0 = 65038(0xfe0e, float:9.1138E-41)
                if (r1 != r0) goto L7
                r1 = 1
                goto L8
            L7:
                r1 = 0
            L8:
                return r1
        }

        private int reset() {
                r2 = this;
                r0 = 1
                r2.mState = r0
                androidx.emoji2.text.MetadataRepo$Node r1 = r2.mRootNode
                r2.mCurrentNode = r1
                r1 = 0
                r2.mCurrentDepth = r1
                return r0
        }

        private boolean shouldUseEmojiPresentationStyleForSingleCodepoint() {
                r4 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                boolean r0 = r0.isDefaultEmoji()
                r1 = 1
                if (r0 == 0) goto Le
                return r1
            Le:
                int r0 = r4.mLastCodepoint
                boolean r0 = isEmojiStyle(r0)
                if (r0 == 0) goto L17
                return r1
            L17:
                boolean r0 = r4.mUseEmojiAsDefaultStyle
                r2 = 0
                if (r0 == 0) goto L34
                int[] r0 = r4.mEmojiAsDefaultStyleExceptions
                if (r0 != 0) goto L21
                return r1
            L21:
                androidx.emoji2.text.MetadataRepo$Node r0 = r4.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                int r0 = r0.getCodepointAt(r2)
                int[] r3 = r4.mEmojiAsDefaultStyleExceptions
                int r0 = java.util.Arrays.binarySearch(r3, r0)
                if (r0 >= 0) goto L34
                return r1
            L34:
                return r2
        }

        public final int check(int r6) {
                r5 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r5.mCurrentNode
                androidx.emoji2.text.MetadataRepo$Node r0 = r0.get(r6)
                int r1 = r5.mState
                r2 = 3
                r3 = 1
                r4 = 2
                if (r1 == r4) goto L1c
                if (r0 != 0) goto L14
                int r2 = r5.reset()
                goto L63
            L14:
                r5.mState = r4
                r5.mCurrentNode = r0
                r5.mCurrentDepth = r3
            L1a:
                r2 = 2
                goto L63
            L1c:
                if (r0 == 0) goto L26
                r5.mCurrentNode = r0
                int r0 = r5.mCurrentDepth
                int r0 = r0 + r3
                r5.mCurrentDepth = r0
                goto L1a
            L26:
                boolean r0 = isTextStyle(r6)
                if (r0 == 0) goto L31
                int r2 = r5.reset()
                goto L63
            L31:
                boolean r0 = isEmojiStyle(r6)
                if (r0 == 0) goto L38
                goto L1a
            L38:
                androidx.emoji2.text.MetadataRepo$Node r0 = r5.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                if (r0 == 0) goto L5f
                int r0 = r5.mCurrentDepth
                if (r0 != r3) goto L57
                boolean r0 = r5.shouldUseEmojiPresentationStyleForSingleCodepoint()
                if (r0 == 0) goto L52
                androidx.emoji2.text.MetadataRepo$Node r0 = r5.mCurrentNode
                r5.mFlushNode = r0
                r5.reset()
                goto L63
            L52:
                int r2 = r5.reset()
                goto L63
            L57:
                androidx.emoji2.text.MetadataRepo$Node r0 = r5.mCurrentNode
                r5.mFlushNode = r0
                r5.reset()
                goto L63
            L5f:
                int r2 = r5.reset()
            L63:
                r5.mLastCodepoint = r6
                return r2
        }

        public final androidx.emoji2.text.EmojiMetadata getCurrentMetadata() {
                r1 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r1.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                return r0
        }

        public final androidx.emoji2.text.EmojiMetadata getFlushMetadata() {
                r1 = this;
                androidx.emoji2.text.MetadataRepo$Node r0 = r1.mFlushNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                return r0
        }

        public final boolean isInFlushableState() {
                r3 = this;
                int r0 = r3.mState
                r1 = 1
                r2 = 2
                if (r0 != r2) goto L19
                androidx.emoji2.text.MetadataRepo$Node r0 = r3.mCurrentNode
                androidx.emoji2.text.EmojiMetadata r0 = r0.getData()
                if (r0 == 0) goto L19
                int r0 = r3.mCurrentDepth
                if (r0 > r1) goto L1a
                boolean r0 = r3.shouldUseEmojiPresentationStyleForSingleCodepoint()
                if (r0 == 0) goto L19
                goto L1a
            L19:
                r1 = 0
            L1a:
                return r1
        }
    }

    public EmojiProcessor(@androidx.annotation.NonNull androidx.emoji2.text.MetadataRepo r1, @androidx.annotation.NonNull androidx.emoji2.text.EmojiCompat.SpanFactory r2, @androidx.annotation.NonNull androidx.emoji2.text.EmojiCompat.GlyphChecker r3, boolean r4, @androidx.annotation.Nullable int[] r5) {
            r0 = this;
            r0.<init>()
            r0.mSpanFactory = r2
            r0.mMetadataRepo = r1
            r0.mGlyphChecker = r3
            r0.mUseEmojiAsDefaultStyle = r4
            r0.mEmojiAsDefaultStyleExceptions = r5
            return
    }

    private void addEmoji(@androidx.annotation.NonNull android.text.Spannable r2, androidx.emoji2.text.EmojiMetadata r3, int r4, int r5) {
            r1 = this;
            androidx.emoji2.text.EmojiCompat$SpanFactory r0 = r1.mSpanFactory
            java.util.Objects.requireNonNull(r0)
            androidx.emoji2.text.TypefaceEmojiSpan r0 = new androidx.emoji2.text.TypefaceEmojiSpan
            r0.<init>(r3)
            r3 = 33
            r2.setSpan(r0, r4, r5, r3)
            return
    }

    private static boolean delete(@androidx.annotation.NonNull android.text.Editable r6, @androidx.annotation.NonNull android.view.KeyEvent r7, boolean r8) {
            boolean r7 = hasModifiers(r7)
            r0 = 0
            if (r7 == 0) goto L8
            return r0
        L8:
            int r7 = android.text.Selection.getSelectionStart(r6)
            int r1 = android.text.Selection.getSelectionEnd(r6)
            boolean r2 = hasInvalidSelection(r7, r1)
            if (r2 == 0) goto L17
            return r0
        L17:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r2 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r1 = r6.getSpans(r7, r1, r2)
            androidx.emoji2.text.EmojiSpan[] r1 = (androidx.emoji2.text.EmojiSpan[]) r1
            if (r1 == 0) goto L46
            int r2 = r1.length
            if (r2 <= 0) goto L46
            int r2 = r1.length
            r3 = 0
        L26:
            if (r3 >= r2) goto L46
            r4 = r1[r3]
            int r5 = r6.getSpanStart(r4)
            int r4 = r6.getSpanEnd(r4)
            if (r8 == 0) goto L36
            if (r5 == r7) goto L3e
        L36:
            if (r8 != 0) goto L3a
            if (r4 == r7) goto L3e
        L3a:
            if (r7 <= r5) goto L43
            if (r7 >= r4) goto L43
        L3e:
            r6.delete(r5, r4)
            r6 = 1
            return r6
        L43:
            int r3 = r3 + 1
            goto L26
        L46:
            return r0
    }

    public static boolean handleDeleteSurroundingText(@androidx.annotation.NonNull android.view.inputmethod.InputConnection r7, @androidx.annotation.NonNull android.text.Editable r8, @androidx.annotation.IntRange(from = 0) int r9, @androidx.annotation.IntRange(from = 0) int r10, boolean r11) {
            r0 = 0
            if (r8 == 0) goto Lf2
            if (r7 != 0) goto L7
            goto Lf2
        L7:
            if (r9 < 0) goto Lf2
            if (r10 >= 0) goto Ld
            goto Lf2
        Ld:
            int r1 = android.text.Selection.getSelectionStart(r8)
            int r2 = android.text.Selection.getSelectionEnd(r8)
            boolean r3 = hasInvalidSelection(r1, r2)
            if (r3 == 0) goto L1c
            return r0
        L1c:
            r3 = 1
            if (r11 == 0) goto La8
            int r9 = java.lang.Math.max(r9, r0)
            int r11 = r8.length()
            r4 = -1
            if (r1 < 0) goto L5f
            if (r11 >= r1) goto L2d
            goto L5f
        L2d:
            if (r9 >= 0) goto L30
            goto L5f
        L30:
            r11 = 0
        L31:
            if (r9 != 0) goto L34
            goto L60
        L34:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L3d
            if (r11 == 0) goto L3b
            goto L5f
        L3b:
            r1 = 0
            goto L60
        L3d:
            char r5 = r8.charAt(r1)
            if (r11 == 0) goto L4d
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 != 0) goto L4a
            goto L5f
        L4a:
            int r9 = r9 + (-1)
            goto L30
        L4d:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L56
            int r9 = r9 + (-1)
            goto L31
        L56:
            boolean r11 = java.lang.Character.isHighSurrogate(r5)
            if (r11 == 0) goto L5d
            goto L5f
        L5d:
            r11 = 1
            goto L31
        L5f:
            r1 = -1
        L60:
            int r9 = java.lang.Math.max(r10, r0)
            int r10 = r8.length()
            if (r2 < 0) goto La2
            if (r10 >= r2) goto L6d
            goto La2
        L6d:
            if (r9 >= 0) goto L70
            goto La2
        L70:
            r11 = 0
        L71:
            if (r9 != 0) goto L75
            r10 = r2
            goto La3
        L75:
            if (r2 < r10) goto L7a
            if (r11 == 0) goto La3
            goto La2
        L7a:
            char r5 = r8.charAt(r2)
            if (r11 == 0) goto L8c
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 != 0) goto L87
            goto La2
        L87:
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L70
        L8c:
            boolean r6 = java.lang.Character.isSurrogate(r5)
            if (r6 != 0) goto L97
            int r9 = r9 + (-1)
            int r2 = r2 + 1
            goto L71
        L97:
            boolean r11 = java.lang.Character.isLowSurrogate(r5)
            if (r11 == 0) goto L9e
            goto La2
        L9e:
            int r2 = r2 + 1
            r11 = 1
            goto L71
        La2:
            r10 = -1
        La3:
            if (r1 == r4) goto La7
            if (r10 != r4) goto Lb6
        La7:
            return r0
        La8:
            int r1 = r1 - r9
            int r1 = java.lang.Math.max(r1, r0)
            int r2 = r2 + r10
            int r9 = r8.length()
            int r10 = java.lang.Math.min(r2, r9)
        Lb6:
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r9 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r9 = r8.getSpans(r1, r10, r9)
            androidx.emoji2.text.EmojiSpan[] r9 = (androidx.emoji2.text.EmojiSpan[]) r9
            if (r9 == 0) goto Lf2
            int r11 = r9.length
            if (r11 <= 0) goto Lf2
            int r11 = r9.length
            r2 = 0
        Lc5:
            if (r2 >= r11) goto Ldc
            r4 = r9[r2]
            int r5 = r8.getSpanStart(r4)
            int r4 = r8.getSpanEnd(r4)
            int r1 = java.lang.Math.min(r5, r1)
            int r10 = java.lang.Math.max(r4, r10)
            int r2 = r2 + 1
            goto Lc5
        Ldc:
            int r9 = java.lang.Math.max(r1, r0)
            int r11 = r8.length()
            int r10 = java.lang.Math.min(r10, r11)
            r7.beginBatchEdit()
            r8.delete(r9, r10)
            r7.endBatchEdit()
            return r3
        Lf2:
            return r0
    }

    public static boolean handleOnKeyDown(@androidx.annotation.NonNull android.text.Editable r3, int r4, @androidx.annotation.NonNull android.view.KeyEvent r5) {
            r0 = 67
            r1 = 1
            r2 = 0
            if (r4 == r0) goto L11
            r0 = 112(0x70, float:1.57E-43)
            if (r4 == r0) goto Lc
            r4 = 0
            goto L15
        Lc:
            boolean r4 = delete(r3, r5, r1)
            goto L15
        L11:
            boolean r4 = delete(r3, r5, r2)
        L15:
            if (r4 == 0) goto L1b
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(r3)
            return r1
        L1b:
            return r2
    }

    private boolean hasGlyph(java.lang.CharSequence r3, int r4, int r5, androidx.emoji2.text.EmojiMetadata r6) {
            r2 = this;
            int r0 = r6.getHasGlyph()
            if (r0 != 0) goto L13
            androidx.emoji2.text.EmojiCompat$GlyphChecker r0 = r2.mGlyphChecker
            short r1 = r6.getSdkAdded()
            boolean r3 = r0.hasGlyph(r3, r4, r5, r1)
            r6.setHasGlyph(r3)
        L13:
            int r3 = r6.getHasGlyph()
            r4 = 2
            if (r3 != r4) goto L1c
            r3 = 1
            goto L1d
        L1c:
            r3 = 0
        L1d:
            return r3
    }

    private static boolean hasInvalidSelection(int r1, int r2) {
            r0 = -1
            if (r1 == r0) goto La
            if (r2 == r0) goto La
            if (r1 == r2) goto L8
            goto La
        L8:
            r1 = 0
            goto Lb
        La:
            r1 = 1
        Lb:
            return r1
    }

    private static boolean hasModifiers(@androidx.annotation.NonNull android.view.KeyEvent r0) {
            int r0 = r0.getMetaState()
            boolean r0 = android.view.KeyEvent.metaStateHasNoModifiers(r0)
            r0 = r0 ^ 1
            return r0
    }

    public final int getEmojiMatch(@androidx.annotation.NonNull java.lang.CharSequence r2) {
            r1 = this;
            androidx.emoji2.text.MetadataRepo r0 = r1.mMetadataRepo
            int r0 = r0.getMetadataVersion()
            int r2 = r1.getEmojiMatch(r2, r0)
            return r2
    }

    public final int getEmojiMatch(@androidx.annotation.NonNull java.lang.CharSequence r12, int r13) {
            r11 = this;
            androidx.emoji2.text.EmojiProcessor$ProcessorSm r0 = new androidx.emoji2.text.EmojiProcessor$ProcessorSm
            androidx.emoji2.text.MetadataRepo r1 = r11.mMetadataRepo
            androidx.emoji2.text.MetadataRepo$Node r1 = r1.getRootNode()
            boolean r2 = r11.mUseEmojiAsDefaultStyle
            int[] r3 = r11.mEmojiAsDefaultStyleExceptions
            r0.<init>(r1, r2, r3)
            int r1 = r12.length()
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
        L17:
            r6 = 2
            r7 = 1
            if (r3 >= r1) goto L53
            int r8 = java.lang.Character.codePointAt(r12, r3)
            int r9 = r0.check(r8)
            androidx.emoji2.text.EmojiMetadata r10 = r0.getCurrentMetadata()
            if (r9 == r7) goto L42
            if (r9 == r6) goto L3c
            r6 = 3
            if (r9 == r6) goto L2f
            goto L48
        L2f:
            androidx.emoji2.text.EmojiMetadata r10 = r0.getFlushMetadata()
            short r6 = r10.getCompatAdded()
            if (r6 > r13) goto L48
            int r4 = r4 + 1
            goto L48
        L3c:
            int r6 = java.lang.Character.charCount(r8)
            int r3 = r3 + r6
            goto L48
        L42:
            int r5 = java.lang.Character.charCount(r8)
            int r3 = r3 + r5
            r5 = 0
        L48:
            if (r10 == 0) goto L17
            short r6 = r10.getCompatAdded()
            if (r6 > r13) goto L17
            int r5 = r5 + 1
            goto L17
        L53:
            if (r4 == 0) goto L56
            return r6
        L56:
            boolean r12 = r0.isInFlushableState()
            if (r12 == 0) goto L67
            androidx.emoji2.text.EmojiMetadata r12 = r0.getCurrentMetadata()
            short r12 = r12.getCompatAdded()
            if (r12 > r13) goto L67
            return r7
        L67:
            if (r5 != 0) goto L6a
            return r2
        L6a:
            return r6
    }

    public final java.lang.CharSequence process(@androidx.annotation.NonNull java.lang.CharSequence r10, @androidx.annotation.IntRange(from = 0) int r11, @androidx.annotation.IntRange(from = 0) int r12, @androidx.annotation.IntRange(from = 0) int r13, boolean r14) {
            r9 = this;
            boolean r0 = r10 instanceof androidx.emoji2.text.SpannableBuilder
            if (r0 == 0) goto La
            r1 = r10
            androidx.emoji2.text.SpannableBuilder r1 = (androidx.emoji2.text.SpannableBuilder) r1
            r1.beginBatchEdit()
        La:
            r1 = 0
            if (r0 != 0) goto L2b
            boolean r2 = r10 instanceof android.text.Spannable     // Catch: java.lang.Throwable -> L12c
            if (r2 == 0) goto L12
            goto L2b
        L12:
            boolean r2 = r10 instanceof android.text.Spanned     // Catch: java.lang.Throwable -> L12c
            if (r2 == 0) goto L33
            r2 = r10
            android.text.Spanned r2 = (android.text.Spanned) r2     // Catch: java.lang.Throwable -> L12c
            int r3 = r11 + (-1)
            int r4 = r12 + 1
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r5 = androidx.emoji2.text.EmojiSpan.class
            int r2 = r2.nextSpanTransition(r3, r4, r5)     // Catch: java.lang.Throwable -> L12c
            if (r2 > r12) goto L33
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r1 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L12c
            r1.<init>(r10)     // Catch: java.lang.Throwable -> L12c
            goto L33
        L2b:
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r1 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L12c
            r2 = r10
            android.text.Spannable r2 = (android.text.Spannable) r2     // Catch: java.lang.Throwable -> L12c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12c
        L33:
            r2 = 0
            if (r1 == 0) goto L61
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r3 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r3 = r1.getSpans(r11, r12, r3)     // Catch: java.lang.Throwable -> L12c
            androidx.emoji2.text.EmojiSpan[] r3 = (androidx.emoji2.text.EmojiSpan[]) r3     // Catch: java.lang.Throwable -> L12c
            if (r3 == 0) goto L61
            int r4 = r3.length     // Catch: java.lang.Throwable -> L12c
            if (r4 <= 0) goto L61
            int r4 = r3.length     // Catch: java.lang.Throwable -> L12c
            r5 = 0
        L45:
            if (r5 >= r4) goto L61
            r6 = r3[r5]     // Catch: java.lang.Throwable -> L12c
            int r7 = r1.getSpanStart(r6)     // Catch: java.lang.Throwable -> L12c
            int r8 = r1.getSpanEnd(r6)     // Catch: java.lang.Throwable -> L12c
            if (r7 == r12) goto L56
            r1.removeSpan(r6)     // Catch: java.lang.Throwable -> L12c
        L56:
            int r11 = java.lang.Math.min(r7, r11)     // Catch: java.lang.Throwable -> L12c
            int r12 = java.lang.Math.max(r8, r12)     // Catch: java.lang.Throwable -> L12c
            int r5 = r5 + 1
            goto L45
        L61:
            if (r11 == r12) goto L123
            int r3 = r10.length()     // Catch: java.lang.Throwable -> L12c
            if (r11 < r3) goto L6b
            goto L123
        L6b:
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r13 == r3) goto L80
            if (r1 == 0) goto L80
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L12c
            java.lang.Class<androidx.emoji2.text.EmojiSpan> r4 = androidx.emoji2.text.EmojiSpan.class
            java.lang.Object[] r3 = r1.getSpans(r2, r3, r4)     // Catch: java.lang.Throwable -> L12c
            androidx.emoji2.text.EmojiSpan[] r3 = (androidx.emoji2.text.EmojiSpan[]) r3     // Catch: java.lang.Throwable -> L12c
            int r3 = r3.length     // Catch: java.lang.Throwable -> L12c
            int r13 = r13 - r3
        L80:
            androidx.emoji2.text.EmojiProcessor$ProcessorSm r3 = new androidx.emoji2.text.EmojiProcessor$ProcessorSm     // Catch: java.lang.Throwable -> L12c
            androidx.emoji2.text.MetadataRepo r4 = r9.mMetadataRepo     // Catch: java.lang.Throwable -> L12c
            androidx.emoji2.text.MetadataRepo$Node r4 = r4.getRootNode()     // Catch: java.lang.Throwable -> L12c
            boolean r5 = r9.mUseEmojiAsDefaultStyle     // Catch: java.lang.Throwable -> L12c
            int[] r6 = r9.mEmojiAsDefaultStyleExceptions     // Catch: java.lang.Throwable -> L12c
            r3.<init>(r4, r5, r6)     // Catch: java.lang.Throwable -> L12c
            int r4 = java.lang.Character.codePointAt(r10, r11)     // Catch: java.lang.Throwable -> L12c
            r2 = r1
            r5 = r4
            r4 = 0
        L96:
            r1 = r11
        L97:
            if (r11 >= r12) goto Le9
            if (r4 >= r13) goto Le9
            int r6 = r3.check(r5)     // Catch: java.lang.Throwable -> L12c
            r7 = 1
            if (r6 == r7) goto Ld7
            r7 = 2
            if (r6 == r7) goto Lcb
            r7 = 3
            if (r6 == r7) goto La9
            goto L97
        La9:
            if (r14 != 0) goto Lb5
            androidx.emoji2.text.EmojiMetadata r6 = r3.getFlushMetadata()     // Catch: java.lang.Throwable -> L12c
            boolean r6 = r9.hasGlyph(r10, r1, r11, r6)     // Catch: java.lang.Throwable -> L12c
            if (r6 != 0) goto L96
        Lb5:
            if (r2 != 0) goto Lc1
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r2 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L12c
            android.text.SpannableString r6 = new android.text.SpannableString     // Catch: java.lang.Throwable -> L12c
            r6.<init>(r10)     // Catch: java.lang.Throwable -> L12c
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L12c
        Lc1:
            androidx.emoji2.text.EmojiMetadata r6 = r3.getFlushMetadata()     // Catch: java.lang.Throwable -> L12c
            r9.addEmoji(r2, r6, r1, r11)     // Catch: java.lang.Throwable -> L12c
            int r4 = r4 + 1
            goto L96
        Lcb:
            int r6 = java.lang.Character.charCount(r5)     // Catch: java.lang.Throwable -> L12c
            int r11 = r11 + r6
            if (r11 >= r12) goto L97
            int r5 = java.lang.Character.codePointAt(r10, r11)     // Catch: java.lang.Throwable -> L12c
            goto L97
        Ld7:
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch: java.lang.Throwable -> L12c
            int r11 = java.lang.Character.charCount(r11)     // Catch: java.lang.Throwable -> L12c
            int r1 = r1 + r11
            if (r1 >= r12) goto Le7
            int r11 = java.lang.Character.codePointAt(r10, r1)     // Catch: java.lang.Throwable -> L12c
            r5 = r11
        Le7:
            r11 = r1
            goto L97
        Le9:
            boolean r12 = r3.isInFlushableState()     // Catch: java.lang.Throwable -> L12c
            if (r12 == 0) goto L10c
            if (r4 >= r13) goto L10c
            if (r14 != 0) goto Lfd
            androidx.emoji2.text.EmojiMetadata r12 = r3.getCurrentMetadata()     // Catch: java.lang.Throwable -> L12c
            boolean r12 = r9.hasGlyph(r10, r1, r11, r12)     // Catch: java.lang.Throwable -> L12c
            if (r12 != 0) goto L10c
        Lfd:
            if (r2 != 0) goto L105
            androidx.emoji2.text.UnprecomputeTextOnModificationSpannable r12 = new androidx.emoji2.text.UnprecomputeTextOnModificationSpannable     // Catch: java.lang.Throwable -> L12c
            r12.<init>(r10)     // Catch: java.lang.Throwable -> L12c
            r2 = r12
        L105:
            androidx.emoji2.text.EmojiMetadata r12 = r3.getCurrentMetadata()     // Catch: java.lang.Throwable -> L12c
            r9.addEmoji(r2, r12, r1, r11)     // Catch: java.lang.Throwable -> L12c
        L10c:
            if (r2 == 0) goto L11a
            android.text.Spannable r11 = r2.getUnwrappedSpannable()     // Catch: java.lang.Throwable -> L12c
            if (r0 == 0) goto L119
            androidx.emoji2.text.SpannableBuilder r10 = (androidx.emoji2.text.SpannableBuilder) r10
            r10.endBatchEdit()
        L119:
            return r11
        L11a:
            if (r0 == 0) goto L122
            r11 = r10
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        L122:
            return r10
        L123:
            if (r0 == 0) goto L12b
            r11 = r10
            androidx.emoji2.text.SpannableBuilder r11 = (androidx.emoji2.text.SpannableBuilder) r11
            r11.endBatchEdit()
        L12b:
            return r10
        L12c:
            r11 = move-exception
            if (r0 == 0) goto L134
            androidx.emoji2.text.SpannableBuilder r10 = (androidx.emoji2.text.SpannableBuilder) r10
            r10.endBatchEdit()
        L134:
            throw r11
    }
}
