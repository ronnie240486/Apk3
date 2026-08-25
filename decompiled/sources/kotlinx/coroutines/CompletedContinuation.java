package kotlinx.coroutines;

/* JADX INFO: compiled from: CancellableContinuationImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001BZ\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003J&\u0010\u0015\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003J`\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042%\b\u0002\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u001a\u0010\u001d\u001a\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001f2\u0006\u0010\n\u001a\u00020\u0007J\t\u0010 \u001a\u00020!HÖ\u0001R\u0012\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\f\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R-\u0010\u0005\u001a\u001f\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lkotlinx/coroutines/CompletedContinuation;", "", "result", "cancelHandler", "Lkotlinx/coroutines/CancelHandler;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "", "idempotentResume", "cancelCause", "(Ljava/lang/Object;Lkotlinx/coroutines/CancelHandler;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelled", "", "getCancelled", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "invokeHandlers", "cont", "Lkotlinx/coroutines/CancellableContinuationImpl;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0}, xi = 48)
final class CompletedContinuation {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.Throwable cancelCause;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.CancelHandler cancelHandler;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object idempotentResume;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> onCancellation;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object result;

    public CompletedContinuation(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.CancelHandler r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r3, @org.jetbrains.annotations.Nullable java.lang.Object r4, @org.jetbrains.annotations.Nullable java.lang.Throwable r5) {
            r0 = this;
            r0.<init>()
            r0.result = r1
            r0.cancelHandler = r2
            r0.onCancellation = r3
            r0.idempotentResume = r4
            r0.cancelCause = r5
            return
    }

    public /* synthetic */ CompletedContinuation(java.lang.Object r8, kotlinx.coroutines.CancelHandler r9, kotlin.jvm.functions.Function1 r10, java.lang.Object r11, java.lang.Throwable r12, int r13, kotlin.jvm.internal.DefaultConstructorMarker r14) {
            r7 = this;
            r14 = r13 & 2
            r0 = 0
            if (r14 == 0) goto L7
            r3 = r0
            goto L8
        L7:
            r3 = r9
        L8:
            r9 = r13 & 4
            if (r9 == 0) goto Le
            r4 = r0
            goto Lf
        Le:
            r4 = r10
        Lf:
            r9 = r13 & 8
            if (r9 == 0) goto L15
            r5 = r0
            goto L16
        L15:
            r5 = r11
        L16:
            r9 = r13 & 16
            if (r9 == 0) goto L1c
            r6 = r0
            goto L1d
        L1c:
            r6 = r12
        L1d:
            r1 = r7
            r2 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            return
    }

    public static /* synthetic */ kotlinx.coroutines.CompletedContinuation copy$default(kotlinx.coroutines.CompletedContinuation r3, java.lang.Object r4, kotlinx.coroutines.CancelHandler r5, kotlin.jvm.functions.Function1 r6, java.lang.Object r7, java.lang.Throwable r8, int r9, java.lang.Object r10) {
            r10 = r9 & 1
            if (r10 == 0) goto L6
            java.lang.Object r4 = r3.result
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lc
            kotlinx.coroutines.CancelHandler r5 = r3.cancelHandler
        Lc:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L13
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r6 = r3.onCancellation
        L13:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L1a
            java.lang.Object r7 = r3.idempotentResume
        L1a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L21
            java.lang.Throwable r8 = r3.cancelCause
        L21:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            kotlinx.coroutines.CompletedContinuation r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component1() {
            r1 = this;
            java.lang.Object r0 = r1.result
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.CancelHandler component2() {
            r1 = this;
            kotlinx.coroutines.CancelHandler r0 = r1.cancelHandler
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> component3() {
            r1 = this;
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r1.onCancellation
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component4() {
            r1 = this;
            java.lang.Object r0 = r1.idempotentResume
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Throwable component5() {
            r1 = this;
            java.lang.Throwable r0 = r1.cancelCause
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.CompletedContinuation copy(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.Nullable kotlinx.coroutines.CancelHandler r9, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.Unit> r10, @org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.Nullable java.lang.Throwable r12) {
            r7 = this;
            kotlinx.coroutines.CompletedContinuation r6 = new kotlinx.coroutines.CompletedContinuation
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            return r6
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlinx.coroutines.CompletedContinuation
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlinx.coroutines.CompletedContinuation r5 = (kotlinx.coroutines.CompletedContinuation) r5
            java.lang.Object r1 = r4.result
            java.lang.Object r3 = r5.result
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            kotlinx.coroutines.CancelHandler r1 = r4.cancelHandler
            kotlinx.coroutines.CancelHandler r3 = r5.cancelHandler
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L22
            return r2
        L22:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r4.onCancellation
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r3 = r5.onCancellation
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L2d
            return r2
        L2d:
            java.lang.Object r1 = r4.idempotentResume
            java.lang.Object r3 = r5.idempotentResume
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r3)
            if (r1 != 0) goto L38
            return r2
        L38:
            java.lang.Throwable r1 = r4.cancelCause
            java.lang.Throwable r5 = r5.cancelCause
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r5)
            if (r5 != 0) goto L43
            return r2
        L43:
            return r0
    }

    public final boolean getCancelled() {
            r1 = this;
            java.lang.Throwable r0 = r1.cancelCause
            if (r0 == 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            return r0
    }

    public int hashCode() {
            r3 = this;
            java.lang.Object r0 = r3.result
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            kotlinx.coroutines.CancelHandler r2 = r3.cancelHandler
            if (r2 != 0) goto L13
            r2 = 0
            goto L17
        L13:
            int r2 = r2.hashCode()
        L17:
            int r0 = r0 + r2
            int r0 = r0 * 31
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r2 = r3.onCancellation
            if (r2 != 0) goto L20
            r2 = 0
            goto L24
        L20:
            int r2 = r2.hashCode()
        L24:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Object r2 = r3.idempotentResume
            if (r2 != 0) goto L2d
            r2 = 0
            goto L31
        L2d:
            int r2 = r2.hashCode()
        L31:
            int r0 = r0 + r2
            int r0 = r0 * 31
            java.lang.Throwable r2 = r3.cancelCause
            if (r2 != 0) goto L39
            goto L3d
        L39:
            int r1 = r2.hashCode()
        L3d:
            int r0 = r0 + r1
            return r0
    }

    public final void invokeHandlers(@org.jetbrains.annotations.NotNull kotlinx.coroutines.CancellableContinuationImpl<?> r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r1 = this;
            kotlinx.coroutines.CancelHandler r0 = r1.cancelHandler
            if (r0 != 0) goto L5
            goto L8
        L5:
            r2.callCancelHandler(r0, r3)
        L8:
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r0 = r1.onCancellation
            if (r0 != 0) goto Ld
            goto L10
        Ld:
            r2.callOnCancellation(r0, r3)
        L10:
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "CompletedContinuation(result="
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.Object r1 = r2.result
            r0.append(r1)
            java.lang.String r1 = ", cancelHandler="
            r0.append(r1)
            kotlinx.coroutines.CancelHandler r1 = r2.cancelHandler
            r0.append(r1)
            java.lang.String r1 = ", onCancellation="
            r0.append(r1)
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.Unit> r1 = r2.onCancellation
            r0.append(r1)
            java.lang.String r1 = ", idempotentResume="
            r0.append(r1)
            java.lang.Object r1 = r2.idempotentResume
            r0.append(r1)
            java.lang.String r1 = ", cancelCause="
            r0.append(r1)
            java.lang.Throwable r1 = r2.cancelCause
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
