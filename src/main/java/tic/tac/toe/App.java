/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tic.tac.toe;

public class App {
  Game game;
  App() {
    game = new Game();
  }
  public String displayGame() {
    return game.displayGame();
  }

  public String getGreeting() {
    return game.getGreeting();
  }

  public static void main(String[] args) {
    
    System.out.println(new Game().getGreeting());
  }
}
