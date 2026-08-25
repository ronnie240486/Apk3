package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: classes2.dex */
public class CLContainer extends androidx.constraintlayout.core.parser.CLElement {
    public java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> mElements;

    public CLContainer(char[] r1) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mElements = r1
            return
    }

    public static androidx.constraintlayout.core.parser.CLElement allocate(char[] r1) {
            androidx.constraintlayout.core.parser.CLContainer r0 = new androidx.constraintlayout.core.parser.CLContainer
            r0.<init>(r1)
            return r0
    }

    public void add(androidx.constraintlayout.core.parser.CLElement r2) {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r1.mElements
            r0.add(r2)
            return
    }

    public androidx.constraintlayout.core.parser.CLElement get(int r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            r2 = this;
            if (r3 < 0) goto L13
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r2.mElements
            int r0 = r0.size()
            if (r3 >= r0) goto L13
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r2.mElements
            java.lang.Object r3 = r0.get(r3)
            androidx.constraintlayout.core.parser.CLElement r3 = (androidx.constraintlayout.core.parser.CLElement) r3
            return r3
        L13:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r1 = "no element at index "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3, r2)
            throw r0
    }

    public androidx.constraintlayout.core.parser.CLElement get(java.lang.String r4) throws androidx.constraintlayout.core.parser.CLParsingException {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r3.mElements
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.parser.CLElement r1 = (androidx.constraintlayout.core.parser.CLElement) r1
            androidx.constraintlayout.core.parser.CLKey r1 = (androidx.constraintlayout.core.parser.CLKey) r1
            java.lang.String r2 = r1.content()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            androidx.constraintlayout.core.parser.CLElement r4 = r1.getValue()
            return r4
        L23:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r1 = "no element for key <"
            java.lang.String r2 = ">"
            java.lang.String r4 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r4, r2)
            r0.<init>(r4, r3)
            throw r0
    }

    public androidx.constraintlayout.core.parser.CLArray getArray(int r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            r2 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get(r3)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r1 == 0) goto Lb
            androidx.constraintlayout.core.parser.CLArray r0 = (androidx.constraintlayout.core.parser.CLArray) r0
            return r0
        Lb:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r1 = "no array at index "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3, r2)
            throw r0
    }

    public androidx.constraintlayout.core.parser.CLArray getArray(java.lang.String r5) throws androidx.constraintlayout.core.parser.CLParsingException {
            r4 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r4.get(r5)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r1 == 0) goto Lb
            androidx.constraintlayout.core.parser.CLArray r0 = (androidx.constraintlayout.core.parser.CLArray) r0
            return r0
        Lb:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r2 = "no array found for key <"
            java.lang.String r3 = ">, found ["
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r2, r5, r3)
            java.lang.String r2 = r0.getStrClass()
            r5.append(r2)
            java.lang.String r2 = "] : "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
            throw r1
    }

    public androidx.constraintlayout.core.parser.CLArray getArrayOrNull(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.core.parser.CLElement r2 = r1.getOrNull(r2)
            boolean r0 = r2 instanceof androidx.constraintlayout.core.parser.CLArray
            if (r0 == 0) goto Lb
            androidx.constraintlayout.core.parser.CLArray r2 = (androidx.constraintlayout.core.parser.CLArray) r2
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public boolean getBoolean(int r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            r2 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get(r3)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.parser.CLToken
            if (r1 == 0) goto Lf
            androidx.constraintlayout.core.parser.CLToken r0 = (androidx.constraintlayout.core.parser.CLToken) r0
            boolean r3 = r0.getBoolean()
            return r3
        Lf:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r1 = "no boolean at index "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3, r2)
            throw r0
    }

    public boolean getBoolean(java.lang.String r5) throws androidx.constraintlayout.core.parser.CLParsingException {
            r4 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r4.get(r5)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.parser.CLToken
            if (r1 == 0) goto Lf
            androidx.constraintlayout.core.parser.CLToken r0 = (androidx.constraintlayout.core.parser.CLToken) r0
            boolean r5 = r0.getBoolean()
            return r5
        Lf:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r2 = "no boolean found for key <"
            java.lang.String r3 = ">, found ["
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r2, r5, r3)
            java.lang.String r2 = r0.getStrClass()
            r5.append(r2)
            java.lang.String r2 = "] : "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
            throw r1
    }

    public float getFloat(int r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            r2 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get(r3)
            if (r0 == 0) goto Lb
            float r3 = r0.getFloat()
            return r3
        Lb:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r1 = "no float at index "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3, r2)
            throw r0
    }

    public float getFloat(java.lang.String r5) throws androidx.constraintlayout.core.parser.CLParsingException {
            r4 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r4.get(r5)
            if (r0 == 0) goto Lb
            float r5 = r0.getFloat()
            return r5
        Lb:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r2 = "no float found for key <"
            java.lang.String r3 = ">, found ["
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r2, r5, r3)
            java.lang.String r2 = r0.getStrClass()
            r5.append(r2)
            java.lang.String r2 = "] : "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
            throw r1
    }

    public float getFloatOrNaN(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.core.parser.CLElement r2 = r1.getOrNull(r2)
            boolean r0 = r2 instanceof androidx.constraintlayout.core.parser.CLNumber
            if (r0 == 0) goto Ld
            float r2 = r2.getFloat()
            return r2
        Ld:
            r2 = 2143289344(0x7fc00000, float:NaN)
            return r2
    }

    public int getInt(int r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            r2 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get(r3)
            if (r0 == 0) goto Lb
            int r3 = r0.getInt()
            return r3
        Lb:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r1 = "no int at index "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3, r2)
            throw r0
    }

    public int getInt(java.lang.String r5) throws androidx.constraintlayout.core.parser.CLParsingException {
            r4 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r4.get(r5)
            if (r0 == 0) goto Lb
            int r5 = r0.getInt()
            return r5
        Lb:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r2 = "no int found for key <"
            java.lang.String r3 = ">, found ["
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r2, r5, r3)
            java.lang.String r2 = r0.getStrClass()
            r5.append(r2)
            java.lang.String r2 = "] : "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
            throw r1
    }

    public androidx.constraintlayout.core.parser.CLObject getObject(int r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            r2 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get(r3)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r1 == 0) goto Lb
            androidx.constraintlayout.core.parser.CLObject r0 = (androidx.constraintlayout.core.parser.CLObject) r0
            return r0
        Lb:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r1 = "no object at index "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3, r2)
            throw r0
    }

    public androidx.constraintlayout.core.parser.CLObject getObject(java.lang.String r5) throws androidx.constraintlayout.core.parser.CLParsingException {
            r4 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r4.get(r5)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r1 == 0) goto Lb
            androidx.constraintlayout.core.parser.CLObject r0 = (androidx.constraintlayout.core.parser.CLObject) r0
            return r0
        Lb:
            androidx.constraintlayout.core.parser.CLParsingException r1 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r2 = "no object found for key <"
            java.lang.String r3 = ">, found ["
            java.lang.StringBuilder r5 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m25m(r2, r5, r3)
            java.lang.String r2 = r0.getStrClass()
            r5.append(r2)
            java.lang.String r2 = "] : "
            r5.append(r2)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5, r4)
            throw r1
    }

    public androidx.constraintlayout.core.parser.CLObject getObjectOrNull(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.core.parser.CLElement r2 = r1.getOrNull(r2)
            boolean r0 = r2 instanceof androidx.constraintlayout.core.parser.CLObject
            if (r0 == 0) goto Lb
            androidx.constraintlayout.core.parser.CLObject r2 = (androidx.constraintlayout.core.parser.CLObject) r2
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public androidx.constraintlayout.core.parser.CLElement getOrNull(int r2) {
            r1 = this;
            if (r2 < 0) goto L13
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r1.mElements
            int r0 = r0.size()
            if (r2 >= r0) goto L13
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r1.mElements
            java.lang.Object r2 = r0.get(r2)
            androidx.constraintlayout.core.parser.CLElement r2 = (androidx.constraintlayout.core.parser.CLElement) r2
            return r2
        L13:
            r2 = 0
            return r2
    }

    public androidx.constraintlayout.core.parser.CLElement getOrNull(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r3.mElements
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.parser.CLElement r1 = (androidx.constraintlayout.core.parser.CLElement) r1
            androidx.constraintlayout.core.parser.CLKey r1 = (androidx.constraintlayout.core.parser.CLKey) r1
            java.lang.String r2 = r1.content()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            androidx.constraintlayout.core.parser.CLElement r4 = r1.getValue()
            return r4
        L23:
            r4 = 0
            return r4
    }

    public java.lang.String getString(int r3) throws androidx.constraintlayout.core.parser.CLParsingException {
            r2 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r2.get(r3)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.parser.CLString
            if (r1 == 0) goto Ld
            java.lang.String r3 = r0.content()
            return r3
        Ld:
            androidx.constraintlayout.core.parser.CLParsingException r0 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.String r1 = "no string at index "
            java.lang.String r3 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1, r3)
            r0.<init>(r3, r2)
            throw r0
    }

    public java.lang.String getString(java.lang.String r6) throws androidx.constraintlayout.core.parser.CLParsingException {
            r5 = this;
            androidx.constraintlayout.core.parser.CLElement r0 = r5.get(r6)
            boolean r1 = r0 instanceof androidx.constraintlayout.core.parser.CLString
            if (r1 == 0) goto Ld
            java.lang.String r6 = r0.content()
            return r6
        Ld:
            r1 = 0
            if (r0 == 0) goto L14
            java.lang.String r1 = r0.getStrClass()
        L14:
            androidx.constraintlayout.core.parser.CLParsingException r2 = new androidx.constraintlayout.core.parser.CLParsingException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "no string found for key <"
            r3.append(r4)
            r3.append(r6)
            java.lang.String r6 = ">, found ["
            r3.append(r6)
            r3.append(r1)
            java.lang.String r6 = "] : "
            r3.append(r6)
            r3.append(r0)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6, r5)
            throw r2
    }

    public java.lang.String getStringOrNull(int r2) {
            r1 = this;
            androidx.constraintlayout.core.parser.CLElement r2 = r1.getOrNull(r2)
            boolean r0 = r2 instanceof androidx.constraintlayout.core.parser.CLString
            if (r0 == 0) goto Ld
            java.lang.String r2 = r2.content()
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public java.lang.String getStringOrNull(java.lang.String r2) {
            r1 = this;
            androidx.constraintlayout.core.parser.CLElement r2 = r1.getOrNull(r2)
            boolean r0 = r2 instanceof androidx.constraintlayout.core.parser.CLString
            if (r0 == 0) goto Ld
            java.lang.String r2 = r2.content()
            return r2
        Ld:
            r2 = 0
            return r2
    }

    public boolean has(java.lang.String r4) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r3.mElements
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L24
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.parser.CLElement r1 = (androidx.constraintlayout.core.parser.CLElement) r1
            boolean r2 = r1 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r2 == 0) goto L6
            androidx.constraintlayout.core.parser.CLKey r1 = (androidx.constraintlayout.core.parser.CLKey) r1
            java.lang.String r1 = r1.content()
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L6
            r4 = 1
            return r4
        L24:
            r4 = 0
            return r4
    }

    public java.util.ArrayList<java.lang.String> names() {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r1 = r4.mElements
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L25
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.parser.CLElement r2 = (androidx.constraintlayout.core.parser.CLElement) r2
            boolean r3 = r2 instanceof androidx.constraintlayout.core.parser.CLKey
            if (r3 == 0) goto Lb
            androidx.constraintlayout.core.parser.CLKey r2 = (androidx.constraintlayout.core.parser.CLKey) r2
            java.lang.String r2 = r2.content()
            r0.add(r2)
            goto Lb
        L25:
            return r0
    }

    public void put(java.lang.String r4, androidx.constraintlayout.core.parser.CLElement r5) {
            r3 = this;
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r3.mElements
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            androidx.constraintlayout.core.parser.CLElement r1 = (androidx.constraintlayout.core.parser.CLElement) r1
            androidx.constraintlayout.core.parser.CLKey r1 = (androidx.constraintlayout.core.parser.CLKey) r1
            java.lang.String r2 = r1.content()
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L6
            r1.set(r5)
            return
        L22:
            androidx.constraintlayout.core.parser.CLElement r4 = androidx.constraintlayout.core.parser.CLKey.allocate(r4, r5)
            androidx.constraintlayout.core.parser.CLKey r4 = (androidx.constraintlayout.core.parser.CLKey) r4
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r5 = r3.mElements
            r5.add(r4)
            return
    }

    public void putNumber(java.lang.String r2, float r3) {
            r1 = this;
            androidx.constraintlayout.core.parser.CLNumber r0 = new androidx.constraintlayout.core.parser.CLNumber
            r0.<init>(r3)
            r1.put(r2, r0)
            return
    }

    public void remove(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r1 = r4.mElements
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L28
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.parser.CLElement r2 = (androidx.constraintlayout.core.parser.CLElement) r2
            r3 = r2
            androidx.constraintlayout.core.parser.CLKey r3 = (androidx.constraintlayout.core.parser.CLKey) r3
            java.lang.String r3 = r3.content()
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto Lb
            r0.add(r2)
            goto Lb
        L28:
            java.util.Iterator r5 = r0.iterator()
        L2c:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r5.next()
            androidx.constraintlayout.core.parser.CLElement r0 = (androidx.constraintlayout.core.parser.CLElement) r0
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r1 = r4.mElements
            r1.remove(r0)
            goto L2c
        L3e:
            return
    }

    public int size() {
            r1 = this;
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r0 = r1.mElements
            int r0 = r0.size()
            return r0
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.ArrayList<androidx.constraintlayout.core.parser.CLElement> r1 = r4.mElements
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L26
            java.lang.Object r2 = r1.next()
            androidx.constraintlayout.core.parser.CLElement r2 = (androidx.constraintlayout.core.parser.CLElement) r2
            int r3 = r0.length()
            if (r3 <= 0) goto L22
            java.lang.String r3 = "; "
            r0.append(r3)
        L22:
            r0.append(r2)
            goto Lb
        L26:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = super.toString()
            r1.append(r2)
            java.lang.String r2 = " = <"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " >"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            return r0
    }
}
