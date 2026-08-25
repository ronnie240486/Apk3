package kotlinx.coroutines.internal;

/* JADX INFO: compiled from: LockFreeLinkedList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ-\u0010\u0007\u001a\u00020\u0005\"\u000e\b\u0000\u0010\u0003\u0018\u0001*\u00060\u0001j\u0002`\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0086\bJ\u0006\u0010\t\u001a\u00020\bJ\u000f\u0010\f\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/internal/LockFreeLinkedListHead;", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "Lkotlinx/coroutines/internal/Node;", "T", "Lkotlin/Function1;", "", "block", "forEach", "", "remove", "validate$kotlinx_coroutines_core", "()V", "validate", "", "isEmpty", "()Z", "isRemoved", "<init>", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
public class LockFreeLinkedListHead extends kotlinx.coroutines.internal.LockFreeLinkedListNode {
    public LockFreeLinkedListHead() {
            r0 = this;
            r0.<init>()
            return
    }

    public final /* synthetic */ <T extends kotlinx.coroutines.internal.LockFreeLinkedListNode> void forEach(kotlin.jvm.functions.Function1<? super T, kotlin.Unit> r4) {
            r3 = this;
            java.lang.Object r0 = r3.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
        L6:
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r1 != 0) goto L1e
            r1 = 3
            java.lang.String r2 = "T"
            kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(r1, r2)
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.LockFreeLinkedListNode
            if (r1 == 0) goto L19
            r4.invoke(r0)
        L19:
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = r0.getNextNode()
            goto L6
        L1e:
            return
    }

    public final boolean isEmpty() {
            r1 = this;
            java.lang.Object r0 = r1.getNext()
            if (r0 != r1) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    public boolean isRemoved() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Void remove() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "head cannot be removed"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.internal.LockFreeLinkedListNode
    /* JADX INFO: renamed from: remove, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ boolean mo1865remove() {
            r1 = this;
            java.lang.Void r0 = r1.remove()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public final void validate$kotlinx_coroutines_core() {
            r3 = this;
            java.lang.Object r0 = r3.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r1 = r3
        L7:
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r0, r3)
            if (r2 != 0) goto L17
            kotlinx.coroutines.internal.LockFreeLinkedListNode r2 = r0.getNextNode()
            r0.validateNode$kotlinx_coroutines_core(r1, r2)
            r1 = r0
            r0 = r2
            goto L7
        L17:
            java.lang.Object r0 = r3.getNext()
            kotlinx.coroutines.internal.LockFreeLinkedListNode r0 = (kotlinx.coroutines.internal.LockFreeLinkedListNode) r0
            r3.validateNode$kotlinx_coroutines_core(r1, r0)
            return
    }
}
