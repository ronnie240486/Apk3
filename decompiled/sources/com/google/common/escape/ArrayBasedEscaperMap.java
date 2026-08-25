package com.google.common.escape;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
@com.google.common.escape.ElementTypesAreNonnullByDefault
public final class ArrayBasedEscaperMap {
    private static final char[][] EMPTY_REPLACEMENT_ARRAY = null;
    private final char[][] replacementArray;

    static {
            r0 = 2
            int[] r0 = new int[r0]
            r0 = {x0012: FILL_ARRAY_DATA , data: [0, 0} // fill-array
            java.lang.Class<char> r1 = char.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r1, r0)
            char[][] r0 = (char[][]) r0
            com.google.common.escape.ArrayBasedEscaperMap.EMPTY_REPLACEMENT_ARRAY = r0
            return
    }

    private ArrayBasedEscaperMap(char[][] r1) {
            r0 = this;
            r0.<init>()
            r0.replacementArray = r1
            return
    }

    public static com.google.common.escape.ArrayBasedEscaperMap create(java.util.Map<java.lang.Character, java.lang.String> r5) {
            com.google.common.escape.ArrayBasedEscaperMap r0 = new com.google.common.escape.ArrayBasedEscaperMap
            com.google.common.base.Preconditions.checkNotNull(r5)
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Le
            char[][] r5 = com.google.common.escape.ArrayBasedEscaperMap.EMPTY_REPLACEMENT_ARRAY
            goto L46
        Le:
            java.util.Set r1 = r5.keySet()
            java.lang.Object r1 = java.util.Collections.max(r1)
            java.lang.Character r1 = (java.lang.Character) r1
            char r1 = r1.charValue()
            int r1 = r1 + 1
            char[][] r1 = new char[r1][]
            java.util.Set r2 = r5.keySet()
            java.util.Iterator r2 = r2.iterator()
        L28:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r2.next()
            java.lang.Character r3 = (java.lang.Character) r3
            char r4 = r3.charValue()
            java.lang.Object r3 = r5.get(r3)
            java.lang.String r3 = (java.lang.String) r3
            char[] r3 = r3.toCharArray()
            r1[r4] = r3
            goto L28
        L45:
            r5 = r1
        L46:
            r0.<init>(r5)
            return r0
    }

    public final char[][] getReplacementArray() {
            r1 = this;
            char[][] r0 = r1.replacementArray
            return r0
    }
}
