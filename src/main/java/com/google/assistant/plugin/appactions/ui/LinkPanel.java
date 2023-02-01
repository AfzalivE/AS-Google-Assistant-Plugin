package com.google.assistant.plugin.appactions.ui;

import com.intellij.ui.components.labels.LinkLabel;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.Icon;
import javax.swing.JPanel;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: LinkPanel.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b��\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/assistant/plugin/appactions/ui/LinkPanel;", "Ljavax/swing/Box;", "()V", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/LinkPanel.class */
public final class LinkPanel extends Box {
    public LinkPanel() {
        super(0);
        setBorder(BorderFactory.createEmptyBorder(40, 0, 10, 0));
        LinkLabel linkLabel = new LinkLabel("Legal Notices", (Icon) null, LinkPanelLegalListener.INSTANCE);
        linkLabel.setFont(new Font("Dialog", 0, 12));
        linkLabel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        linkLabel.setHorizontalAlignment(0);
        LinkLabel linkLabel2 = new LinkLabel("Send Feedback", (Icon) null, LinkPanel$feedback$1.INSTANCE);
        linkLabel2.setFont(new Font("Dialog", 0, 12));
        linkLabel2.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        linkLabel2.setHorizontalAlignment(0);
        JPanel $this$apply = new JPanel(new BorderLayout());
        $this$apply.add(linkLabel, "Center");
        Unit unit = Unit.INSTANCE;
        add((Component) $this$apply);
        JPanel $this$apply2 = new JPanel(new BorderLayout());
        $this$apply2.add(linkLabel2, "Center");
        Unit unit2 = Unit.INSTANCE;
        add((Component) $this$apply2);
    }
}
