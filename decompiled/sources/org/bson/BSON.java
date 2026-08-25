package org.bson;

/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
public class BSON {
    public static final byte ARRAY = 4;
    public static final byte BINARY = 5;
    public static final byte BOOLEAN = 8;
    public static final byte B_BINARY = 2;
    public static final byte B_FUNC = 1;
    public static final byte B_GENERAL = 0;
    public static final byte B_UUID = 3;
    public static final byte CODE = 13;
    public static final byte CODE_W_SCOPE = 15;
    public static final byte DATE = 9;
    public static final byte EOO = 0;
    private static final int FLAG_GLOBAL = 256;
    private static final int[] FLAG_LOOKUP = null;
    public static final byte MAXKEY = 127;
    public static final byte MINKEY = -1;
    public static final byte NULL = 10;
    public static final byte NUMBER = 1;
    public static final byte NUMBER_INT = 16;
    public static final byte NUMBER_LONG = 18;
    public static final byte OBJECT = 3;
    public static final byte OID = 7;
    public static final byte REF = 12;
    public static final byte REGEX = 11;
    public static final byte STRING = 2;
    public static final byte SYMBOL = 14;
    public static final byte TIMESTAMP = 17;
    public static final byte UNDEFINED = 6;
    private static volatile boolean decodeHooks;
    private static final org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> decodingHooks = null;
    private static volatile boolean encodeHooks;
    private static final org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> encodingHooks = null;

    static {
            r0 = 65535(0xffff, float:9.1834E-41)
            int[] r0 = new int[r0]
            org.bson.BSON.FLAG_LOOKUP = r0
            r1 = 103(0x67, float:1.44E-43)
            r2 = 256(0x100, float:3.59E-43)
            r0[r1] = r2
            r1 = 105(0x69, float:1.47E-43)
            r2 = 2
            r0[r1] = r2
            r1 = 109(0x6d, float:1.53E-43)
            r2 = 8
            r0[r1] = r2
            r1 = 115(0x73, float:1.61E-43)
            r2 = 32
            r0[r1] = r2
            r1 = 99
            r2 = 128(0x80, float:1.8E-43)
            r0[r1] = r2
            r1 = 120(0x78, float:1.68E-43)
            r2 = 4
            r0[r1] = r2
            r1 = 100
            r2 = 1
            r0[r1] = r2
            r1 = 116(0x74, float:1.63E-43)
            r2 = 16
            r0[r1] = r2
            r1 = 117(0x75, float:1.64E-43)
            r2 = 64
            r0[r1] = r2
            org.bson.util.ClassMap r0 = new org.bson.util.ClassMap
            r0.<init>()
            org.bson.BSON.encodingHooks = r0
            org.bson.util.ClassMap r0 = new org.bson.util.ClassMap
            r0.<init>()
            org.bson.BSON.decodingHooks = r0
            return
    }

    public BSON() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addDecodingHook(java.lang.Class<?> r2, org.bson.Transformer r3) {
            r0 = 1
            org.bson.BSON.decodeHooks = r0
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.decodingHooks
            java.lang.Object r1 = r0.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L15
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.put(r2, r1)
        L15:
            r1.add(r3)
            return
    }

    public static void addEncodingHook(java.lang.Class<?> r2, org.bson.Transformer r3) {
            r0 = 1
            org.bson.BSON.encodeHooks = r0
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.encodingHooks
            java.lang.Object r1 = r0.get(r2)
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L15
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r0.put(r2, r1)
        L15:
            r1.add(r3)
            return
    }

    public static java.lang.Object applyDecodingHooks(java.lang.Object r3) {
            boolean r0 = hasDecodeHooks()
            if (r0 == 0) goto L34
            if (r3 == 0) goto L34
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.decodingHooks
            int r1 = r0.size()
            if (r1 != 0) goto L11
            goto L34
        L11:
            java.lang.Class r1 = r3.getClass()
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L34
            java.util.Iterator r0 = r0.iterator()
            r1 = r3
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r1 = r0.next()
            org.bson.Transformer r1 = (org.bson.Transformer) r1
            java.lang.Object r1 = r1.transform(r3)
            goto L22
        L33:
            r3 = r1
        L34:
            return r3
    }

    public static java.lang.Object applyEncodingHooks(java.lang.Object r3) {
            boolean r0 = hasEncodeHooks()
            if (r0 == 0) goto L34
            if (r3 == 0) goto L34
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.encodingHooks
            int r1 = r0.size()
            if (r1 != 0) goto L11
            goto L34
        L11:
            java.lang.Class r1 = r3.getClass()
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L34
            java.util.Iterator r0 = r0.iterator()
            r1 = r3
        L22:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L33
            java.lang.Object r1 = r0.next()
            org.bson.Transformer r1 = (org.bson.Transformer) r1
            java.lang.Object r1 = r1.transform(r3)
            goto L22
        L33:
            r3 = r1
        L34:
            return r3
    }

    public static void clearAllHooks() {
            clearEncodingHooks()
            clearDecodingHooks()
            return
    }

    public static void clearDecodingHooks() {
            r0 = 0
            org.bson.BSON.decodeHooks = r0
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.decodingHooks
            r0.clear()
            return
    }

    public static void clearEncodingHooks() {
            r0 = 0
            org.bson.BSON.encodeHooks = r0
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.encodingHooks
            r0.clear()
            return
    }

    public static org.bson.BSONObject decode(byte[] r1) {
            org.bson.BasicBSONDecoder r0 = new org.bson.BasicBSONDecoder
            r0.<init>()
            org.bson.BSONObject r1 = r0.readObject(r1)
            return r1
    }

    public static byte[] encode(org.bson.BSONObject r1) {
            org.bson.BasicBSONEncoder r0 = new org.bson.BasicBSONEncoder
            r0.<init>()
            byte[] r1 = r0.encode(r1)
            return r1
    }

    public static java.util.List<org.bson.Transformer> getDecodingHooks(java.lang.Class<?> r1) {
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.decodingHooks
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static java.util.List<org.bson.Transformer> getEncodingHooks(java.lang.Class<?> r1) {
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.encodingHooks
            java.lang.Object r1 = r0.get(r1)
            java.util.List r1 = (java.util.List) r1
            return r1
    }

    public static boolean hasDecodeHooks() {
            boolean r0 = org.bson.BSON.decodeHooks
            return r0
    }

    public static boolean hasEncodeHooks() {
            boolean r0 = org.bson.BSON.encodeHooks
            return r0
    }

    public static int regexFlag(char r3) {
            int[] r0 = org.bson.BSON.FLAG_LOOKUP
            r0 = r0[r3]
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            r1[r2] = r3
            java.lang.String r3 = "Unrecognized flag [%c]"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    public static int regexFlags(java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r4 = r4.toLowerCase()
            char[] r4 = r4.toCharArray()
            int r1 = r4.length
            r2 = 0
        Le:
            if (r0 >= r1) goto L1a
            char r3 = r4[r0]
            int r3 = regexFlag(r3)
            r2 = r2 | r3
            int r0 = r0 + 1
            goto Le
        L1a:
            return r2
    }

    public static java.lang.String regexFlags(int r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int[] r2 = org.bson.BSON.FLAG_LOOKUP
            int r3 = r2.length
            if (r1 >= r3) goto L1a
            r3 = r2[r1]
            r3 = r3 & r4
            if (r3 <= 0) goto L17
            char r3 = (char) r1
            r0.append(r3)
            r2 = r2[r1]
            int r4 = r4 - r2
        L17:
            int r1 = r1 + 1
            goto L6
        L1a:
            if (r4 > 0) goto L21
            java.lang.String r4 = r0.toString()
            return r4
        L21:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Some flags could not be recognized."
            r4.<init>(r0)
            throw r4
    }

    public static void removeDecodingHook(java.lang.Class<?> r0, org.bson.Transformer r1) {
            java.util.List r0 = getDecodingHooks(r0)
            r0.remove(r1)
            return
    }

    public static void removeDecodingHooks(java.lang.Class<?> r1) {
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.decodingHooks
            r0.remove(r1)
            return
    }

    public static void removeEncodingHook(java.lang.Class<?> r0, org.bson.Transformer r1) {
            java.util.List r0 = getEncodingHooks(r0)
            r0.remove(r1)
            return
    }

    public static void removeEncodingHooks(java.lang.Class<?> r1) {
            org.bson.util.ClassMap<java.util.List<org.bson.Transformer>> r0 = org.bson.BSON.encodingHooks
            r0.remove(r1)
            return
    }

    public static int toInt(java.lang.Object r2) {
            if (r2 == 0) goto L38
            boolean r0 = r2 instanceof java.lang.Number
            if (r0 == 0) goto Ld
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            return r2
        Ld:
            boolean r0 = r2 instanceof java.lang.Boolean
            if (r0 == 0) goto L18
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            return r2
        L18:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Can't convert: "
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.Class r2 = r2.getClass()
            java.lang.String r2 = r2.getName()
            r1.append(r2)
            java.lang.String r2 = " to int"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L38:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Argument shouldn't be null"
            r2.<init>(r0)
            throw r2
    }
}
