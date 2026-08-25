package kotlin.io;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u000b\u001a\u00020\f*\u00020\bH\u0002¢\u0006\u0002\b\r\u001a\u001c\u0010\u000e\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\fH\u0000\u001a\f\u0010\u0011\u001a\u00020\u0012*\u00020\u0002H\u0000\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003\"\u0018\u0010\u0004\u001a\u00020\u0002*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u0018\u0010\u0007\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"isRooted", "", "Ljava/io/File;", "(Ljava/io/File;)Z", "root", "getRoot", "(Ljava/io/File;)Ljava/io/File;", "rootName", "", "getRootName", "(Ljava/io/File;)Ljava/lang/String;", "getRootLength", "", "getRootLength$FilesKt__FilePathComponentsKt", "subPath", "beginIndex", "endIndex", "toComponents", "Lkotlin/io/FilePathComponents;", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xi = 49, xs = "kotlin/io/FilesKt")
class FilesKt__FilePathComponentsKt {
    public FilesKt__FilePathComponentsKt() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File getRoot(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = getRootName(r1)
            r0.<init>(r1)
            return r0
    }

    private static final int getRootLength$FilesKt__FilePathComponentsKt(java.lang.String r5) {
            char r0 = java.io.File.separatorChar
            r1 = 0
            r2 = 4
            int r0 = kotlin.text.StringsKt.indexOf$default(r5, r0, r1, r2)
            r3 = 1
            if (r0 != 0) goto L31
            int r0 = r5.length()
            if (r0 <= r3) goto L30
            char r0 = r5.charAt(r3)
            char r1 = java.io.File.separatorChar
            if (r0 != r1) goto L30
            r0 = 2
            int r0 = kotlin.text.StringsKt.indexOf$default(r5, r1, r0, r2)
            if (r0 < 0) goto L30
            char r1 = java.io.File.separatorChar
            int r0 = r0 + r3
            int r0 = kotlin.text.StringsKt.indexOf$default(r5, r1, r0, r2)
            if (r0 < 0) goto L2b
            int r0 = r0 + r3
            return r0
        L2b:
            int r5 = r5.length()
            return r5
        L30:
            return r3
        L31:
            r2 = 58
            if (r0 <= 0) goto L3f
            int r4 = r0 + (-1)
            char r4 = r5.charAt(r4)
            if (r4 != r2) goto L3f
            int r0 = r0 + r3
            return r0
        L3f:
            r3 = -1
            if (r0 != r3) goto L4d
            boolean r0 = kotlin.text.StringsKt.endsWith$default(r5, r2)
            if (r0 == 0) goto L4d
            int r5 = r5.length()
            return r5
        L4d:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String getRootName(@org.jetbrains.annotations.NotNull java.io.File r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            java.lang.String r0 = r2.getPath()
            java.lang.String r1 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.String r2 = r2.getPath()
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r1)
            int r2 = getRootLength$FilesKt__FilePathComponentsKt(r2)
            r1 = 0
            java.lang.String r2 = r0.substring(r1, r2)
            java.lang.String r0 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r0)
            return r2
    }

    public static final boolean isRooted(@org.jetbrains.annotations.NotNull java.io.File r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r1 = r1.getPath()
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r0)
            int r1 = getRootLength$FilesKt__FilePathComponentsKt(r1)
            if (r1 <= 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.io.File subPath(@org.jetbrains.annotations.NotNull java.io.File r1, int r2, int r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            kotlin.io.FilePathComponents r1 = toComponents(r1)
            java.io.File r1 = r1.subPath(r2, r3)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.io.FilePathComponents toComponents(@org.jetbrains.annotations.NotNull java.io.File r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r4 = r4.getPath()
            java.lang.String r0 = "path"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            int r0 = getRootLength$FilesKt__FilePathComponentsKt(r4)
            r1 = 0
            java.lang.String r2 = r4.substring(r1, r0)
            java.lang.String r3 = "this as java.lang.String…ing(startIndex, endIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r4 = r4.substring(r0)
            java.lang.String r0 = "this as java.lang.String).substring(startIndex)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r0)
            int r0 = r4.length()
            r3 = 1
            if (r0 != 0) goto L30
            r0 = 1
            goto L31
        L30:
            r0 = 0
        L31:
            if (r0 == 0) goto L38
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            goto L65
        L38:
            char[] r0 = new char[r3]
            char r3 = java.io.File.separatorChar
            r0[r1] = r3
            java.util.List r4 = kotlin.text.StringsKt.split$default(r4, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r4)
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L4f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L64
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.io.File r3 = new java.io.File
            r3.<init>(r1)
            r0.add(r3)
            goto L4f
        L64:
            r4 = r0
        L65:
            kotlin.io.FilePathComponents r0 = new kotlin.io.FilePathComponents
            java.io.File r1 = new java.io.File
            r1.<init>(r2)
            r0.<init>(r1, r4)
            return r0
    }
}
