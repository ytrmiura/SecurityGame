package player.sample;


import player.Agent;
import reward.Reward_Task1;
import task.Task1;

import java.util.Random;

public class AttackAgent_Miura extends Agent{

    Random rand = new Random();


    public AttackAgent_Miura(){

        /**
         * 結果に表示する名前を決めてください．
         **/
        this.name = "Attack三浦";

        /**
         * ゲーム1回目の行動(初手)をきめてください．
         **/
        this.action = 0;

        this.rewardScheme = new Reward_Task1();




    }

    public void strategy(int defense_action,int reward) {


     Random rand = new Random();
        if(rand.nextDouble()<0.69){
            this.action=0;
        }else{
            this.action=1;
        }

        /**
        * ここに行動戦略を書いてください
        *
        * defense_action: 警備側が前回守ったエリア, reward: 前回自分が得たreward
        * actionフィールドに次のステップで攻めるエリアを代入してください
        *
        * */
    }

    @Override
    public int action() { return action; }


    @Override
    public int getReward(int opponent_action) {
        return rewardScheme.getAttackReward(opponent_action,action);
    }
    @Override
    public String get_name(){
        return this.name;
    }

    @Override
    public void afterGame(){}


}
