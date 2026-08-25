package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes2.dex */
public final class GlProgram {
    private static final int GL_SAMPLER_EXTERNAL_2D_Y2Y_EXT = 35815;
    private final java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram.Attribute> attributeByName;
    private final com.google.android.exoplayer2.util.GlProgram.Attribute[] attributes;
    private final int programId;
    private final java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram.Uniform> uniformByName;
    private final com.google.android.exoplayer2.util.GlProgram.Uniform[] uniforms;

    /* JADX INFO: loaded from: classes.dex */
    public static final class Attribute {

        @androidx.annotation.Nullable
        private java.nio.Buffer buffer;
        private final int index;
        private final int location;
        public final java.lang.String name;
        private int size;

        private Attribute(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.index = r2
                r0.location = r3
                return
        }

        public static com.google.android.exoplayer2.util.GlProgram.Attribute create(int r13, int r14) {
                r0 = 1
                int[] r1 = new int[r0]
                r2 = 35722(0x8b8a, float:5.0057E-41)
                r11 = 0
                android.opengl.GLES20.glGetProgramiv(r13, r2, r1, r11)
                r2 = r1[r11]
                byte[] r12 = new byte[r2]
                r2 = r1[r11]
                int[] r3 = new int[r0]
                int[] r5 = new int[r0]
                int[] r7 = new int[r0]
                r4 = 0
                r6 = 0
                r8 = 0
                r10 = 0
                r0 = r13
                r1 = r14
                r9 = r12
                android.opengl.GLES20.glGetActiveAttrib(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = new java.lang.String
                int r1 = com.google.android.exoplayer2.util.GlProgram.access$000(r12)
                r0.<init>(r12, r11, r1)
                int r1 = com.google.android.exoplayer2.util.GlProgram.access$100(r13, r0)
                com.google.android.exoplayer2.util.GlProgram$Attribute r2 = new com.google.android.exoplayer2.util.GlProgram$Attribute
                r2.<init>(r0, r14, r1)
                return r2
        }

        public void bind() throws com.google.android.exoplayer2.util.GlUtil.GlException {
                r7 = this;
                java.nio.Buffer r0 = r7.buffer
                java.lang.String r1 = "call setBuffer before bind"
                java.lang.Object r0 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r0, r1)
                r6 = r0
                java.nio.Buffer r6 = (java.nio.Buffer) r6
                r0 = 34962(0x8892, float:4.8992E-41)
                r1 = 0
                android.opengl.GLES20.glBindBuffer(r0, r1)
                int r1 = r7.location
                int r2 = r7.size
                r3 = 5126(0x1406, float:7.183E-42)
                r4 = 0
                r5 = 0
                android.opengl.GLES20.glVertexAttribPointer(r1, r2, r3, r4, r5, r6)
                int r0 = r7.index
                android.opengl.GLES20.glEnableVertexAttribArray(r0)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                return
        }

        public void setBuffer(float[] r1, int r2) {
                r0 = this;
                java.nio.FloatBuffer r1 = com.google.android.exoplayer2.util.GlUtil.createBuffer(r1)
                r0.buffer = r1
                r0.size = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class Uniform {
        private final float[] floatValue;
        private int intValue;
        private final int location;
        public final java.lang.String name;
        private int texIdValue;
        private int texUnitIndex;
        private final int type;

        private Uniform(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.name = r1
                r0.location = r2
                r0.type = r3
                r1 = 16
                float[] r1 = new float[r1]
                r0.floatValue = r1
                return
        }

        public static com.google.android.exoplayer2.util.GlProgram.Uniform create(int r15, int r16) {
                r11 = r15
                r0 = 1
                int[] r1 = new int[r0]
                r2 = 35719(0x8b87, float:5.0053E-41)
                r12 = 0
                android.opengl.GLES20.glGetProgramiv(r15, r2, r1, r12)
                int[] r13 = new int[r0]
                r2 = r1[r12]
                byte[] r14 = new byte[r2]
                r2 = r1[r12]
                int[] r3 = new int[r0]
                int[] r5 = new int[r0]
                r4 = 0
                r6 = 0
                r8 = 0
                r10 = 0
                r0 = r15
                r1 = r16
                r7 = r13
                r9 = r14
                android.opengl.GLES20.glGetActiveUniform(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
                java.lang.String r0 = new java.lang.String
                int r1 = com.google.android.exoplayer2.util.GlProgram.access$000(r14)
                r0.<init>(r14, r12, r1)
                int r1 = com.google.android.exoplayer2.util.GlProgram.access$200(r15, r0)
                com.google.android.exoplayer2.util.GlProgram$Uniform r2 = new com.google.android.exoplayer2.util.GlProgram$Uniform
                r3 = r13[r12]
                r2.<init>(r0, r1, r3)
                return r2
        }

        public void bind() throws com.google.android.exoplayer2.util.GlUtil.GlException {
                r4 = this;
                int r0 = r4.type
                r1 = 1
                r2 = 0
                switch(r0) {
                    case 5124: goto L88;
                    case 5126: goto L7d;
                    case 35664: goto L72;
                    case 35665: goto L67;
                    case 35675: goto L5c;
                    case 35676: goto L51;
                    case 35678: goto L1c;
                    case 35815: goto L1c;
                    case 36198: goto L1c;
                    default: goto L7;
                }
            L7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Unexpected uniform type: "
                java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
                int r2 = r4.type
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L1c:
                int r0 = r4.texIdValue
                if (r0 == 0) goto L49
                r0 = 33984(0x84c0, float:4.7622E-41)
                int r1 = r4.texUnitIndex
                int r1 = r1 + r0
                android.opengl.GLES20.glActiveTexture(r1)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                int r0 = r4.type
                r1 = 35678(0x8b5e, float:4.9996E-41)
                if (r0 != r1) goto L36
                r0 = 3553(0xde1, float:4.979E-42)
                goto L39
            L36:
                r0 = 36197(0x8d65, float:5.0723E-41)
            L39:
                int r1 = r4.texIdValue
                com.google.android.exoplayer2.util.GlUtil.bindTexture(r0, r1)
                int r0 = r4.location
                int r1 = r4.texUnitIndex
                android.opengl.GLES20.glUniform1i(r0, r1)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                goto L8f
            L49:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "No call to setSamplerTexId() before bind."
                r0.<init>(r1)
                throw r0
            L51:
                int r0 = r4.location
                float[] r3 = r4.floatValue
                android.opengl.GLES20.glUniformMatrix4fv(r0, r1, r2, r3, r2)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                goto L8f
            L5c:
                int r0 = r4.location
                float[] r3 = r4.floatValue
                android.opengl.GLES20.glUniformMatrix3fv(r0, r1, r2, r3, r2)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                goto L8f
            L67:
                int r0 = r4.location
                float[] r3 = r4.floatValue
                android.opengl.GLES20.glUniform3fv(r0, r1, r3, r2)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                goto L8f
            L72:
                int r0 = r4.location
                float[] r3 = r4.floatValue
                android.opengl.GLES20.glUniform2fv(r0, r1, r3, r2)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                goto L8f
            L7d:
                int r0 = r4.location
                float[] r3 = r4.floatValue
                android.opengl.GLES20.glUniform1fv(r0, r1, r3, r2)
                com.google.android.exoplayer2.util.GlUtil.checkGlError()
                goto L8f
            L88:
                int r0 = r4.location
                int r1 = r4.intValue
                android.opengl.GLES20.glUniform1i(r0, r1)
            L8f:
                return
        }

        public void setFloat(float r3) {
                r2 = this;
                float[] r0 = r2.floatValue
                r1 = 0
                r0[r1] = r3
                return
        }

        public void setFloats(float[] r4) {
                r3 = this;
                float[] r0 = r3.floatValue
                int r1 = r4.length
                r2 = 0
                java.lang.System.arraycopy(r4, r2, r0, r2, r1)
                return
        }

        public void setInt(int r1) {
                r0 = this;
                r0.intValue = r1
                return
        }

        public void setSamplerTexId(int r1, int r2) {
                r0 = this;
                r0.texIdValue = r1
                r0.texUnitIndex = r2
                return
        }
    }

    public GlProgram(android.content.Context r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException, com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = this;
            java.lang.String r2 = loadAsset(r1, r2)
            java.lang.String r1 = loadAsset(r1, r3)
            r0.<init>(r2, r1)
            return
    }

    public GlProgram(java.lang.String r6, java.lang.String r7) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r5 = this;
            r5.<init>()
            int r0 = android.opengl.GLES20.glCreateProgram()
            r5.programId = r0
            com.google.android.exoplayer2.util.GlUtil.checkGlError()
            r1 = 35633(0x8b31, float:4.9932E-41)
            addShader(r0, r1, r6)
            r6 = 35632(0x8b30, float:4.9931E-41)
            addShader(r0, r6, r7)
            android.opengl.GLES20.glLinkProgram(r0)
            r6 = 1
            int[] r7 = new int[r6]
            r1 = 0
            r7[r1] = r1
            r2 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r0, r2, r7, r1)
            r7 = r7[r1]
            if (r7 != r6) goto L2d
            r7 = 1
            goto L2e
        L2d:
            r7 = 0
        L2e:
            java.lang.String r2 = "Unable to link shader program: \n"
            java.lang.StringBuilder r2 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r2)
            java.lang.String r3 = android.opengl.GLES20.glGetProgramInfoLog(r0)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.google.android.exoplayer2.util.GlUtil.checkGlException(r7, r2)
            android.opengl.GLES20.glUseProgram(r0)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r5.attributeByName = r7
            int[] r7 = new int[r6]
            r2 = 35721(0x8b89, float:5.0056E-41)
            android.opengl.GLES20.glGetProgramiv(r0, r2, r7, r1)
            r0 = r7[r1]
            com.google.android.exoplayer2.util.GlProgram$Attribute[] r0 = new com.google.android.exoplayer2.util.GlProgram.Attribute[r0]
            r5.attributes = r0
            r0 = 0
        L5b:
            r2 = r7[r1]
            if (r0 >= r2) goto L73
            int r2 = r5.programId
            com.google.android.exoplayer2.util.GlProgram$Attribute r2 = com.google.android.exoplayer2.util.GlProgram.Attribute.create(r2, r0)
            com.google.android.exoplayer2.util.GlProgram$Attribute[] r3 = r5.attributes
            r3[r0] = r2
            java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram$Attribute> r3 = r5.attributeByName
            java.lang.String r4 = r2.name
            r3.put(r4, r2)
            int r0 = r0 + 1
            goto L5b
        L73:
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r5.uniformByName = r7
            int[] r6 = new int[r6]
            int r7 = r5.programId
            r0 = 35718(0x8b86, float:5.0052E-41)
            android.opengl.GLES20.glGetProgramiv(r7, r0, r6, r1)
            r7 = r6[r1]
            com.google.android.exoplayer2.util.GlProgram$Uniform[] r7 = new com.google.android.exoplayer2.util.GlProgram.Uniform[r7]
            r5.uniforms = r7
            r7 = 0
        L8b:
            r0 = r6[r1]
            if (r7 >= r0) goto La3
            int r0 = r5.programId
            com.google.android.exoplayer2.util.GlProgram$Uniform r0 = com.google.android.exoplayer2.util.GlProgram.Uniform.create(r0, r7)
            com.google.android.exoplayer2.util.GlProgram$Uniform[] r2 = r5.uniforms
            r2[r7] = r0
            java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram$Uniform> r2 = r5.uniformByName
            java.lang.String r3 = r0.name
            r2.put(r3, r0)
            int r7 = r7 + 1
            goto L8b
        La3:
            com.google.android.exoplayer2.util.GlUtil.checkGlError()
            return
    }

    public static /* synthetic */ int access$000(byte[] r0) {
            int r0 = getCStringLength(r0)
            return r0
    }

    public static /* synthetic */ int access$100(int r0, java.lang.String r1) {
            int r0 = getAttributeLocation(r0, r1)
            return r0
    }

    public static /* synthetic */ int access$200(int r0, java.lang.String r1) {
            int r0 = getUniformLocation(r0, r1)
            return r0
    }

    private static void addShader(int r4, int r5, java.lang.String r6) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            int r5 = android.opengl.GLES20.glCreateShader(r5)
            android.opengl.GLES20.glShaderSource(r5, r6)
            android.opengl.GLES20.glCompileShader(r5)
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 0
            r1[r2] = r2
            r3 = 35713(0x8b81, float:5.0045E-41)
            android.opengl.GLES20.glGetShaderiv(r5, r3, r1, r2)
            r1 = r1[r2]
            if (r1 != r0) goto L1b
            goto L1c
        L1b:
            r0 = 0
        L1c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = android.opengl.GLES20.glGetShaderInfoLog(r5)
            r1.append(r2)
            java.lang.String r2 = ", source: "
            r1.append(r2)
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.google.android.exoplayer2.util.GlUtil.checkGlException(r0, r6)
            android.opengl.GLES20.glAttachShader(r4, r5)
            android.opengl.GLES20.glDeleteShader(r5)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()
            return
    }

    private static int getAttributeLocation(int r0, java.lang.String r1) {
            int r0 = android.opengl.GLES20.glGetAttribLocation(r0, r1)
            return r0
    }

    private int getAttributeLocation(java.lang.String r2) {
            r1 = this;
            int r0 = r1.programId
            int r2 = getAttributeLocation(r0, r2)
            return r2
    }

    private static int getCStringLength(byte[] r2) {
            r0 = 0
        L1:
            int r1 = r2.length
            if (r0 >= r1) goto Lc
            r1 = r2[r0]
            if (r1 != 0) goto L9
            return r0
        L9:
            int r0 = r0 + 1
            goto L1
        Lc:
            int r2 = r2.length
            return r2
    }

    private static int getUniformLocation(int r0, java.lang.String r1) {
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)
            return r0
    }

    public static java.lang.String loadAsset(android.content.Context r1, java.lang.String r2) throws java.io.IOException {
            r0 = 0
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Throwable -> L15
            java.io.InputStream r0 = r1.open(r2)     // Catch: java.lang.Throwable -> L15
            byte[] r1 = com.google.android.exoplayer2.util.Util.toByteArray(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r1 = com.google.android.exoplayer2.util.Util.fromUtf8Bytes(r1)     // Catch: java.lang.Throwable -> L15
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            return r1
        L15:
            r1 = move-exception
            com.google.android.exoplayer2.util.Util.closeQuietly(r0)
            throw r1
    }

    public void bindAttributesAndUniforms() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r5 = this;
            com.google.android.exoplayer2.util.GlProgram$Attribute[] r0 = r5.attributes
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto Lf
            r4 = r0[r3]
            r4.bind()
            int r3 = r3 + 1
            goto L5
        Lf:
            com.google.android.exoplayer2.util.GlProgram$Uniform[] r0 = r5.uniforms
            int r1 = r0.length
        L12:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            r3.bind()
            int r2 = r2 + 1
            goto L12
        L1c:
            return
    }

    public void delete() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r1 = this;
            int r0 = r1.programId
            android.opengl.GLES20.glDeleteProgram(r0)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()
            return
    }

    public int getAttributeArrayLocationAndEnable(java.lang.String r1) throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r0 = this;
            int r1 = r0.getAttributeLocation(r1)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()
            return r1
    }

    public int getUniformLocation(java.lang.String r2) {
            r1 = this;
            int r0 = r1.programId
            int r2 = getUniformLocation(r0, r2)
            return r2
    }

    public void setBufferAttribute(java.lang.String r2, float[] r3, int r4) {
            r1 = this;
            java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram$Attribute> r0 = r1.attributeByName
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.util.GlProgram$Attribute r2 = (com.google.android.exoplayer2.util.GlProgram.Attribute) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.GlProgram$Attribute r2 = (com.google.android.exoplayer2.util.GlProgram.Attribute) r2
            r2.setBuffer(r3, r4)
            return
    }

    public void setFloatUniform(java.lang.String r2, float r3) {
            r1 = this;
            java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram$Uniform> r0 = r1.uniformByName
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.util.GlProgram$Uniform r2 = (com.google.android.exoplayer2.util.GlProgram.Uniform) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.GlProgram$Uniform r2 = (com.google.android.exoplayer2.util.GlProgram.Uniform) r2
            r2.setFloat(r3)
            return
    }

    public void setFloatsUniform(java.lang.String r2, float[] r3) {
            r1 = this;
            java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram$Uniform> r0 = r1.uniformByName
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.util.GlProgram$Uniform r2 = (com.google.android.exoplayer2.util.GlProgram.Uniform) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.GlProgram$Uniform r2 = (com.google.android.exoplayer2.util.GlProgram.Uniform) r2
            r2.setFloats(r3)
            return
    }

    public void setIntUniform(java.lang.String r2, int r3) {
            r1 = this;
            java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram$Uniform> r0 = r1.uniformByName
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.util.GlProgram$Uniform r2 = (com.google.android.exoplayer2.util.GlProgram.Uniform) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.GlProgram$Uniform r2 = (com.google.android.exoplayer2.util.GlProgram.Uniform) r2
            r2.setInt(r3)
            return
    }

    public void setSamplerTexIdUniform(java.lang.String r2, int r3, int r4) {
            r1 = this;
            java.util.Map<java.lang.String, com.google.android.exoplayer2.util.GlProgram$Uniform> r0 = r1.uniformByName
            java.lang.Object r2 = r0.get(r2)
            com.google.android.exoplayer2.util.GlProgram$Uniform r2 = (com.google.android.exoplayer2.util.GlProgram.Uniform) r2
            java.lang.Object r2 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r2)
            com.google.android.exoplayer2.util.GlProgram$Uniform r2 = (com.google.android.exoplayer2.util.GlProgram.Uniform) r2
            r2.setSamplerTexId(r3, r4)
            return
    }

    public void use() throws com.google.android.exoplayer2.util.GlUtil.GlException {
            r1 = this;
            int r0 = r1.programId
            android.opengl.GLES20.glUseProgram(r0)
            com.google.android.exoplayer2.util.GlUtil.checkGlError()
            return
    }
}
