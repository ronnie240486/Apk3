package androidx.core.view;

/* JADX INFO: compiled from: Menu.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\b\u0003\u001a\u0015\u0010\n\u001a\u00020\u000b*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\u0002\u001a3\u0010\r\u001a\u00020\u000e*\u00020\u00032!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0010H\u0086\bø\u0001\u0000\u001aH\u0010\u0013\u001a\u00020\u000e*\u00020\u000326\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u000e0\u0014H\u0086\bø\u0001\u0000\u001a\u0015\u0010\u0016\u001a\u00020\u0002*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\n\u001a\r\u0010\u0017\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\r\u0010\u0018\u001a\u00020\u000b*\u00020\u0003H\u0086\b\u001a\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a*\u00020\u0003H\u0086\u0002\u001a\u0015\u0010\u001b\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0086\n\u001a\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0007H\u0086\b\"\u001b\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\"\u0016\u0010\u0006\u001a\u00020\u0007*\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001d"}, d2 = {"children", "Lkotlin/sequences/Sequence;", "Landroid/view/MenuItem;", "Landroid/view/Menu;", "getChildren", "(Landroid/view/Menu;)Lkotlin/sequences/Sequence;", "size", "", "getSize", "(Landroid/view/Menu;)I", "contains", "", "item", "forEach", "", "action", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function2;", "index", "get", "isEmpty", "isNotEmpty", "iterator", "", "minusAssign", "removeItemAt", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class MenuKt {

    /* JADX INFO: renamed from: androidx.core.view.MenuKt$iterator$1, reason: invalid class name */
    /* JADX INFO: compiled from: Menu.kt */
    @kotlin.Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0005\u001a\u00020\u0006H\u0096\u0002J\t\u0010\u0007\u001a\u00020\u0002H\u0096\u0002J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"androidx/core/view/MenuKt$iterator$1", "", "Landroid/view/MenuItem;", "index", "", "hasNext", "", "next", "remove", "", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class AnonymousClass1 implements java.util.Iterator<android.view.MenuItem>, kotlin.jvm.internal.markers.KMutableIterator {
        public final /* synthetic */ android.view.Menu $this_iterator;
        private int index;

        public AnonymousClass1(android.view.Menu r1) {
                r0 = this;
                r0.$this_iterator = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.index
                android.view.Menu r1 = r2.$this_iterator
                int r1 = r1.size()
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
        public android.view.MenuItem next() {
                r3 = this;
                android.view.Menu r0 = r3.$this_iterator
                int r1 = r3.index
                int r2 = r1 + 1
                r3.index = r2
                android.view.MenuItem r0 = r0.getItem(r1)
                if (r0 == 0) goto Lf
                return r0
            Lf:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ android.view.MenuItem next() {
                r1 = this;
                android.view.MenuItem r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                android.view.Menu r0 = r3.$this_iterator
                int r1 = r3.index
                int r1 = r1 + (-1)
                r3.index = r1
                android.view.MenuItem r1 = r0.getItem(r1)
                if (r1 == 0) goto L1d
                java.lang.String r2 = "getItem(index)"
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                int r1 = r1.getItemId()
                r0.removeItem(r1)
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                goto L1e
            L1d:
                r0 = 0
            L1e:
                if (r0 == 0) goto L21
                return
            L21:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull android.view.Menu r4, @org.jetbrains.annotations.NotNull android.view.MenuItem r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4.size()
            r1 = 0
            r2 = 0
        L10:
            if (r2 >= r0) goto L21
            android.view.MenuItem r3 = r4.getItem(r2)
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual(r3, r5)
            if (r3 == 0) goto L1e
            r4 = 1
            return r4
        L1e:
            int r2 = r2 + 1
            goto L10
        L21:
            return r1
    }

    public static final void forEach(@org.jetbrains.annotations.NotNull android.view.Menu r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.view.MenuItem, kotlin.Unit> r5) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            int r0 = r4.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L20
            android.view.MenuItem r2 = r4.getItem(r1)
            java.lang.String r3 = "getItem(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            r5.invoke(r2)
            int r1 = r1 + 1
            goto Lf
        L20:
            return
    }

    public static final void forEachIndexed(@org.jetbrains.annotations.NotNull android.view.Menu r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super android.view.MenuItem, kotlin.Unit> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            int r0 = r5.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L24
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.view.MenuItem r3 = r5.getItem(r1)
            java.lang.String r4 = "getItem(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r4)
            r6.invoke(r2, r3)
            int r1 = r1 + 1
            goto Lf
        L24:
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final android.view.MenuItem get(@org.jetbrains.annotations.NotNull android.view.Menu r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.view.MenuItem r1 = r1.getItem(r2)
            java.lang.String r2 = "getItem(index)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlin.sequences.Sequence<android.view.MenuItem> getChildren(@org.jetbrains.annotations.NotNull android.view.Menu r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.view.MenuKt$children$1 r0 = new androidx.core.view.MenuKt$children$1
            r0.<init>(r1)
            return r0
    }

    public static final int getSize(@org.jetbrains.annotations.NotNull android.view.Menu r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            return r1
    }

    public static final boolean isEmpty(@org.jetbrains.annotations.NotNull android.view.Menu r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            if (r1 != 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    public static final boolean isNotEmpty(@org.jetbrains.annotations.NotNull android.view.Menu r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            int r1 = r1.size()
            if (r1 == 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final java.util.Iterator<android.view.MenuItem> iterator(@org.jetbrains.annotations.NotNull android.view.Menu r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            androidx.core.view.MenuKt$iterator$1 r0 = new androidx.core.view.MenuKt$iterator$1
            r0.<init>(r1)
            return r0
    }

    public static final void minusAssign(@org.jetbrains.annotations.NotNull android.view.Menu r1, @org.jetbrains.annotations.NotNull android.view.MenuItem r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            java.lang.String r0 = "item"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            int r2 = r2.getItemId()
            r1.removeItem(r2)
            return
    }

    public static final void removeItemAt(@org.jetbrains.annotations.NotNull android.view.Menu r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r0)
            android.view.MenuItem r2 = r1.getItem(r2)
            if (r2 == 0) goto L15
            int r2 = r2.getItemId()
            r1.removeItem(r2)
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L16
        L15:
            r1 = 0
        L16:
            if (r1 == 0) goto L19
            return
        L19:
            java.lang.IndexOutOfBoundsException r1 = new java.lang.IndexOutOfBoundsException
            r1.<init>()
            throw r1
    }
}
