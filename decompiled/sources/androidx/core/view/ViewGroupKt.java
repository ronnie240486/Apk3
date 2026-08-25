package androidx.core.view;

/* JADX INFO: compiled from: ViewGroup.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0015\u0010\u0010\u001a\u00020\u0011*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a3\u0010\u0013\u001a\u00020\u0014*\u00020\u00032!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u0016H\u0086\bø\u0001\u0000\u001aH\u0010\u0019\u001a\u00020\u0014*\u00020\u000326\u0010\u0015\u001a2\u0012\u0013\u0012\u00110\r¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00140\u001aH\u0086\bø\u0001\u0000\u001a\u0015\u0010\u001c\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\rH\u0086\u0002\u001a\r\u0010\u001d\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\r\u0010\u001e\u001a\u00020\u0011*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 *\u00020\u0003H\u0086\u0002\u001a\u0015\u0010!\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\"\u001a\u00020\u0014*\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0086\n\u001a\u0017\u0010#\u001a\u00020\u0014*\u00020$2\b\b\u0001\u0010\f\u001a\u00020\rH\u0086\b\u001a5\u0010%\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010&\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010(\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0086\b\u001a5\u0010*\u001a\u00020\u0014*\u00020$2\b\b\u0003\u0010+\u001a\u00020\r2\b\b\u0003\u0010'\u001a\u00020\r2\b\b\u0003\u0010,\u001a\u00020\r2\b\b\u0003\u0010)\u001a\u00020\rH\u0087\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005\"\u0016\u0010\b\u001a\u00020\t*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u0016\u0010\f\u001a\u00020\r*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006-"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "Landroid/view/ViewGroup;", "getChildren", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "descendants", "getDescendants", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "(Landroid/view/ViewGroup;)Lkotlin/ranges/IntRange;", "size", "", "getSize", "(Landroid/view/ViewGroup;)I", "contains", "", "view", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "plusAssign", "setMargins", "Landroid/view/ViewGroup$MarginLayoutParams;", "updateMargins", "left", "top", "right", "bottom", "updateMarginsRelative", "start", "end", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ViewGroupKt {

    /* JADX INFO: renamed from: androidx.core.view.ViewGroupKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: ViewGroup.kt */
    /* JADX INFO: loaded from: classes3.dex */
    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/ViewGroupKt$iterator$1", "", "Landroid/view/View;", "index", "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<android.view.View>, kotlin.jvm.internal.markers.KMutableIterator {
        public final /* synthetic */ android.view.ViewGroup $this_iterator;
        private int index;

        public AnonymousClass1(android.view.ViewGroup r1) {
                r0 = this;
                r0.$this_iterator = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                android.view.ViewGroup r1 = r2.$this_iterator
                int r1 = r1.getChildCount()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Iterator
        @org.jetbrains.annotations.NotNull
        public android.view.View next() {
                r3 = this;
                android.view.ViewGroup r0 = r3.$this_iterator
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                android.view.View r0 = r0.getChildAt(r1)
                if (r0 == 0) goto Lf
                return r0
            Lf:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ android.view.View next() {
                r1 = this;
                android.view.View r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                android.view.ViewGroup r0 = r2.$this_iterator
                int r1 = r2.index
                int r1 = r1 + (-1)
                r2.index = r1
                r0.removeViewAt(r1)
                return
        }
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1, @org.jetbrains.annotations.NotNull android.view.View r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r1 = r1.indexOfChild(r2)
            r2 = -1
            if (r1 == r2) goto L14
            r1 = 1
            goto L15
        L14:
            r1 = 0
        L15:
            return r1
    }

    public static final void forEach(@org.jetbrains.annotations.NotNull android.view.ViewGroup r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.View, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4.getChildCount()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L20
            android.view.View r2 = r4.getChildAt(r1)
            java.lang.String r3 = "getChildAt(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r5.invoke(r2)
            int r1 = r1 + 1
            goto Lf
        L20:
            return
    }

    public static final void forEachIndexed(@org.jetbrains.annotations.NotNull android.view.ViewGroup r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.View, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.getChildCount()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.view.View r3 = r5.getChildAt(r1)
            java.lang.String r4 = "getChildAt(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.invoke(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L24:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final android.view.View get(@org.jetbrains.annotations.NotNull android.view.ViewGroup r3, int r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            android.view.View r0 = r3.getChildAt(r4)
            if (r0 == 0) goto Lc
            return r0
        Lc:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.String r1 = "Index: "
            java.lang.String r2 = ", Size: "
            java.lang.StringBuilder r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m23m(r1, r4, r2)
            int r3 = r3.getChildCount()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<android.view.View> getChildren(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.view.ViewGroupKt$children$1 r0 = new androidx.core.view.ViewGroupKt$children$1
            r0.<init>(r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<android.view.View> getDescendants(@org.jetbrains.annotations.NotNull android.view.ViewGroup r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            androidx.core.view.ViewGroupKt$descendants$1 r0 = new androidx.core.view.ViewGroupKt$descendants$1
            r1 = 0
            r0.<init>(r2, r1)
            kotlin.sequences.Sequence r2 = kotlin.sequences.SequencesKt.sequence(r0)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.ranges.IntRange getIndices(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.getChildCount()
            r0 = 0
            kotlin.ranges.IntRange r1 = kotlin.ranges.RangesKt.until(r0, r1)
            return r1
    }

    public static final int getSize(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.getChildCount()
            return r1
    }

    public static final boolean isEmpty(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.getChildCount()
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public static final boolean isNotEmpty(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.getChildCount()
            if (r1 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Iterator<android.view.View> iterator(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.view.ViewGroupKt$iterator$1 r0 = new androidx.core.view.ViewGroupKt$iterator$1
            r0.<init>(r1)
            return r0
    }

    public static final void minusAssign(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1, @org.jetbrains.annotations.NotNull android.view.View r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.removeView(r2)
            return
    }

    public static final void plusAssign(@org.jetbrains.annotations.NotNull android.view.ViewGroup r1, @org.jetbrains.annotations.NotNull android.view.View r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            r1.addView(r2)
            return
    }

    public static final void setMargins(@org.jetbrains.annotations.NotNull android.view.ViewGroup.MarginLayoutParams r1, @androidx.annotation.Px int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setMargins(r2, r2, r2, r2)
            return
    }

    public static final void updateMargins(@org.jetbrains.annotations.NotNull android.view.ViewGroup.MarginLayoutParams r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4, @androidx.annotation.Px int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setMargins(r2, r3, r4, r5)
            return
    }

    public static /* synthetic */ void updateMargins$default(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            int r1 = r0.leftMargin
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            int r2 = r0.topMargin
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.rightMargin
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            int r4 = r0.bottomMargin
        L18:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            r0.setMargins(r1, r2, r3, r4)
            return
    }

    @androidx.annotation.RequiresApi(17)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    public static final void updateMarginsRelative(@org.jetbrains.annotations.NotNull android.view.ViewGroup.MarginLayoutParams r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4, @androidx.annotation.Px int r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            r1.setMarginStart(r2)
            r1.topMargin = r3
            r1.setMarginEnd(r4)
            r1.bottomMargin = r5
            return
    }

    public static /* synthetic */ void updateMarginsRelative$default(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getMarginStart()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            int r2 = r0.topMargin
        Le:
            r6 = r5 & 4
            if (r6 == 0) goto L16
            int r3 = r0.getMarginEnd()
        L16:
            r5 = r5 & 8
            if (r5 == 0) goto L1c
            int r4 = r0.bottomMargin
        L1c:
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r5)
            r0.setMarginStart(r1)
            r0.topMargin = r2
            r0.setMarginEnd(r3)
            r0.bottomMargin = r4
            return
    }
}
