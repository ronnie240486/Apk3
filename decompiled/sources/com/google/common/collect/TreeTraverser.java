package com.google.common.collect;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@java.lang.Deprecated
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class TreeTraverser<T> {





    /* JADX INFO: loaded from: classes2.dex */
    public final class BreadthFirstIterator extends com.google.common.collect.UnmodifiableIterator<T> implements com.google.common.collect.PeekingIterator<T> {
        private final java.util.Queue<T> queue;
        public final /* synthetic */ com.google.common.collect.TreeTraverser this$0;

        public BreadthFirstIterator(com.google.common.collect.TreeTraverser r1, T r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.queue = r1
                r1.add(r2)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Queue<T> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }

        @Override // java.util.Iterator, com.google.common.collect.PeekingIterator
        public T next() {
                r3 = this;
                java.util.Queue<T> r0 = r3.queue
                java.lang.Object r0 = r0.remove()
                java.util.Queue<T> r1 = r3.queue
                com.google.common.collect.TreeTraverser r2 = r3.this$0
                java.lang.Iterable r2 = r2.children(r0)
                com.google.common.collect.Iterables.addAll(r1, r2)
                return r0
        }

        @Override // com.google.common.collect.PeekingIterator
        public T peek() {
                r1 = this;
                java.util.Queue<T> r0 = r1.queue
                java.lang.Object r0 = r0.element()
                return r0
        }
    }

    public final class PostOrderIterator extends com.google.common.collect.AbstractIterator<T> {
        private final java.util.ArrayDeque<com.google.common.collect.TreeTraverser.PostOrderNode<T>> stack;
        public final /* synthetic */ com.google.common.collect.TreeTraverser this$0;

        public PostOrderIterator(com.google.common.collect.TreeTraverser r1, T r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.stack = r1
                com.google.common.collect.TreeTraverser$PostOrderNode r2 = r0.expand(r2)
                r1.addLast(r2)
                return
        }

        private com.google.common.collect.TreeTraverser.PostOrderNode<T> expand(T r3) {
                r2 = this;
                com.google.common.collect.TreeTraverser$PostOrderNode r0 = new com.google.common.collect.TreeTraverser$PostOrderNode
                com.google.common.collect.TreeTraverser r1 = r2.this$0
                java.lang.Iterable r1 = r1.children(r3)
                java.util.Iterator r1 = r1.iterator()
                r0.<init>(r3, r1)
                return r0
        }

        @Override // com.google.common.collect.AbstractIterator
        @javax.annotation.CheckForNull
        public final T computeNext() {
                r2 = this;
            L0:
                java.util.ArrayDeque<com.google.common.collect.TreeTraverser$PostOrderNode<T>> r0 = r2.stack
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L30
                java.util.ArrayDeque<com.google.common.collect.TreeTraverser$PostOrderNode<T>> r0 = r2.stack
                java.lang.Object r0 = r0.getLast()
                com.google.common.collect.TreeTraverser$PostOrderNode r0 = (com.google.common.collect.TreeTraverser.PostOrderNode) r0
                java.util.Iterator<T> r1 = r0.childIterator
                boolean r1 = r1.hasNext()
                if (r1 == 0) goto L28
                java.util.Iterator<T> r0 = r0.childIterator
                java.lang.Object r0 = r0.next()
                java.util.ArrayDeque<com.google.common.collect.TreeTraverser$PostOrderNode<T>> r1 = r2.stack
                com.google.common.collect.TreeTraverser$PostOrderNode r0 = r2.expand(r0)
                r1.addLast(r0)
                goto L0
            L28:
                java.util.ArrayDeque<com.google.common.collect.TreeTraverser$PostOrderNode<T>> r1 = r2.stack
                r1.removeLast()
                T r0 = r0.root
                return r0
            L30:
                r2.endOfData()
                r0 = 0
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class PostOrderNode<T> {
        public final java.util.Iterator<T> childIterator;
        public final T root;

        public PostOrderNode(T r1, java.util.Iterator<T> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                r0.root = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.Iterator r1 = (java.util.Iterator) r1
                r0.childIterator = r1
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public final class PreOrderIterator extends com.google.common.collect.UnmodifiableIterator<T> {
        private final java.util.Deque<java.util.Iterator<T>> stack;
        public final /* synthetic */ com.google.common.collect.TreeTraverser this$0;

        public PreOrderIterator(com.google.common.collect.TreeTraverser r1, T r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r0.stack = r1
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.collect.UnmodifiableIterator r2 = com.google.common.collect.Iterators.singletonIterator(r2)
                r1.addLast(r2)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Deque<java.util.Iterator<T>> r0 = r1.stack
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                java.util.Deque<java.util.Iterator<T>> r0 = r3.stack
                java.lang.Object r0 = r0.getLast()
                java.util.Iterator r0 = (java.util.Iterator) r0
                java.lang.Object r1 = r0.next()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L1b
                java.util.Deque<java.util.Iterator<T>> r0 = r3.stack
                r0.removeLast()
            L1b:
                com.google.common.collect.TreeTraverser r0 = r3.this$0
                java.lang.Iterable r0 = r0.children(r1)
                java.util.Iterator r0 = r0.iterator()
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L30
                java.util.Deque<java.util.Iterator<T>> r2 = r3.stack
                r2.addLast(r0)
            L30:
                return r1
        }
    }

    public TreeTraverser() {
            r0 = this;
            r0.<init>()
            return
    }

    @java.lang.Deprecated
    public static <T> com.google.common.collect.TreeTraverser<T> using(com.google.common.base.Function<T, ? extends java.lang.Iterable<T>> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.TreeTraverser$1 r0 = new com.google.common.collect.TreeTraverser$1
            r0.<init>(r1)
            return r0
    }

    @java.lang.Deprecated
    public final com.google.common.collect.FluentIterable<T> breadthFirstTraversal(T r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.TreeTraverser$4 r0 = new com.google.common.collect.TreeTraverser$4
            r0.<init>(r1, r2)
            return r0
    }

    public abstract java.lang.Iterable<T> children(T r1);

    @java.lang.Deprecated
    public final com.google.common.collect.FluentIterable<T> postOrderTraversal(T r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.TreeTraverser$3 r0 = new com.google.common.collect.TreeTraverser$3
            r0.<init>(r1, r2)
            return r0
    }

    @java.lang.Deprecated
    public final com.google.common.collect.FluentIterable<T> preOrderTraversal(T r2) {
            r1 = this;
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.TreeTraverser$2 r0 = new com.google.common.collect.TreeTraverser$2
            r0.<init>(r1, r2)
            return r0
    }
}
