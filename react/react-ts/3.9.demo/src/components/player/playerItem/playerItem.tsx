import { Player } from '../../../types/types';
import styles from './styles.module.css';
import { useDispatch } from 'react-redux';

const PlayerItem = (props: any) => {

    const dispatch = useDispatch();

    const deleteHandler = () => {
        var id = props.player.id;
        props.delete(id);
        dispatch({type: 'DELETE', payload: id})
        // pass this to the redux store
    }
    return (
        <div className={styles.wrapper} onClick = {deleteHandler}>
            <div className={`card ${styles.card}`} style ={{width: '18rem', margin: 'auto', marginBottom: '50px'}}>
                <div className="card-body">
                    <h5 className="card-title">{props.player.name}</h5>
                    <p className="card-text">{props.player.email}</p>
                    <p className="card-text">{props.player.score} points</p>
                    <p className="card-text">{props.player.numWins} wins</p>
                </div>
            </div>
        </div>
    )
}

export default PlayerItem;