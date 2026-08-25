package androidx.emoji2.text;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.AnyThread
@androidx.annotation.RequiresApi(19)
public final class MetadataRepo {
    private static final int DEFAULT_ROOT_SIZE = 1024;
    private static final java.lang.String S_TRACE_CREATE_REPO = "EmojiCompat.MetadataRepo.create";

    @androidx.annotation.NonNull
    private final char[] mEmojiCharArray;

    @androidx.annotation.NonNull
    private final androidx.emoji2.text.flatbuffer.MetadataList mMetadataList;

    @androidx.annotation.NonNull
    private final androidx.emoji2.text.MetadataRepo.Node mRootNode;

    @androidx.annotation.NonNull
    private final android.graphics.Typeface mTypeface;

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class Node {
        private final android.util.SparseArray<androidx.emoji2.text.MetadataRepo.Node> mChildren;
        private androidx.emoji2.text.EmojiMetadata mData;

        private Node() {
                r2 = this;
                r2.<init>()
                android.util.SparseArray r0 = new android.util.SparseArray
                r1 = 1
                r0.<init>(r1)
                r2.mChildren = r0
                return
        }

        public Node(int r2) {
                r1 = this;
                r1.<init>()
                android.util.SparseArray r2 = new android.util.SparseArray
                r0 = 1024(0x400, float:1.435E-42)
                r2.<init>(r0)
                r1.mChildren = r2
                return
        }

        public final androidx.emoji2.text.MetadataRepo.Node get(int r2) {
                r1 = this;
                android.util.SparseArray<androidx.emoji2.text.MetadataRepo$Node> r0 = r1.mChildren
                if (r0 != 0) goto L6
                r2 = 0
                goto Lc
            L6:
                java.lang.Object r2 = r0.get(r2)
                androidx.emoji2.text.MetadataRepo$Node r2 = (androidx.emoji2.text.MetadataRepo.Node) r2
            Lc:
                return r2
        }

        public final androidx.emoji2.text.EmojiMetadata getData() {
                r1 = this;
                androidx.emoji2.text.EmojiMetadata r0 = r1.mData
                return r0
        }

        public final void put(@androidx.annotation.NonNull androidx.emoji2.text.EmojiMetadata r4, int r5, int r6) {
                r3 = this;
                int r0 = r4.getCodepointAt(r5)
                android.util.SparseArray<androidx.emoji2.text.MetadataRepo$Node> r1 = r3.mChildren
                if (r1 != 0) goto La
                r0 = 0
                goto L10
            La:
                java.lang.Object r0 = r1.get(r0)
                androidx.emoji2.text.MetadataRepo$Node r0 = (androidx.emoji2.text.MetadataRepo.Node) r0
            L10:
                if (r0 != 0) goto L20
                androidx.emoji2.text.MetadataRepo$Node r0 = new androidx.emoji2.text.MetadataRepo$Node
                r0.<init>()
                android.util.SparseArray<androidx.emoji2.text.MetadataRepo$Node> r1 = r3.mChildren
                int r2 = r4.getCodepointAt(r5)
                r1.put(r2, r0)
            L20:
                if (r6 <= r5) goto L28
                int r5 = r5 + 1
                r0.put(r4, r5, r6)
                goto L2a
            L28:
                r0.mData = r4
            L2a:
                return
        }
    }

    private MetadataRepo(@androidx.annotation.NonNull android.graphics.Typeface r2, @androidx.annotation.NonNull androidx.emoji2.text.flatbuffer.MetadataList r3) {
            r1 = this;
            r1.<init>()
            r1.mTypeface = r2
            r1.mMetadataList = r3
            androidx.emoji2.text.MetadataRepo$Node r2 = new androidx.emoji2.text.MetadataRepo$Node
            r0 = 1024(0x400, float:1.435E-42)
            r2.<init>(r0)
            r1.mRootNode = r2
            int r2 = r3.listLength()
            int r2 = r2 * 2
            char[] r2 = new char[r2]
            r1.mEmojiCharArray = r2
            r1.constructIndex(r3)
            return
    }

    private void constructIndex(androidx.emoji2.text.flatbuffer.MetadataList r7) {
            r6 = this;
            int r7 = r7.listLength()
            r0 = 0
            r1 = 0
        L6:
            if (r1 >= r7) goto L39
            androidx.emoji2.text.EmojiMetadata r2 = new androidx.emoji2.text.EmojiMetadata
            r2.<init>(r6, r1)
            int r3 = r2.getId()
            char[] r4 = r6.mEmojiCharArray
            int r5 = r1 * 2
            java.lang.Character.toChars(r3, r4, r5)
            java.lang.String r3 = "emoji metadata cannot be null"
            androidx.core.util.Preconditions.checkNotNull(r2, r3)
            int r3 = r2.getCodepointsLength()
            r4 = 1
            if (r3 <= 0) goto L26
            r3 = 1
            goto L27
        L26:
            r3 = 0
        L27:
            java.lang.String r5 = "invalid metadata codepoint length"
            androidx.core.util.Preconditions.checkArgument(r3, r5)
            androidx.emoji2.text.MetadataRepo$Node r3 = r6.mRootNode
            int r5 = r2.getCodepointsLength()
            int r5 = r5 - r4
            r3.put(r2, r0, r5)
            int r1 = r1 + 1
            goto L6
        L39:
            return
    }

    @androidx.annotation.NonNull
    public static androidx.emoji2.text.MetadataRepo create(@androidx.annotation.NonNull android.content.res.AssetManager r2, @androidx.annotation.NonNull java.lang.String r3) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L29
            android.graphics.Typeface r0 = android.graphics.Typeface.createFromAsset(r2, r3)     // Catch: java.lang.Throwable -> L29
            androidx.emoji2.text.MetadataRepo r1 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L29
            java.io.InputStream r2 = r2.open(r3)     // Catch: java.lang.Throwable -> L29
            androidx.emoji2.text.flatbuffer.MetadataList r3 = androidx.emoji2.text.MetadataListReader.read(r2)     // Catch: java.lang.Throwable -> L1d
            r2.close()     // Catch: java.lang.Throwable -> L29
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> L29
            androidx.core.os.TraceCompat.endSection()
            return r1
        L1d:
            r3 = move-exception
            if (r2 == 0) goto L28
            r2.close()     // Catch: java.lang.Throwable -> L24
            goto L28
        L24:
            r2 = move-exception
            r3.addSuppressed(r2)     // Catch: java.lang.Throwable -> L29
        L28:
            throw r3     // Catch: java.lang.Throwable -> L29
        L29:
            r2 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r2
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.TESTS})
    public static androidx.emoji2.text.MetadataRepo create(@androidx.annotation.NonNull android.graphics.Typeface r2) {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L13
            androidx.emoji2.text.MetadataRepo r0 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L13
            androidx.emoji2.text.flatbuffer.MetadataList r1 = new androidx.emoji2.text.flatbuffer.MetadataList     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L13
            androidx.core.os.TraceCompat.endSection()
            return r0
        L13:
            r2 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r2
    }

    @androidx.annotation.NonNull
    public static androidx.emoji2.text.MetadataRepo create(@androidx.annotation.NonNull android.graphics.Typeface r1, @androidx.annotation.NonNull java.io.InputStream r2) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.MetadataRepo r0 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.flatbuffer.MetadataList r2 = androidx.emoji2.text.MetadataListReader.read(r2)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
            androidx.core.os.TraceCompat.endSection()
            return r0
        L12:
            r1 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r1
    }

    @androidx.annotation.NonNull
    public static androidx.emoji2.text.MetadataRepo create(@androidx.annotation.NonNull android.graphics.Typeface r1, @androidx.annotation.NonNull java.nio.ByteBuffer r2) throws java.io.IOException {
            java.lang.String r0 = "EmojiCompat.MetadataRepo.create"
            androidx.core.os.TraceCompat.beginSection(r0)     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.MetadataRepo r0 = new androidx.emoji2.text.MetadataRepo     // Catch: java.lang.Throwable -> L12
            androidx.emoji2.text.flatbuffer.MetadataList r2 = androidx.emoji2.text.MetadataListReader.read(r2)     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
            androidx.core.os.TraceCompat.endSection()
            return r0
        L12:
            r1 = move-exception
            androidx.core.os.TraceCompat.endSection()
            throw r1
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public char[] getEmojiCharArray() {
            r1 = this;
            char[] r0 = r1.mEmojiCharArray
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public androidx.emoji2.text.flatbuffer.MetadataList getMetadataList() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r1.mMetadataList
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public final int getMetadataVersion() {
            r1 = this;
            androidx.emoji2.text.flatbuffer.MetadataList r0 = r1.mMetadataList
            int r0 = r0.version()
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public final androidx.emoji2.text.MetadataRepo.Node getRootNode() {
            r1 = this;
            androidx.emoji2.text.MetadataRepo$Node r0 = r1.mRootNode
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public final android.graphics.Typeface getTypeface() {
            r1 = this;
            android.graphics.Typeface r0 = r1.mTypeface
            return r0
    }
}
