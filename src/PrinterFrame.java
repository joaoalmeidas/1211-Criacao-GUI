import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class PrinterFrame extends JFrame {
	
	private final JPanel externo;

	private final JButton botaoOk;
	private final JButton botaoCancelar;
	private final JButton botaoSetup;
	private final JButton botaoAjuda;
	
	private final JPanel direita;
	
	private final JLabel labelImpressora;
	
	private final JPanel configuracoes;
	private final JPanel panelChecks;
	private final JPanel panelRadios;
	
	private final JCheckBox checkImagem;
	private final JCheckBox checkTexto;
	private final JCheckBox checkCodigo;
	
	private final JRadioButton radioSelecao;
	private final JRadioButton radioTudo;
	private final JRadioButton radioApplet;
	private final ButtonGroup grupoBotoes;
	
	private final JTextArea text1;
	private final JTextArea text2;
	private final JTextArea text3;
	
	private final JPanel panelQualidade;
	private final JLabel labelQualidade;
	private final JComboBox<String> qualidade;
	private final String[] nomeQualidade = {"Alto", "Médio", "Baixo"};
	private final JCheckBox checkPrint;

	
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
		
		externo = new JPanel();
		externo.setLayout(new GridLayout(3, 1));
		
		labelImpressora = new JLabel("Impressora: Minha Impressora");
		
		externo.add(labelImpressora);
		
		configuracoes = new JPanel();
		
		configuracoes.setLayout(new FlowLayout());
		
		panelChecks = new JPanel();
		panelChecks.setLayout(new GridLayout(3, 1));
		
		text1 = new JTextArea(4, 4);
		text2 = new JTextArea(4, 3);
		text3 = new JTextArea(4, 4);
		
		configuracoes.add(text1);
		
		checkImagem = new JCheckBox("Imagem");
		checkTexto = new JCheckBox("Texto");
		checkCodigo = new JCheckBox("Código");
		
		panelChecks.add(checkImagem);
		panelChecks.add(checkTexto);
		panelChecks.add(checkCodigo);
		
		configuracoes.add(panelChecks);
		
		configuracoes.add(text2);
		
		panelRadios = new JPanel();
		panelRadios.setLayout(new GridLayout(3, 1));
		grupoBotoes = new ButtonGroup();
		
		radioSelecao = new JRadioButton("Seleção");
		grupoBotoes.add(radioSelecao);
		radioTudo = new JRadioButton("Tudo");
		grupoBotoes.add(radioTudo);
		radioApplet = new JRadioButton("Applet");
		grupoBotoes.add(radioApplet);
		
		panelRadios.add(radioSelecao);
		panelRadios.add(radioTudo);
		panelRadios.add(radioApplet);
		
		configuracoes.add(panelRadios);
		
		configuracoes.add(text3);
		
		externo.add(configuracoes);
		
		panelQualidade = new JPanel();
		panelQualidade.setLayout(new FlowLayout());
		
		labelQualidade = new JLabel("Qualidade da impressão:");
		qualidade = new JComboBox<String>(nomeQualidade);
		checkPrint = new JCheckBox("Imprimir para arquivo");
		
		panelQualidade.add(labelQualidade);
		panelQualidade.add(qualidade);
		panelQualidade.add(checkPrint);
		
		externo.add(panelQualidade);
		
		add(externo);
		add(direita);
		
	}
	
}
