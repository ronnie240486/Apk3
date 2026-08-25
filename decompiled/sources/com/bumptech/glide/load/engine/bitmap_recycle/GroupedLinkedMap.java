package com.bumptech.glide.load.engine.bitmap_recycle;

import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;

/* JADX INFO: loaded from: classes3.dex */
class GroupedLinkedMap<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V> {
    private final com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry<K, V> head;
    private final java.util.Map<K, com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry<K, V>> keyToEntry;

    public static class LinkedEntry<K, V> {
        public final K key;
        public com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry<K, V> next;
        public com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry<K, V> prev;
        private java.util.List<V> values;

        public LinkedEntry() {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                return
        }

        public LinkedEntry(K r1) {
                r0 = this;
                r0.<init>()
                r0.prev = r0
                r0.next = r0
                r0.key = r1
                return
        }

        public void add(V r2) {
                r1 = this;
                java.util.List<V> r0 = r1.values
                if (r0 != 0) goto Lb
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.values = r0
            Lb:
                java.util.List<V> r0 = r1.values
                r0.add(r2)
                return
        }

        @androidx.annotation.Nullable
        public V removeLast() {
                r2 = this;
                int r0 = r2.size()
                if (r0 <= 0) goto Lf
                java.util.List<V> r1 = r2.values
                int r0 = r0 + (-1)
                java.lang.Object r0 = r1.remove(r0)
                goto L10
            Lf:
                r0 = 0
            L10:
                return r0
        }

        public int size() {
                r1 = this;
                java.util.List<V> r0 = r1.values
                if (r0 == 0) goto L9
                int r0 = r0.size()
                goto La
            L9:
                r0 = 0
            La:
                return r0
        }
    }

    public GroupedLinkedMap() {
            r2 = this;
            r2.<init>()
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry r0 = new com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry
            r1 = 0
            r0.<init>(r1)
            r2.head = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r2.keyToEntry = r0
            return
    }

    private void makeHead(com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry<K, V> r2) {
            r1 = this;
            removeEntry(r2)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V> r0 = r1.head
            r2.prev = r0
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r0 = r0.next
            r2.next = r0
            updateEntry(r2)
            return
    }

    private void makeTail(com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry<K, V> r3) {
            r2 = this;
            removeEntry(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V> r0 = r2.head
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r1 = r0.prev
            r3.prev = r1
            r3.next = r0
            updateEntry(r3)
            return
    }

    private static <K, V> void removeEntry(com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry<K, V> r2) {
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r0 = r2.prev
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r1 = r2.next
            r0.next = r1
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r2 = r2.next
            r2.prev = r0
            return
    }

    private static <K, V> void updateEntry(com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry<K, V> r1) {
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r0 = r1.next
            r0.prev = r1
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r0 = r1.prev
            r0.next = r1
            return
    }

    @androidx.annotation.Nullable
    public V get(K r3) {
            r2 = this;
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V>> r0 = r2.keyToEntry
            java.lang.Object r0 = r0.get(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry r0 = (com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry) r0
            if (r0 != 0) goto L15
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry r0 = new com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry
            r0.<init>(r3)
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V>> r1 = r2.keyToEntry
            r1.put(r3, r0)
            goto L18
        L15:
            r3.offer()
        L18:
            r2.makeHead(r0)
            java.lang.Object r3 = r0.removeLast()
            return r3
    }

    public void put(K r3, V r4) {
            r2 = this;
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V>> r0 = r2.keyToEntry
            java.lang.Object r0 = r0.get(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry r0 = (com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap.LinkedEntry) r0
            if (r0 != 0) goto L18
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry r0 = new com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry
            r0.<init>(r3)
            r2.makeTail(r0)
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V>> r1 = r2.keyToEntry
            r1.put(r3, r0)
            goto L1b
        L18:
            r3.offer()
        L1b:
            r0.add(r4)
            return
    }

    @androidx.annotation.Nullable
    public V removeLast() {
            r3 = this;
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V> r0 = r3.head
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r0 = r0.prev
        L4:
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V> r1 = r3.head
            boolean r1 = r0.equals(r1)
            if (r1 != 0) goto L27
            java.lang.Object r1 = r0.removeLast()
            if (r1 == 0) goto L13
            return r1
        L13:
            removeEntry(r0)
            java.util.Map<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V>> r1 = r3.keyToEntry
            K r2 = r0.key
            r1.remove(r2)
            K r1 = r0.key
            com.bumptech.glide.load.engine.bitmap_recycle.Poolable r1 = (com.bumptech.glide.load.engine.bitmap_recycle.Poolable) r1
            r1.offer()
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r0 = r0.prev
            goto L4
        L27:
            r0 = 0
            return r0
    }

    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "GroupedLinkedMap( "
            r0.<init>(r1)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V> r1 = r4.head
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r1 = r1.next
            r2 = 0
        Lc:
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K extends com.bumptech.glide.load.engine.bitmap_recycle.Poolable, V> r3 = r4.head
            boolean r3 = r1.equals(r3)
            if (r3 != 0) goto L34
            r2 = 1
            r3 = 123(0x7b, float:1.72E-43)
            r0.append(r3)
            K r3 = r1.key
            r0.append(r3)
            r3 = 58
            r0.append(r3)
            int r3 = r1.size()
            r0.append(r3)
            java.lang.String r3 = "}, "
            r0.append(r3)
            com.bumptech.glide.load.engine.bitmap_recycle.GroupedLinkedMap$LinkedEntry<K, V> r1 = r1.next
            goto Lc
        L34:
            if (r2 == 0) goto L43
            int r1 = r0.length()
            int r1 = r1 + (-2)
            int r2 = r0.length()
            r0.delete(r1, r2)
        L43:
            java.lang.String r1 = " )"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
