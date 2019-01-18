import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PrinterFrame extends JFrame {

	private final JButton botaoOk;
	private final JButton botaoCancelar;
	private final JButton botaoSetup;
	private final JButton botaoAjuda;
	
	private final JPanel direita;
	
	public PrinterFrame(){
		
		super("Printer");
		setLayout(new FlowLayout());
		
		
		botaoOk = new JButton("Ok");
		botaoCancelar = new JButton("Cancelar");
		botaoSetup = new JButton("Setup");
		botaoAjuda = new JButton("Ajuda");
		
		direita = new JPanel();
		
		
		direita.setLayout(new GridLayout(4, 1, 5, 5));
		
		
		direita.add(botaoOk);
		direita.add(botaoCancelar);
		direita.add(botaoSetup);
		direita.add(botaoAjuda);
		
		
		add(direita, BorderLayout.EAST);
		
	}
	
}
