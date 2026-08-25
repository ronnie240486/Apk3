package kotlinx.coroutines.selects;

/* JADX INFO: compiled from: SelectUnbiased.kt */
/* JADX INFO: loaded from: classes2.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0002\u0010\u0005J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0013H\u0001J\n\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0001J6\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u001c\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001aH\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ3\u0010\u001c\u001a\u00020\t*\u00020\u001d2\u001c\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001aH\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010\u001eJE\u0010\u001c\u001a\u00020\t\"\u0004\b\u0001\u0010\u001f*\b\u0012\u0004\u0012\u0002H\u001f0 2\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150!H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010\"JY\u0010\u001c\u001a\u00020\t\"\u0004\b\u0001\u0010#\"\u0004\b\u0002\u0010\u001f*\u000e\u0012\u0004\u0012\u0002H#\u0012\u0004\u0012\u0002H\u001f0$2\u0006\u0010%\u001a\u0002H#2\"\u0010\u0019\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00150!H\u0096\u0002ø\u0001\u0000¢\u0006\u0002\u0010&R-\u0010\u0006\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b`\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lkotlinx/coroutines/selects/UnbiasedSelectBuilderImpl;", "R", "Lkotlinx/coroutines/selects/SelectBuilder;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/Continuation;)V", "clauses", "Ljava/util/ArrayList;", "Lkotlin/Function0;", "", "Lkotlin/collections/ArrayList;", "getClauses", "()Ljava/util/ArrayList;", "instance", "Lkotlinx/coroutines/selects/SelectBuilderImpl;", "getInstance", "()Lkotlinx/coroutines/selects/SelectBuilderImpl;", "handleBuilderException", "e", "", "initSelectResult", "", "onTimeout", "timeMillis", "", "block", "Lkotlin/Function1;", "(JLkotlin/jvm/functions/Function1;)V", "invoke", "Lkotlinx/coroutines/selects/SelectClause0;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
@kotlin.PublishedApi
public final class UnbiasedSelectBuilderImpl<R> implements kotlinx.coroutines.selects.SelectBuilder<R> {

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> clauses;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.selects.SelectBuilderImpl<R> instance;





    public UnbiasedSelectBuilderImpl(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super R> r2) {
            r1 = this;
            r1.<init>()
            kotlinx.coroutines.selects.SelectBuilderImpl r0 = new kotlinx.coroutines.selects.SelectBuilderImpl
            r0.<init>(r2)
            r1.instance = r0
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.clauses = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> getClauses() {
            r1 = this;
            java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r1.clauses
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.selects.SelectBuilderImpl<R> getInstance() {
            r1 = this;
            kotlinx.coroutines.selects.SelectBuilderImpl<R> r0 = r1.instance
            return r0
    }

    @kotlin.PublishedApi
    public final void handleBuilderException(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.selects.SelectBuilderImpl<R> r0 = r1.instance
            r0.handleBuilderException(r2)
            return
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object initSelectResult() {
            r2 = this;
            kotlinx.coroutines.selects.SelectBuilderImpl<R> r0 = r2.instance
            boolean r0 = r0.isSelected()
            if (r0 != 0) goto L29
            java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r2.clauses     // Catch: java.lang.Throwable -> L23
            java.util.Collections.shuffle(r0)     // Catch: java.lang.Throwable -> L23
            java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r2.clauses     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L23
        L13:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L29
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L23
            kotlin.jvm.functions.Function0 r1 = (kotlin.jvm.functions.Function0) r1     // Catch: java.lang.Throwable -> L23
            r1.invoke()     // Catch: java.lang.Throwable -> L23
            goto L13
        L23:
            r0 = move-exception
            kotlinx.coroutines.selects.SelectBuilderImpl<R> r1 = r2.instance
            r1.handleBuilderException(r0)
        L29:
            kotlinx.coroutines.selects.SelectBuilderImpl<R> r0 = r2.instance
            java.lang.Object r0 = r0.getResult()
            return r0
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectClause0 r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r2 = this;
            java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r2.clauses
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$1 r1 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$1
            r1.<init>(r3, r2, r4)
            r0.add(r1)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <Q> void invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectClause1<? extends Q> r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r4) {
            r2 = this;
            java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r2.clauses
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$2 r1 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$2
            r1.<init>(r3, r2, r4)
            r0.add(r1)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r3, P r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
            java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r2.clauses
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$3 r1 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$invoke$3
            r1.<init>(r3, r2, r4, r5)
            r0.add(r1)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public <P, Q> void invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.SelectClause2<? super P, ? extends Q> r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super Q, ? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r2) {
            r0 = this;
            kotlinx.coroutines.selects.SelectBuilder.DefaultImpls.invoke(r0, r1, r2)
            return
    }

    @Override // kotlinx.coroutines.selects.SelectBuilder
    public void onTimeout(long r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super R>, ? extends java.lang.Object> r5) {
            r2 = this;
            java.util.ArrayList<kotlin.jvm.functions.Function0<kotlin.Unit>> r0 = r2.clauses
            kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$onTimeout$1 r1 = new kotlinx.coroutines.selects.UnbiasedSelectBuilderImpl$onTimeout$1
            r1.<init>(r2, r3, r5)
            r0.add(r1)
            return
    }
}
