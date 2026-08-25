package androidx.constraintlayout.core.widgets.analyzer;

/* JADX INFO: loaded from: classes.dex */
class BaselineDimensionDependency extends androidx.constraintlayout.core.widgets.analyzer.DimensionDependency {
    public BaselineDimensionDependency(androidx.constraintlayout.core.widgets.analyzer.WidgetRun r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public void update(androidx.constraintlayout.core.widgets.analyzer.DependencyNode r2) {
            r1 = this;
            androidx.constraintlayout.core.widgets.analyzer.WidgetRun r2 = r1.run
            r0 = r2
            androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun r0 = (androidx.constraintlayout.core.widgets.analyzer.VerticalWidgetRun) r0
            androidx.constraintlayout.core.widgets.analyzer.DependencyNode r0 = r0.baseline
            androidx.constraintlayout.core.widgets.ConstraintWidget r2 = r2.widget
            int r2 = r2.getBaselineDistance()
            r0.margin = r2
            r2 = 1
            r1.resolved = r2
            return
    }
}
