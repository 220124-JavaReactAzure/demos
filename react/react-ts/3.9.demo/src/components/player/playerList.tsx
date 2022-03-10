import { useSelector } from "react-redux";
import { useEffect, useState } from "react";
import {Player} from '../../types/types';
import PlayerItem from "./playerItem/playerItem";

const PlayerList = () => {
    const temp = useSelector((state:any) => state.players);
    const [players, setPlayers] = useState(temp);
    console.log(players);

    const deletePlayer = (id:String) => {
        setPlayers(players.filter((player:Player) => player.id !== id))
    }


    return (
        <>
            {players.map((player:Player) => 
                <PlayerItem delete = {deletePlayer} key = {player.id} player = {player}/>
            )}
        </>
    )
}

export default PlayerList;