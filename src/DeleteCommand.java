
	public class DeleteCommand implements Command {
		private Memento memento = new Memento();

		public Memento getMemento() {
			return memento;
		}

		public void setMemento(Memento memento) {
			this.memento = memento;
		}

		@Override
		public void execute() {
			
			Section sec = DocumentManager.getInstance().getSectiune();
			this.memento.setState(sec);
			DocumentManager.getInstance().setHistory(this);
			Element e = sec.getLastElement();
			if (e != null)
			{
				sec.remove(e);
			}
		}

		@Override
		public void unexecute() {
			// TODO Auto-generated method stub
			
			DocumentManager.getInstance().setSectiune((Section)this.memento.getState());
			
		}

	}
