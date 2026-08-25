package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes2.dex */
class GuidelineReference extends androidx.constraintlayout.core.widgets.analyzer.WidgetRun {
    public GuidelineReference(androidx.constraintlayout.core.widgets.ConstraintWidget r2) {
            r1 = this;
            r1.<init>(r2)
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r2.horizontalRun
            r0.clear()
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r2.verticalRun
            r0.clear()
            androidx.constraintlayout.core.widgets.Guideline r2 = (androidx.constraintlayout.core.widgets.Guideline) r2
            int r2 = r2.getOrientation()
            r1.orientation = r2
            return
    }

    private void addDependency(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            r0.add(r2)
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r2 = r2.targets
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.start
            r2.add(r0)
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void apply() {
            r5 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.Guideline r0 = (androidx.constraintlayout.core.widgets.Guideline) r0
            int r1 = r0.getRelativeBegin()
            int r2 = r0.getRelativeEnd()
            r0.getRelativePercent()
            int r0 = r0.getOrientation()
            r3 = 1
            r4 = -1
            if (r0 != r3) goto L96
            if (r1 == r4) goto L3c
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mParent
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r2 = r2.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.start
            r0.add(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.start
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            r0.margin = r1
            goto L82
        L3c:
            if (r2 == r4) goto L62
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mParent
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            int r1 = -r2
            r0.margin = r1
            goto L82
        L62:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            r0.delegateToWidgetRun = r3
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mParent
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r1 = r1.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            r0.add(r1)
        L82:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            r5.addDependency(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.HorizontalWidgetRun r0 = r0.horizontalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            r5.addDependency(r0)
            goto L113
        L96:
            if (r1 == r4) goto Lbb
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.mParent
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r2 = r2.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r2.start
            r0.add(r2)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2 = r5.start
            r0.add(r2)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            r0.margin = r1
            goto L101
        Lbb:
            if (r2 == r4) goto Le1
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mParent
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            r0.add(r1)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            int r1 = -r2
            r0.margin = r1
            goto L101
        Le1:
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r5.start
            r0.delegateToWidgetRun = r3
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r0 = r0.targets
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r1 = r1.mParent
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r1 = r1.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r1.end
            r0.add(r1)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r0.mParent
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.Dependency> r0 = r0.dependencies
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r5.start
            r0.add(r1)
        L101:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.start
            r5.addDependency(r0)
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r5.widget
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = r0.verticalRun
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.end
            r5.addDependency(r0)
        L113:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public void applyToWidget() {
            r2 = this;
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.Guideline r0 = (androidx.constraintlayout.core.widgets.Guideline) r0
            int r0 = r0.getOrientation()
            r1 = 1
            if (r0 != r1) goto L15
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            int r1 = r1.value
            r0.setX(r1)
            goto L1e
        L15:
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r1 = r2.start
            int r1 = r1.value
            r0.setY(r1)
        L1e:
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final void clear() {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r1.start
            r0.clear()
            return
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun
    public final boolean supportsWrapComputation() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // androidx.constraintlayout.core.widgets.analyzer.WidgetRun, androidx.constraintlayout.core.widgets.analyzer.Dependency
    public void update(androidx.constraintlayout.core.widgets.analyzer.Dependency r3) {
            r2 = this;
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = r2.start
            boolean r0 = r3.readyToSolve
            if (r0 != 0) goto L7
            return
        L7:
            boolean r0 = r3.resolved
            if (r0 == 0) goto Lc
            return
        Lc:
            java.util.List<androidx.constraintlayout.core.widgets.analyzer.DependencyNode> r3 = r3.targets
            r0 = 0
            java.lang.Object r3 = r3.get(r0)
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r3 = (androidx.constraintlayout.core.widgets.analyzer.DependencyNode) r3
            androidx.constraintlayout.core.widgets.ConstraintWidget r0 = r2.widget
            androidx.constraintlayout.core.widgets.Guideline r0 = (androidx.constraintlayout.core.widgets.Guideline) r0
            r1 = 1056964608(0x3f000000, float:0.5)
            int r3 = r3.value
            float r3 = (float) r3
            float r0 = r0.getRelativePercent()
            float r0 = r0 * r3
            float r0 = r0 + r1
            int r3 = (int) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r2.start
            r0.resolve(r3)
            return
    }
}
