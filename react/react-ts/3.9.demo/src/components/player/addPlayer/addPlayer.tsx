import { useState } from "react";
import { useDispatch } from "react-redux";
import styles from './styles.module.css';
import { v4 as uuid } from 'uuid';

const AddPlayer = () => {
    const dispatch = useDispatch();

    const [player, setPlayer] = useState({
        id: '',
        name: 'new name',
        email: 'new@email.com',
        score: 0,
        numWins: 0
    });

    const onChangeHandler = (event: any) => {
        setPlayer({
            ...player,
            [event.target.name]: event.target.value,
        });
    }

    const onSubmitHandler = (event: any) => {
        event.preventDefault();
        setPlayer({ ...player, id: uuid() });
        // update the redux store:
        dispatch({ type: 'ADD', payload: player })

    }

    return (
        <div style={{ marginLeft: '100px', marginTop: '25px' }} className={styles.wrapper}>
            <form onSubmit={onSubmitHandler}>
                <label htmlFor = 'name'>Name</label>
                <input id = 'name' type='text' name='name' value={player.name} onChange={onChangeHandler}></input>
                <br />
                <label htmlFor = 'email'>Email</label>
                <input id = 'email' type='email' name='email' value={player.email} onChange={onChangeHandler}></input>
                <br />
                <label htmlFor = 'score'>Score</label>
                <input id = 'score' type='number' name='score' value={player.score} onChange={onChangeHandler}></input>
                <br />
                <label htmlFor = 'number'>Number</label>
                <input id = 'number' type='number' name='numWins' value={player.numWins} onChange={onChangeHandler}></input>
                <br />
                <input className = 'btn btn-primary' type='submit' value='Add' />
            </form>

            <div className='card' style ={{width: '18rem', margin: 'auto', marginTop: '50px'}}>
                <div className='card-body'>
                    <h3 className='card-title'>{player.name}</h3>
                    <h3 className='card-text'>{player.email}</h3>
                    <h3 className='card-text'>{player.score}</h3>
                    <h3 className='card-text'>{player.numWins}</h3>
                </div>
            </div>
        </div>
    )
}

export default AddPlayer;